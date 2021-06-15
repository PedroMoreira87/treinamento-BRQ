package p2.p2prf;

public class Main {
    public static void main(String[] args) {

        Calculadora calc = new Calculadora();

        calc.somar(20);
        calc.exibeMemoria();
        calc.subtrair(5);
        calc.exibeMemoria();
        calc.multiplicar(2);
        calc.exibeMemoria();
        calc.dividir(2);
        calc.exibeMemoria();
    }
}
