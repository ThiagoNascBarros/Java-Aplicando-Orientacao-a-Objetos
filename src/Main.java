public class Main {
    public static void main(String[] args) {
        Filme velozes_e_furiosos = new Filme();

        velozes_e_furiosos.Nome = "Velozes e furiosos";
        velozes_e_furiosos.AnoDeLancamento = 2016;
        velozes_e_furiosos.Avaliacao = 7.7;
        velozes_e_furiosos.DuracaoEmMinutos = 160;

        System.out.println(velozes_e_furiosos.toString());

    }
}
