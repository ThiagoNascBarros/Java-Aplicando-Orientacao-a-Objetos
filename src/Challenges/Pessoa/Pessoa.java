package Challenges.Pessoa;

public class Pessoa {

    public String nome;
    public int idade;

    // Criando contrutor para a Classe Pessoa
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void OlaMundo() {
        System.out.println("Olá mundo, eu sou " + nome + " e tenho " + idade + " anos.");
    }

    public static void main(String[] args) {
        // Construindo o objeto Thiago com base na Classe Pessoa
        Pessoa thiago = new Pessoa("Thiago", 18);
        thiago.OlaMundo();
    }
}
