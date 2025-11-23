package Challenges.Carro;

class Main {

    public static void main(String[] args) {
        var volks = new Carro();

        volks.Modelo = "Volkswage Palio - SUV";
        volks.Ano = 2012;
        volks.Cor = "Preto";

        volks.exibeFichaTecnica(volks);
    }

}

public class Carro {

    public String Modelo;
    public int Ano;
    public String Cor;

    public void exibeFichaTecnica(Carro carro) {
        System.out.println("========== Dados do Carro ==========");
        System.out.println("Modelo: " + carro.Modelo);
        System.out.println("Ano: " + carro.Ano);
        System.out.println("Idade: " + carro.calcularIdadeDoCarro(carro));
        System.out.println("Cor: " + carro.Cor);
        System.out.println("====================================");
    }

    public int calcularIdadeDoCarro(Carro carro) {
        return 2025 - carro.Ano;
    }

}
