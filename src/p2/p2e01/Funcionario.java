package p2.p2e01;

public class Funcionario {

    private int codFunc;
    private String nomeFunc;
    private double salarioMensal;

    public int getCodFunc() {
        return codFunc;
    }

    public void setCodFunc(int codFunc) {
        this.codFunc = codFunc;
    }

    public String getNomeFunc() {
        return nomeFunc;
    }

    public void setNomeFunc(String nomeFunc) {
        this.nomeFunc = nomeFunc;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    public Funcionario(int codFunc, String nomeFunc, double salarioMensal) {
        this.codFunc = codFunc;
        this.nomeFunc = nomeFunc;
        this.salarioMensal = salarioMensal;
    }

    public Funcionario() {
    }

    public void setAumento(double per) {
        salarioMensal += (salarioMensal * per) / 100;
    }

    public double getSalarioAnual() {
        return salarioMensal * 12;
    }
}
