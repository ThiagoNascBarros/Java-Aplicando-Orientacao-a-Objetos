package Challenges.Calculadora;

public class Calculadora {

    public double CalcularDobro(double numero) {
        return numero * 2;
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        System.out.println(calc.CalcularDobro(10));
    }
}
