/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.dias.geniustudy.fontedados;

import br.com.dias.geniustudy.modelo.Curso;
import br.com.dias.geniustudy.modelo.Professor;
import java.util.ArrayList;

/**
 *
 * @author frand
 */
public class BancoDeDadosCurso {
    
    private BancoDeDadosProfessor bdProfessor;
    
    public BancoDeDadosCurso() {
        bdProfessor = new BancoDeDadosProfessor();
    }
    
    public ArrayList<Curso> pesquisarCursosPorNome(String nome)  {
        ArrayList<Curso> cursosEncontrados = new ArrayList<>();
        ArrayList<Professor> professores = bdProfessor.getProfessores();
        
        for (Professor professor : professores) {
            for (Curso curso : professor.getCursos()) {
                if (curso.getNome().equalsIgnoreCase(nome)) {
                    cursosEncontrados.add(curso);
                }
            }
        }
        return cursosEncontrados;
    }

    public void deletarCursoDeProfessor(String emailProfessor, String nomeCurso)  {
        ArrayList<Professor> professores = bdProfessor.getProfessores();
        
        for (Professor professor : professores) {
            if (professor.getEmail().equals(emailProfessor)) {
                ArrayList<Curso> cursosAtualizados = new ArrayList<>();
                for (Curso curso : professor.getCursos()) {
                    if (!curso.getNome().equalsIgnoreCase(nomeCurso)) {
                        cursosAtualizados.add(curso);
                    }
                }
                professor.setCursos(cursosAtualizados);
                bdProfessor.atualizarProfessor(professor);
                break;
            }
        }
    }

    public void editarCursoDeProfessor(String emailProfessor, String nomeCursoAntigo, Curso cursoAtualizado){
        ArrayList<Professor> professores = bdProfessor.getProfessores();
        
        for (Professor professor : professores) {
            if (professor.getEmail().equals(emailProfessor)) {
                ArrayList<Curso> cursosAtualizados = new ArrayList<>();
                for (Curso curso : professor.getCursos()) {
                    if (curso.getNome().equalsIgnoreCase(nomeCursoAntigo)) {
                        cursosAtualizados.add(cursoAtualizado);
                    } else {
                        cursosAtualizados.add(curso);
                    }
                }
                professor.setCursos(cursosAtualizados);
                bdProfessor.atualizarProfessor(professor);
                break;
            }
        }
    }

}
