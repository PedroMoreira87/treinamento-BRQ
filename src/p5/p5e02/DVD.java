package p5.p5e02;

public class DVD extends Midia{

    private int nFaixas;

    public DVD(){}

    public DVD(int c, double p, String s, int f) {
        super(c, p, s);
        this.nFaixas = f;
    }

    public String getTipo() {
        return super.getTipo();
    }

    public String getDetalhes() {
        return super.getDetalhes() +
                "\nNúmero de faixas: " + nFaixas;
    }

    public void setFaixas(int Faixas) {
        this.nFaixas = Faixas;
    }

    public void inserirDados() {
        super.inserirDados();
//        System.out.print("Digite o número de faixas: ");
//        this.nFaixas = scan.nextInt();
        setFaixas(20);
    }
}
