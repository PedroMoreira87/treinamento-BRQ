package p5.p5prf;

import java.util.Scanner;

public class FabricaLampada {

    public class Incandescente implements Lampada{
        @Override
        public void ligar() {
            System.out.println("A lâmpada está ligada");
        }
        @Override
        public void desligar() {
            System.out.println("A lâmpada está desligada");
        }
    }

    public class Fluorescente implements Lampada{
        @Override
        public void ligar() {
            System.out.println("A lâmpada está ligada");
        }
        @Override
        public void desligar() {
            System.out.println("A lâmpada está desligada");
        }
    }

    public Lampada construir() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual lâmpada deseja construir? \n1 - Incandescente\n2 - Fluorescente\n3 - Sair");
        int c = scan.nextInt();
        switch (c) {
            case 1:
                new Incandescente().ligar();
                new Incandescente().desligar();
                return new Incandescente();
            case 2:
                new Fluorescente().ligar();
                new Fluorescente().desligar();
                return new Fluorescente();
            case 3:
                return null;
            default:
                System.out.println("Valor incorreto. Favor tentar novamente");
                return construir();
        }
    }
}
