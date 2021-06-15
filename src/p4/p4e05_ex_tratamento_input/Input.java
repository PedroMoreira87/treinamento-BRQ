package p4.p4e05_ex_tratamento_input;

import java.util.Scanner;

public class Input {

    public void input() {
        Scanner scan = new Scanner(System.in);
        boolean erro = false;
        do {
            try {
                int numero;
                System.out.print("Digite um inteiro: ");
                numero = scan.nextInt();
                System.out.println("Você digitou " + numero + ".");
                erro = false;
            }catch (Exception e) {
                System.out.println("Este não é um inteiro numérico");
                erro = true;
                scan.nextLine();
            }finally {
                if (erro)
                    System.out.println("Tente Novamente!");
                else
                    System.out.println("Obrigado!");
            }
        }while (erro);
    }
}
