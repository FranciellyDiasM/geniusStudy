package br.com.dias.geniustudy.fontedados;

import br.com.dias.geniustudy.modelo.Curso;
import br.com.dias.geniustudy.modelo.Professor;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BancoDeDadosProfessor {

    private String nomePasta = "banco";
    private String nomeArquivo = "professores.txt";

    private File pasta = new File(nomePasta);
    private File arquivo = new File(pasta, nomeArquivo);

    public BancoDeDadosProfessor() {
        criaArquivoCasoNaoExista();
    }

    private void criaArquivoCasoNaoExista() {
        if (!pasta.exists()) {
            pasta.mkdirs();
        }

        if (!arquivo.exists()) {
            try {
                arquivo.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(BancoDeDadosProfessor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void adicionarProfessor(Professor professor) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(arquivo, true));
            writer.write(professor.formatoBancoDeDados());
            writer.newLine();
            writer.close();
        } catch (IOException ex) {
            Logger.getLogger(BancoDeDadosProfessor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Professor> getProfessores() {
        ArrayList<Professor> professores = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo));
            String linha;
            while ((linha = reader.readLine()) != null) {
                professores.add(stringToProfessor(linha));
            }
            reader.close();
        } catch (IOException ex) {
            Logger.getLogger(BancoDeDadosProfessor.class.getName()).log(Level.SEVERE, null, ex);
        }

        return professores;
    }

    public void atualizarProfessor(String email, Professor professorAtualizado) {
        try {
            ArrayList<Professor> professores = getProfessores();
            BufferedWriter writer = new BufferedWriter(new FileWriter(arquivo));
            for (Professor professor : professores) {
                if (professor.getEmail().equals(email)) {
                    writer.write(professor.formatoBancoDeDados());
                } else {
                    writer.write(professor.formatoBancoDeDados());
                }
                writer.newLine();
            }
            writer.close();
        } catch (IOException ex) {
            Logger.getLogger(BancoDeDadosProfessor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deletarProfessor(String email) {
        try {
            ArrayList<Professor> professores = getProfessores();
            BufferedWriter writer = new BufferedWriter(new FileWriter(arquivo));
            for (Professor professor : professores) {
                if (!professor.getEmail().equals(email)) {
                    writer.write(professor.formatoBancoDeDados());
                    writer.newLine();
                }
            }
            writer.close();
        } catch (IOException ex) {
            Logger.getLogger(BancoDeDadosProfessor.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private Professor stringToProfessor(String linha) {
        String[] partes = linha.split("\\|");
        Professor professor = new Professor(partes[0], partes[1], partes[2]);
        for (int i = 3; i < partes.length; i += 3) {
            Curso curso = new Curso(partes[i], Double.parseDouble(partes[i + 1]), partes[i + 2]);
            professor.adicionarCurso(curso);
        }
        return professor;
    }
}
