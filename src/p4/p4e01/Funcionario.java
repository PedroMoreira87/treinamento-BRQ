package p4.p4e01;

import java.util.Date;

public class Funcionario extends Pessoa{

    private double salario;
    private Date dataAdmissao;
    private String cargo;


    public Funcionario(String nome, String cpf, Date dataNascimento, double salario, Date dataAdmissao, String cargo) {
        super(nome, cpf, dataNascimento);
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Funcionario: \n" +
                super.toString() +
                "\nSalario: " + salario +
                "\nData de admissao: " + sdf.format(dataAdmissao) +
                "\nCargo: " + cargo +
                "\n==============================";
    }
}
