
package br.com.dias.geniustudy.modelo;

public class Curso {
    private String nome;
    private double valor;
    private String horario;

    public Curso() {
    }

    public Curso(String nome, double valor, String horario) {
        this.nome = nome;
        this.valor = valor;
        this.horario = horario;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }  

    public String formatoBancoDeDados() {
        return String.format("%s|%s|%s", getNome(), getValor(), getHorario());
    }
}
