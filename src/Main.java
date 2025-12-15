import br.com.alura.screenmatch.Calcular.CalculadoraDeTempo;
import br.com.alura.screenmatch.Calcular.FiltroRecomendacao;
import br.com.alura.screenmatch.Model.Episodio;
import br.com.alura.screenmatch.Model.Filme;
import br.com.alura.screenmatch.Model.Serie;

public class Main {
    public static void main(String[] args) {
        Filme velozes_e_furiosos = new Filme();
        Serie OnMyBlock =  new Serie();

        OnMyBlock.setNome("On My Block");
        OnMyBlock.setAnoDeLancamento(2018);
        OnMyBlock.setTemporadas(5);
        OnMyBlock.setEpisodiosPorTemporada(10);
        OnMyBlock.setMinutosPorEpisodios(50);
        System.out.println("Duração para maratonar " + OnMyBlock.getNome() + ":\n" + OnMyBlock.getDuracaoEmMinutos());

        velozes_e_furiosos.setNome("Velozes e furiosos");
        velozes_e_furiosos.setAnoDeLancamento(2016);
        velozes_e_furiosos.setDuracaoEmMinutos(160);
        velozes_e_furiosos.setIncluidoNoPlano(true);

        // Utilizando toString para exibir dados do Objeto Filmef
        // System.out.println(velozes_e_furiosos.toString());

        velozes_e_furiosos.avaliar(8);
        velozes_e_furiosos.avaliar(9);
        velozes_e_furiosos.avaliar(1);
        velozes_e_furiosos.avaliar(10);

        velozes_e_furiosos.exibeFichaTecnica();
        System.out.println("\nSoma das avaliações: " + velozes_e_furiosos.getSomaDasAvaliacoes());
        System.out.println("Total das avaliações: " + velozes_e_furiosos.getTotalDeAvaliacoes());
        System.out.println("Média das avaliações: " + velozes_e_furiosos.obterMediaDasAvaliacoes());
        Filme filmeExemplo = new Filme();
        filmeExemplo.setNome("Loasts e furiosos");
        filmeExemplo.setAnoDeLancamento(2026);
        filmeExemplo.setDuracaoEmMinutos(100);
        filmeExemplo.setIncluidoNoPlano(true);

        CalculadoraDeTempo calc = new  CalculadoraDeTempo();
        calc.Inclui(velozes_e_furiosos);
        calc.Inclui(filmeExemplo);
        calc.Inclui(OnMyBlock);
        System.out.println(calc.getTempoTotal());

        FiltroRecomendacao filtroRecomendacaao = new FiltroRecomendacao();
        filtroRecomendacaao.Filtra(velozes_e_furiosos);
        filtroRecomendacaao.Filtra(OnMyBlock);

        Episodio ep = new  Episodio();
        ep.setNumero(1);
        ep.setNome(OnMyBlock.getNome() + " - A Batalha com os romanos");
        ep.setSerie(OnMyBlock);
        ep.setTotalDeVisualizacoes(200);

        filtroRecomendacaao.Filtra(ep);
    }
}
