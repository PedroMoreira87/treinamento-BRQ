package p3.p3e04;

public class Cosseno {

    private double x;
    private double[] parcelas;
    private double cosseno;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double[] getParcelas() {
        return parcelas;
    }

    public void setParcelas(double[] parcelas) {
        this.parcelas = parcelas;
    }

    public double getCosseno() {
        return cosseno;
    }

    public void setCosseno(double cosseno) {
        this.cosseno = cosseno;
    }

    public Cosseno(double x) {
        this.x = x;
        this.parcelas = new double [10];
        this.cosseno = cosseno;
    }

    public void calculaParcelas() {
        for(int i=0; i<10; i++) {
            parcelas[i]= Math.pow(-1,i) * 1/calcFatorial(2*i) * Math.pow(x, i*2);
        }
    }

    public void somaParcelas() {
        double soma=0.0;
        for(double v:parcelas)
            soma += v;
        this.cosseno = soma;
    }

    public long calcFatorial(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++){
            fact *= i;
        }return fact;
    }

    public void printParcelas() {
        calculaParcelas();
        for (int i = 0; i < parcelas.length; i++){
            if (i != parcelas.length - 1){
                System.out.print(parcelas[i]+", ");
            }else {
                System.out.print(parcelas[i]);
            }
        }
    }

    public void printSomaParcelas() {
        somaParcelas();
        System.out.println(cosseno);
    }
}