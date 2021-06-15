package p4.p4e01;

import java.sql.Date;

public class Main {

    public static void main(String[] args) {

        Aluno aluno = new Aluno("Pedro", "000.000.000-00", Date.valueOf("1987-01-22"), "000");
        Professor professor = new Professor("Julio", "111.111.111-11", Date.valueOf("1960-03-21"), 3000.00, "Matemática");
        Funcionario funcionario = new Funcionario("Carlos", "222.222.222-22", Date.valueOf("1955-01-01"), 2500, Date.valueOf("1980-05-10"), "Gerente de finanças");

        System.out.println(aluno);
        System.out.println(professor);
        System.out.println(funcionario);

        System.out.println("O aluno vai pagar: ");
        System.out.println("R$" + aluno.tirarCopias(10));
        System.out.println("O professor vai pagar: ");
        System.out.println("R$" + professor.tirarCopias(10));
        System.out.println("O funcionario vai pagar: ");
        System.out.println("R$" + funcionario.tirarCopias(10));
    }
}
