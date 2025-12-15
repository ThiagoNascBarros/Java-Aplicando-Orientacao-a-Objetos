package br.com.alura.screenmatch.Calcular;

import br.com.alura.screenmatch.Model.Titulo;

public class CalculadoraDeTempo {
    private int TempoTotal;

    /*public void Inclui(Filme filme) {
        TempoTotal += filme.getDuracaoEmMinutos();
    }

    public void Inclui(Serie serie) {
        TempoTotal += serie.getDuracaoEmMinutos();
    }*/

    public void Inclui(Titulo titulo) {
        TempoTotal += titulo.getDuracaoEmMinutos();
    }

    public int getTempoTotal() {
        return TempoTotal;
    }

}
