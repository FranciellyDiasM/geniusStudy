package br.com.dias.geniustudy.modelo;

public class Aluno extends Usuario {

    public Aluno() {
        super();
    }

    public Aluno(String nome, String email, String senha) {
        super(nome, email, senha);
    }

    public String formatoBancoDeDados() {
        return String.format("%s|%s|%s", getNome(), getEmail(), getSenha());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("nome: ").append(this.getNome()).append("\n");
        sb.append("email: ").append(this.getEmail()).append("\n");
        sb.append("senha: ").append(this.getSenha());
        
        return sb.toString();
    }

}
