package br.com.alura.screenmatch.Model;

import br.com.alura.screenmatch.Calcular.Classificavel;

public class Filme extends Titulo implements Classificavel {

    public void exibeFichaTecnica() {
        var verifyPlano =
                (!super.isIncluidoNoPlano())
                ? "Não está incluido no seu plano atualmente"
                : "Está incluido em seu plano!";

        System.out.println("\nNome do Filme: " + super.getNome());
        System.out.println("Ano de lançamento: " + super.getAnoDeLancamento());
        System.out.println("Está incluido no plano? " + verifyPlano);
        System.out.println("Avaliação: " + super.getSomaDasAvaliacoes());
        System.out.println("Duração em Minutos: " + super.getDuracaoEmMinutos());
    }

    @Override
    public int getClassificacao() {
        return (int) obterMediaDasAvaliacoes() / 2;
    }
}
