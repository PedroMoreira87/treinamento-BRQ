package p5.p5e01;

public class Calculadora {

    public static void main(String[] args) {

        Contas.mostrarCalculo(new Soma(), 10, 10);
        Contas.mostrarCalculo(new Subtracao(), 10, 10);
        Contas.mostrarCalculo(new Multiplicacao(), 10, 10);
        Contas.mostrarCalculo(new Divisao(), 10, 10);
        Contas.mostrarCalculo(new Resto(), 10, 10);
    }
}
