package p3.p3e05;

public class Main {

    public static void main(String[] args) {

        Array array = new Array(new boolean[20]);

        System.out.println("Array Original: ");
        array.input();
        array.print();
        System.out.println("\n========================================");
        System.out.println("Array modificado: ");
        array.isPrime(array.getArray());
        array.print();
    }
}
