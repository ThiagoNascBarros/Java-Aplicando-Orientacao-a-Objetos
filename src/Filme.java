public class Filme {

    public String Nome;
    public int AnoDeLancamento;
    public boolean IncluidoNoPlano;
    public double SomaDasAvaliacoes;
    public int TotalDeAvaliacoes;
    public int DuracaoEmMinutos;

    public Filme() { }

    public Filme(String nome, int anoDeLancamento, boolean incluidoNoPlano, double somaDasAvaliacoes, int totalDeAvaliacoes, int duracaoEmMinutos) {
        Nome = nome;
        AnoDeLancamento = anoDeLancamento;
        IncluidoNoPlano = incluidoNoPlano;
        SomaDasAvaliacoes = somaDasAvaliacoes;
        TotalDeAvaliacoes = totalDeAvaliacoes;
        DuracaoEmMinutos = duracaoEmMinutos;
    }

    @Override
    public String toString() {
        return "Filme\n" +
                "Nome = '" + Nome + '\'' +
                ", AnoDeLancamento = " + AnoDeLancamento +
                ", IncluidoNoPlano = " + IncluidoNoPlano +
                ", Avaliacao = " + SomaDasAvaliacoes +
                ", TotalDeAvaliacoes = " + TotalDeAvaliacoes +
                ", DuracaoEmMinutos = " + DuracaoEmMinutos;
    }

    public void exibeFichaTecnica() {
        var verifyPlano = (!IncluidoNoPlano) ? "Não está incluido no seu plano atualmente" : "Está incluido em seu plano!";

        System.out.println("Nome do Filme: " + Nome);
        System.out.println("Ano de lançamento: " + AnoDeLancamento);
        System.out.println("Está incluido no plano? " + verifyPlano);
        System.out.println("Avaliação: " + SomaDasAvaliacoes);
        System.out.println("Duração em Minutos: " + DuracaoEmMinutos);
    }

    public void avaliar(double nota) {
        SomaDasAvaliacoes += nota;
        TotalDeAvaliacoes++;
    }

    public double obterMediaDasAvaliacoes() {
        return SomaDasAvaliacoes / TotalDeAvaliacoes;
    }
}
