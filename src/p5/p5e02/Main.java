package p5.p5e02;

public class Main {

    public static void main(String[] args) {

        DVD dvd = new DVD();
        CD cd = new CD();

        dvd.inserirDados();
        System.out.println("==============================");
        System.out.println(dvd.getTipo());
        System.out.println("==============================");
        System.out.println(dvd.getDetalhes());
        System.out.println("==============================");
        dvd.printDados();
        System.out.println("==============================");

        cd.inserirDados();
        System.out.println("==============================");
        System.out.println(cd.getTipo());
        System.out.println("==============================");
        System.out.println(cd.getDetalhes());
        System.out.println("==============================");
        cd.printDados();
        System.out.println("==============================");
    }
}
