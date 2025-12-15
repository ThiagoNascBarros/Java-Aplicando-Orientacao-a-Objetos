package br.com.alura.screenmatch.Model;

import br.com.alura.screenmatch.Calcular.Classificavel;

public class Serie extends Titulo implements Classificavel {

    private int Temporadas;
    private int EpisodiosPorTemporada;
    private int MinutosPorEpisodios;

    public void exibeFichaTecnica() {
        var verifyPlano = (!super.isIncluidoNoPlano()) ? "Não está incluido no seu plano atualmente" : "Está incluido em seu plano!";

        System.out.println("\nNome da Serie: " + super.getNome());
        System.out.println("Ano de lançamento: " + super.getAnoDeLancamento());
        System.out.println("Está incluido no plano? " + verifyPlano);
        System.out.println("Avaliação: " + super.getSomaDasAvaliacoes());
        System.out.println("Temporadas: " + getTemporadas());
        System.out.println("Episódios por temporada: " + getEpisodiosPorTemporada());
    }

    @Override
    public int getDuracaoEmMinutos() {
        return Temporadas * EpisodiosPorTemporada * MinutosPorEpisodios;
    }

    public int getTemporadas() {
        return Temporadas;
    }

    public void setTemporadas(int temporadas) {
        Temporadas = temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return EpisodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        EpisodiosPorTemporada = episodiosPorTemporada;
    }

    public int getMinutosPorEpisodios() {
        return MinutosPorEpisodios;
    }

    public void setMinutosPorEpisodios(int minutosPorEpisodios) {
        MinutosPorEpisodios = minutosPorEpisodios;
    }

    @Override
    public int getClassificacao() {
        return 8;
    }
}
