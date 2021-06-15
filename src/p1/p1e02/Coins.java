package p1.p1e02;

public class Coins {
    private float q1; // q1 - $1 coin
    private float q2; // q2 - 50¢ coin
    private float q3; // q3 - 25¢ coin
    private float q4; // q4 - 10¢ coin
    private float q5; // q5 - 5¢ coin
    private float q6; // q6 - 1¢ coin
    private float d;  // cotação

    public float getQ1() {
        return q1;
    }

    public void setQ1(float q1) {
        this.q1 = q1;
    }

    public float getQ2() {
        return q2;
    }

    public void setQ2(float q2) {
        this.q2 = q2;
    }

    public float getQ3() {
        return q3;
    }

    public void setQ3(float q3) {
        this.q3 = q3;
    }

    public float getQ4() {
        return q4;
    }

    public void setQ4(float q4) {
        this.q4 = q4;
    }

    public float getQ5() {
        return q5;
    }

    public void setQ5(float q5) {
        this.q5 = q5;
    }

    public float getQ6() {
        return q6;
    }

    public void setQ6(float q6) {
        this.q6 = q6;
    }

    public float getD() {
        return d;
    }

    public void setD(float d) {
        this.d = d;
    }

    public Coins(float q1, float q2, float q3, float q4, float q5, float q6, float d) {
        this.q1 = q1;
        this.q2 = q2;
        this.q3 = q3;
        this.q4 = q4;
        this.q5 = q5;
        this.q6 = q6;
        this.d = d;
    }

    public float calc() {
        return (q1 + 0.5f * q2 + 0.25f * q3 + 0.1f * q4 + 0.05f * q5 + 0.01f * q6)*d;
    }

    public void print() {
        System.out.printf("%.2f", calc());
    }
}
