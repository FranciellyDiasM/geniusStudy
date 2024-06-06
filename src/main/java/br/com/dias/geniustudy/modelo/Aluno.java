package br.com.dias.geniustudy.modelo;

public class Aluno extends Usuario{
   

    public Aluno() {
        super();
    }

    public Aluno(String nome, String email, String senha) {
        super(nome, email, senha);
    }
    
    public String formatoBancoDeDados() {
        return String.format("%s|%s|%s\n", getNome(), getEmail(), getSenha());
    }
}
