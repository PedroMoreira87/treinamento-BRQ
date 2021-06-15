package p4.p4e02;

public class Main {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("Pedro", "00000000", 3000);
        Chefe chefe = new Chefe("Julio", "11111111", 6000, 2000, 1000, 1500);

        funcionario.pagamento();
        funcionario.aumento(1000);
        System.out.println(funcionario);

        chefe.aumento(1000);
        chefe.pagamentoExtra();
        System.out.println(chefe);
    }
}
