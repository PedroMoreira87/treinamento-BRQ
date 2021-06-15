package p1.p1e03;

public class TemperatureConverter {
    private float c;
    private float f;
    private float k;
    private float ra;
    private float re;

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }

    public float getF() {
        return f;
    }

    public void setF(float f) {
        this.f = f;
    }

    public float getK() {
        return k;
    }

    public void setK(float k) {
        this.k = k;
    }

    public float getRa() {
        return ra;
    }

    public void setRa(float ra) {
        this.ra = ra;
    }

    public float getRe() {
        return re;
    }

    public void setRe(float re) {
        this.re = re;
    }

    public TemperatureConverter(float c) {
        this.c = c;
    }

    public void calc() {
        f = c * 1.8f + 32;
        k = c + 273.15f;
        ra = c * 1.8f + 32 + 459.67f;
        re = c * 0.8f;
    }

    public void print() {
        calc();
        System.out.printf("Transformando %.2f graus Célsius"+
                "\n=============================="+
                "\nKelvin (K): %.2f"+
                "\nFahrenheit (F): %.2f"+
                "\nRéaumur (Re): %.2f"+
                "\nRankine (Ra): %.2f", c, k, f, re,ra);
    }
}
