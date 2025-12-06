public class Main {
    public static void main(String[] args) {
        Filme velozes_e_furiosos = new Filme();

        velozes_e_furiosos.setNome("Velozes e furiosos");
        velozes_e_furiosos.setAnoDeLancamento(2016);
        velozes_e_furiosos.setDuracaoEmMinutos(160);
        velozes_e_furiosos.setIncluidoNoPlano(true);

        // Utilizando toString para exibir dados do Objeto Filme
        // System.out.println(velozes_e_furiosos.toString());

        velozes_e_furiosos.exibeFichaTecnica();
        velozes_e_furiosos.avaliar(8);
        velozes_e_furiosos.avaliar(9);
        velozes_e_furiosos.avaliar(3);
        velozes_e_furiosos.avaliar(10);

        System.out.println("\nSoma das avaliações: " + velozes_e_furiosos.getSomaDasAvaliacoes());
        System.out.println("Total das avaliações: " + velozes_e_furiosos.getTotalDeAvaliacoes());

        System.out.println("Média das avaliações: " + velozes_e_furiosos.obterMediaDasAvaliacoes());
    }
}
