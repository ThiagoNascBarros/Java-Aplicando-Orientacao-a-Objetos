public class Filme {

    private String Nome;
    private int AnoDeLancamento;
    private boolean IncluidoNoPlano;
    private double SomaDasAvaliacoes;
    private int TotalDeAvaliacoes;
    private int DuracaoEmMinutos;

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

    public Filme() { }

    public Filme(String nome, int anoDeLancamento, boolean incluidoNoPlano, double somaDasAvaliacoes, int totalDeAvaliacoes, int duracaoEmMinutos) {
        Nome = nome;
        AnoDeLancamento = anoDeLancamento;
        IncluidoNoPlano = incluidoNoPlano;
        SomaDasAvaliacoes = somaDasAvaliacoes;
        TotalDeAvaliacoes = totalDeAvaliacoes;
        DuracaoEmMinutos = duracaoEmMinutos;
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

}
