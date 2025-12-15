package br.com.alura.screenmatch.Model;

public class Titulo {
    private String Nome;
    private int AnoDeLancamento;
    private boolean IncluidoNoPlano;
    private double SomaDasAvaliacoes;
    private int TotalDeAvaliacoes;
    private int DuracaoEmMinutos;
    private int CountAvallicoes;

    public void avaliar(double nota) {
        var sum = getSomaDasAvaliacoes();
        sum += nota;
        CountAvallicoes++;
        setSomaDasAvaliacoes(sum);
        setTotalDeAvaliacoes(this.CountAvallicoes);
    }

    public double obterMediaDasAvaliacoes() {
        return getSomaDasAvaliacoes() / getTotalDeAvaliacoes();
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public int getAnoDeLancamento() {
        return AnoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        AnoDeLancamento = anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return IncluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        IncluidoNoPlano = incluidoNoPlano;
    }

    public double getSomaDasAvaliacoes() {
        return SomaDasAvaliacoes;
    }

    public void setSomaDasAvaliacoes(double somaDasAvaliacoes) {
        SomaDasAvaliacoes = somaDasAvaliacoes;
    }

    public int getTotalDeAvaliacoes() {
        return TotalDeAvaliacoes;
    }

    public void setTotalDeAvaliacoes(int totalDeAvaliacoes) {
        TotalDeAvaliacoes = totalDeAvaliacoes;
    }

    public int getDuracaoEmMinutos() {
        return DuracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        DuracaoEmMinutos = duracaoEmMinutos;
    }
}
