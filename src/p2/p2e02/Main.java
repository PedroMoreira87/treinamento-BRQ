package p2.p2e02;

public class Main {
    public static void main(String[] args) {

        // criando triângulos e círculos
        Circulo C1 = new Circulo();
        Circulo C2 = new Circulo(5.0);
        Triangulo T1 = new Triangulo();
        Triangulo T2 = new Triangulo(3.0,4.0);
        C1.setRaio(8.0);
        T1.setBase(4.0);
        T1.setAltura(5.0);

        // exibindo seus atributos, área e perímetro
        System.out.printf("Circulo 1:\nRaio = %.2f\nArea = %.2f\nPerimetro = %.2f\n", C1.getRaio(), C1.getArea(), C1.getPerimetro());
        System.out.println("----------------------------------------");
        System.out.printf("Circulo 2:\nRaio = %.2f\nArea = %.2f\nPerimetro = %.2f\n", C2.getRaio(), C2.getArea(), C2.getPerimetro());
        System.out.println("----------------------------------------");
        System.out.printf("Triangulo 1:\nBase = %.2f\nAltura = %.2f\nArea = %.2f\nPerimetro = %.2f\n", T1.getBase(), T1.getAltura(), T1.getArea(), T1.getPerimetro());
        System.out.println("----------------------------------------");
        System.out.printf("Triangulo 2:\nBase = %.2f\nAltura = %.2f\nArea = %.2f\nPerimetro = %.2f", T2.getBase(), T2.getAltura(), T2.getArea(), T2.getPerimetro());
    }
}
