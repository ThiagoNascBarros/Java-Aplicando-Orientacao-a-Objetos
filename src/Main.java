public class Main {
    public static void main(String[] args) {
        Filme velozes_e_furiosos = new Filme();

        velozes_e_furiosos.Nome = "Velozes e furiosos";
        velozes_e_furiosos.AnoDeLancamento = 2016;
        velozes_e_furiosos.SomaDasAvaliacoes = 7.7;
        velozes_e_furiosos.DuracaoEmMinutos = 160;
        velozes_e_furiosos.IncluidoNoPlano = true;

        // Utilizando toString para exibir dados do Objeto Filme
        // System.out.println(velozes_e_furiosos.toString());

        velozes_e_furiosos.exibeFichaTecnica();
        velozes_e_furiosos.avaliar(8);
        velozes_e_furiosos.avaliar(9);
        velozes_e_furiosos.avaliar(3);
        velozes_e_furiosos.avaliar(10);

        System.out.println("\nSoma das avaliações: " + velozes_e_furiosos.SomaDasAvaliacoes);
        System.out.println("Total das avaliações: " + velozes_e_furiosos.TotalDeAvaliacoes);

        System.out.println("\nMédia das avaliações: " + velozes_e_furiosos.obterMediaDasAvaliacoes());
    }
}
