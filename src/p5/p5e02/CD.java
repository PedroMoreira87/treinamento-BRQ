package p5.p5e02;

public class CD extends Midia{

    private int nMusicas;

    public CD () {}

    public CD(int c, double p, String s, int m) {
        super(c, p, s);
        this.nMusicas = m;
    }

    public String getTipo() {
        return super.getTipo();
    }

    public String getDetalhes() {
        return super.getDetalhes() +
                "\nNúmero de músicas: " + nMusicas;
    }

    public void setMusica(int m) {
        this.nMusicas = m;
    }

    public void inserirDados() {
        super.inserirDados();
//        System.out.print("Digite o número de músicas: ");
//        this.nMusicas = scan.nextInt();
        setMusica(10);
    }
}
