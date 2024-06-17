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

    private String nomePasta = "banco";
    private String nomeArquivo = "alunos.txt";

    private File pasta = new File(nomePasta);
    private File arquivo = new File(pasta, nomeArquivo);

    public BancoDeDadosAluno() {
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
                
            }
        }
    }

    public void adicionarAluno(Aluno aluno) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(arquivo, true));
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
            BufferedReader reader = new BufferedReader(new FileReader(arquivo));
            String linha;
            while ((linha = reader.readLine()) != null) {
                alunos.add(transformarLinhaEmAluno(linha));
            }
            reader.close();
        } catch (IOException ex) {
            Logger.getLogger(BancoDeDadosAluno.class.getName()).log(Level.SEVERE, null, ex);
        }

        return alunos;
    }

    private Aluno transformarLinhaEmAluno(String linha) {
        String[] partes = linha.split("\\|");
        Aluno aluno = new Aluno(partes[0], partes[1], partes[2]);
        
        return aluno;
    }

    public Aluno pesquisar(String email, String senha) {
       ArrayList<Aluno> alunos = getAlunos();
       
       for(Aluno aluno : alunos) {
           if(aluno.getEmail().equalsIgnoreCase(email) && aluno.getSenha().equals(senha)) {
               return aluno;
           }
       } 
       
       return null;
    }
}
