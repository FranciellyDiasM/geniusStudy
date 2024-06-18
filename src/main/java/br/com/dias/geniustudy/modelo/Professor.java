package br.com.dias.geniustudy.modelo;

import java.util.ArrayList;

public class Professor extends Usuario {

    private ArrayList<Curso> cursos;

    public Professor() {
        cursos = new ArrayList<>();
    }

    public Professor(String nome, String email, String senha) {
        super(nome, email, senha);
        cursos = new ArrayList<>();
    }
    
    public Professor(String nome, String email, String senha, ArrayList<Curso> cursos) {
        super(nome, email, senha);
        this.cursos = cursos;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }

    public void adicionarCurso(Curso curso) {
        cursos.add(curso);
    }

    public String formatoBancoDeDados() {
        StringBuilder sb = new StringBuilder();
        
        sb.append(String.format("%s|%s|%s", getNome(), getEmail(), getSenha()));
        
        for (Curso curso : getCursos()) {
            sb.append("|");
            sb.append(curso.formatoBancoDeDados());
        }
        return sb.toString();
    }

}
