package p2.p2e01;

public class Main {
    public static void main(String[] args) {

        // criando dois funcionários
        Funcionario F01 = new Funcionario();
        Funcionario F02 = new Funcionario(1105,"Jose Carlos Silva",6500.00);
        F01.setCodFunc(1200);
        F01.setNomeFunc("Maria Antonia Guimarães");
        F01.setSalarioMensal(8600.00);

        // exibindo seus atributos
        System.out.println("Código: "+F01.getCodFunc()+"\nNome: "+F01.getNomeFunc()+
                "\nSalário mensal: " + F01.getSalarioMensal());
        System.out.println("\nCódigo: "+F02.getCodFunc()+"\nNome: "+F02.getNomeFunc()+
                "\nSalário mensal: " + F02.getSalarioMensal());

        // aumentando os salários em 15%
        F01.setAumento(15.0);
        F02.setAumento(15.0);

        // exibindo salario anual
        System.out.println("\nCódigo: "+F01.getCodFunc()+"\nSalário anual: "+F01.getSalarioAnual());
        System.out.println("Código: "+F02.getCodFunc()+"\nSalário anual: "+F02.getSalarioAnual());
    }
}
