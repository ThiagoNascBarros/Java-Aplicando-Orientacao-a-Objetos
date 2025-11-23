package Challenges.Aluno;

class Main {

    public static void main(String[] args) {
        Aluno thiago = new Aluno();

        thiago.Nome = "Thiago do nascimento barros";
        thiago.AnoDeNascimento = 2007;

        thiago.exibirInformacoes(thiago);
    }

}

public class Aluno {

    public String Nome;
    public int AnoDeNascimento;

    public void exibirInformacoes(Aluno aluno) {
        System.out.println("========== Dados do Aluno ==========");
        System.out.println("Nome: " + aluno.Nome);
        System.out.println("Idade: " + aluno.calcularIdade(aluno.AnoDeNascimento));
        System.out.println("====================================");
    }

    public int calcularIdade(int AnoDeNascimento) {
        return 2025 - AnoDeNascimento;
    }

}
