package br.com.alura.screenmatch.Model;

import br.com.alura.screenmatch.Exception.ExceptionUnknow;

public class Titulo {
    private String Nome;
    private int AnoDeLancamento;
    private boolean IncluidoNoPlano;
    private double SomaDasAvaliacoes;
    private int TotalDeAvaliacoes;
    private int DuracaoEmMinutos;
    private int CountAvallicoes;

    public Titulo(String nome, int anoDeLancamento) {
        this.Nome = nome;
        this.AnoDeLancamento = anoDeLancamento;
    }

    public Titulo() { }

    public Titulo(TituloOmdb meuTituloOmdb) {
        this.Nome = meuTituloOmdb.title();

        if(meuTituloOmdb.year().length() > 4) {
            throw new ExceptionUnknow("Não consegui converter o ano " +
                    "porque tem mais de 04 caracteres.");
        }
        this.AnoDeLancamento = Integer.valueOf(meuTituloOmdb.year());
        this.DuracaoEmMinutos = Integer.valueOf(meuTituloOmdb.runtime().substring(0, 2));
    }

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
