package br.com.dias.geniustudy.fontedados;

import br.com.dias.geniustudy.modelo.Professor;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class BancoDeDadosProfessor {

    private String nomeDiretorio = "banco";
    private String nomeArquivo = "professores.txt";

    File diretorio = new File(nomeDiretorio);
    File arquivo = new File(diretorio, nomeArquivo);

    private StringBuffer memoria = new StringBuffer();

    public BancoDeDadosProfessor() {
        criaPastaCasoNaoExista();
        iniciaMemoria();
    }

    private void criaPastaCasoNaoExista() {

        if (!diretorio.exists()) {
            diretorio.mkdirs();
        }

        if (!arquivo.exists()) {
            try {
                arquivo.createNewFile();
            } catch (Exception e) {
                System.out.println("Erro ao criar o arquivo .txt");
            }
        }

    }

    private void iniciaMemoria() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(arquivo));

            String linha;
            memoria.delete(0, memoria.length());
            do {
                linha = reader.readLine();
                if (linha != null) {
                    memoria.append(linha + "\n");
                }
            } while (linha != null);
            reader.close();
        } catch (FileNotFoundException erro) {
            System.out.println("\nArquivo nao encontrado");
        } catch (Exception e) {
            System.out.println("\nErro de Leitura!");
        }
    }

    public void insere(Professor professor) {
        memoria.append(professor.formatoBancoDeDados());
        gravar();
    }

    private void gravar() {
        try {
            BufferedWriter escrita = new BufferedWriter(new FileWriter(arquivo));
            escrita.write(memoria.toString());
            escrita.flush();
            escrita.close();
        } catch (Exception e) {
            System.out.println("\nErro de gravacao!");
        }
    }

}
