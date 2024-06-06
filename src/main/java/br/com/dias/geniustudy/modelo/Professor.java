/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.dias.geniustudy.modelo;

/**
 *
 * @author frand
 */
public class Professor extends Usuario{

    public Professor() {
    }

    public Professor(String nome, String email, String senha) {
        super(nome, email, senha);
    }
    
    public String formatoBancoDeDados() {
        return String.format("%s|%s|%s\n", getNome(), getEmail(), getSenha());
    }
    
}
