package p1.p1prf;

public class Easter {

    private double ano;
    private double mes;
    private double dia;

    public double getAno() {
        return ano;
    }

    public void setAno(double ano) {
        this.ano = ano;
    }

    public double getMes() {
        return mes;
    }

    public void setMes(double mes) {
        this.mes = mes;
    }

    public double getDia() {
        return dia;
    }

    public void setDia(double dia) {
        this.dia = dia;
    }

    public Easter(double ano) {
        this.ano = ano;
    }

    public void calc() {
        double a = ano%19;
        double b = Math.floor(ano/100);
        double c = ano%100;
        double d = Math.floor(b/4);
        double e = b%4;
        double f = Math.floor((b+8)/25);
        double g = Math.floor((b-f+1)/3);
        double h = (19*a+b-d-g+15)%30;
        double i = Math.floor(c/4);
        double j = c%4;
        double k = (32+2*e+2*i-h-j)%7;
        double L = Math.floor((a+11*h+22*k)/451);
        mes = Math.floor((h+k-7*L+114)/31);
        dia = ((h+k-7*L+114)%31)+1;
    }

    public void print() {
        calc();
        System.out.printf("Em %.0f\nA páscoa cai no dia: %.0f\nNo mês: %.0f", ano, dia, mes);
    }
}
