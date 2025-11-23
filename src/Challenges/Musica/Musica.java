package Challenges.Musica;

public class Musica {

    public String Nome;
    public int AnoDeLancamento;
    private double Avaliacao;
    private int TotalDeAvaliacoes;
    public int DuracaoEmMinutos;

    public static void main(String[] args) {
        var music = new Musica();

        music.Nome = "333";
        music.AnoDeLancamento = 2023;
        music.avaliarMusica(10.0);
        music.DuracaoEmMinutos = 3;

        // Avaliando de novo a música
        music.avaliarMusica(3.0);

        System.out.println("=========================================");
        music.exibeFichaTecnica(music);
        System.out.println("=========================================");
    }

    public void exibeFichaTecnica(Musica music) {
        System.out.println("Nome do Filme: " + Nome);
        System.out.println("Ano de lançamento: " + AnoDeLancamento);
        System.out.println("Avaliação: " + Avaliacao);
        System.out.println("Média de avaliação: " + music.calcularMedia());
        System.out.println("Duração em Minutos: " + DuracaoEmMinutos);
    }

    public void avaliarMusica(double notaParaMusica) {
        Avaliacao += notaParaMusica;
        TotalDeAvaliacoes++;
    }

    public double calcularMedia() {
        return Avaliacao / TotalDeAvaliacoes;
    }
}
