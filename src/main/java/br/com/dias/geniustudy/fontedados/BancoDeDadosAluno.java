package br.com.dias.geniustudy.fontedados;

import br.com.dias.geniustudy.modelo.Aluno;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BancoDeDadosAluno {

    private static final String NOME_PASTA = "banco";
    private static final String NOME_ARQUIVO = "alunos.txt";

    private static final File PASTA = new File(NOME_PASTA);
    private static final File ARQUIVO = new File(PASTA, NOME_ARQUIVO);

    public BancoDeDadosAluno() {
        criaArquivoCasoNaoExista();
    }

    private void criaArquivoCasoNaoExista() {
        if (!PASTA.exists()) {
            PASTA.mkdirs();
        }

        if (!ARQUIVO.exists()) {
            try {
                ARQUIVO.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(BancoDeDadosAluno.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void adicionarAluno(Aluno aluno) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(ARQUIVO, true));
            writer.write(aluno.formatoBancoDeDados());
            writer.newLine();
            writer.close();
        } catch (IOException ex) {
            Logger.getLogger(BancoDeDadosAluno.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Aluno> getAlunos() {
        ArrayList<Aluno> alunos = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(NOME_ARQUIVO));
            String linha;
            while ((linha = reader.readLine()) != null) {
                alunos.add(stringToAluno(linha));
            }
            reader.close();
        } catch (IOException ex) {
            Logger.getLogger(BancoDeDadosAluno.class.getName()).log(Level.SEVERE, null, ex);
        }

        return alunos;
    }

    public void atualizarAluno(String email, Aluno alunoAtualizado) {
        try {
            ArrayList<Aluno> alunos = getAlunos();
            BufferedWriter writer = new BufferedWriter(new FileWriter(ARQUIVO));
            for (Aluno aluno : alunos) {
                if (aluno.getEmail().equals(email)) {
                    writer.write(aluno.formatoBancoDeDados());
                } else {
                    writer.write(aluno.formatoBancoDeDados());
                }
                writer.newLine();
            }
            writer.close();
        } catch (IOException ex) {
            Logger.getLogger(BancoDeDadosAluno.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deletarAluno(String email) {
        try {
            ArrayList<Aluno> alunos = getAlunos();
            BufferedWriter writer = new BufferedWriter(new FileWriter(ARQUIVO));
            for (Aluno aluno : alunos) {
                if (!aluno.getEmail().equals(email)) {
                    writer.write(aluno.formatoBancoDeDados());
                    writer.newLine();
                }
            }
            writer.close();
        } catch (IOException ex) {
            Logger.getLogger(BancoDeDadosAluno.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private Aluno stringToAluno(String linha) {
        String[] partes = linha.split("\\|");
        Aluno aluno = new Aluno(partes[0], partes[1], partes[2]);
        
        return aluno;
    }
}
