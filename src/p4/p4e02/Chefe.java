package p4.p4e02;

public class Chefe extends Funcionario{

    protected double contas;
    protected double gastosExtras;
    protected double adicionalChefia;

    public Chefe(String nome, String rg, double salarioMensal, double contas, double gastosExtras, double adicionalChefia) {
        super(nome, rg, salarioMensal);
        this.contas = contas;
        this.gastosExtras = gastosExtras;
        this.adicionalChefia = adicionalChefia;
    }

    public double getContas() {
        return contas;
    }

    public void setContas(double contas) {
        this.contas = contas;
    }

    public double getGastosExtras() {
        return gastosExtras;
    }

    public void setGastosExtras(double gastosExtras) {
        this.gastosExtras = gastosExtras;
    }

    public double getAdicionalChefia() {
        return adicionalChefia;
    }

    public void setAdicionalChefia(double adicionalChefia) {
        this.adicionalChefia = adicionalChefia;
    }

    public double pagamentoExtra() {
        pagamento();
        return salarioMensal += contas + gastosExtras + adicionalChefia;
    }

    @Override
    public String toString() {
        return "==============================" +
                "\nChefe: " +
                "\nNome: " + nome +
                "\nRg: " + rg +
                "\nContas: " + contas +
                "\nGastosExtras: " + gastosExtras +
                "\nAdicionalChefia: " + adicionalChefia +
                "\nSalarioMensal: " + salarioMensal +
                "\n==============================";
    }
}
