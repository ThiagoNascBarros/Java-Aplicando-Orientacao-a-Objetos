public class Filme {

    public String Nome;
    public int AnoDeLancamento;
    public boolean IncluidoNoPlano;
    public double Avaliacao;
    public int TotalDeAvaliacoes;
    public int DuracaoEmMinutos;

    public Filme() { }

    public Filme(String nome, int anoDeLancamento, boolean incluidoNoPlano, double avaliacao, int totalDeAvaliacoes, int duracaoEmMinutos) {
        Nome = nome;
        AnoDeLancamento = anoDeLancamento;
        IncluidoNoPlano = incluidoNoPlano;
        Avaliacao = avaliacao;
        TotalDeAvaliacoes = totalDeAvaliacoes;
        DuracaoEmMinutos = duracaoEmMinutos;
    }

    @Override
    public String toString() {
        return "Filme\n" +
                "Nome = '" + Nome + '\'' +
                ", AnoDeLancamento = " + AnoDeLancamento +
                ", IncluidoNoPlano = " + IncluidoNoPlano +
                ", Avaliacao = " + Avaliacao +
                ", TotalDeAvaliacoes = " + TotalDeAvaliacoes +
                ", DuracaoEmMinutos = " + DuracaoEmMinutos;
    }
}
