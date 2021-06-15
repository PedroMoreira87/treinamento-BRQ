package p3.p3prf;

public class Main {

    public static void main(String[] args) {

        Estatistica estatistica = new Estatistica(new double[10]);

        System.out.println("Array Original: ");
        estatistica.input();
        estatistica.print();
        System.out.println("\n========================================");
        System.out.println("Array Ordenado: ");
        estatistica.ordena();
        estatistica.print();
        System.out.println("\n========================================");
        System.out.println("Média: ");
        System.out.println(estatistica.media());
        System.out.println("========================================");
        System.out.println("Moda: ");
        System.out.println(estatistica.moda(estatistica.getValores()));
        System.out.println("========================================");
        System.out.println("Mediana: ");
        System.out.println(estatistica.mediana(estatistica.getValores(), estatistica.getValores().length));
        System.out.println("========================================");
        System.out.println("Variância: ");
        System.out.println(estatistica.variancia());
        System.out.println("========================================");
        System.out.println("Desvio Padão: ");
        System.out.println(estatistica.desvioPadrao());
    }
}
