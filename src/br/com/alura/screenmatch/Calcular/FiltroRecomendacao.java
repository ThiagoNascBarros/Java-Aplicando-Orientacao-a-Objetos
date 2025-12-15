package br.com.alura.screenmatch.Calcular;

import br.com.alura.screenmatch.Model.Episodio;
import br.com.alura.screenmatch.Model.Filme;
import br.com.alura.screenmatch.Model.Serie;
import br.com.alura.screenmatch.Model.Titulo;

public class FiltroRecomendacao {
    private String recomendacao;

    public void Filtra(Classificavel classificavel) {
        if (classificavel instanceof Filme filme) {
            Validate(classificavel, filme);
        }

        if (classificavel instanceof Serie serie) {
            Validate(classificavel, serie);
        }

        if (classificavel instanceof Episodio episodio) {
            Validate(classificavel, episodio);
        }
    }

    private void Validate(Classificavel classificavel, Titulo titulo) {
        if (classificavel.getClassificacao() >= 4) {
            System.out.println("\"" + titulo.getNome() + "\" está entre os preferidos do momento!");
        }

        else if (classificavel.getClassificacao() >= 2) {
            System.out.println("\"" + titulo.getNome() + "\" muito bem avaliado no momento!");
        }

        else {
            System.out.println("\"" + titulo.getNome() + "\" coloque em sua lista para assistir mais tarde!");
        }
    }

    private void Validate(Classificavel classificavel, Episodio episodio) {
        if (classificavel.getClassificacao() >= 4) {
            System.out.println("\"" + episodio.getNome() + "\" está entre os episodios preferidos do momento!");
        }

        else if (classificavel.getClassificacao() >= 2) {
            System.out.println("\"" + episodio.getNome() + "\" muito bem avaliado no momento!");
        }

        else {
            System.out.println("\"" + episodio.getNome() + "\" coloque em sua lista para assistir mais tarde!");
        }
    }
}
