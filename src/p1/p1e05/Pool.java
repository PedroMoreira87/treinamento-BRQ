package p1.p1e05;

public class Pool {

    private float dp; // DP Diâmetro Pequeno
    private float dg; // DG Diâmetro Grande
    private float pp; // PP Profundidade Pequena
    private float pg; // PG Profundidade Grande

    public float getDp() {
        return dp;
    }

    public void setDp(float dp) {
        this.dp = dp;
    }

    public float getDg() {
        return dg;
    }

    public void setDg(float dg) {
        this.dg = dg;
    }

    public float getPp() {
        return pp;
    }

    public void setPp(float pp) {
        this.pp = pp;
    }

    public float getPg() {
        return pg;
    }

    public void setPg(float pg) {
        this.pg = pg;
    }

    public Pool(float dp, float dg, float pp, float pg) {
        this.dp = dp;
        this.dg = dg;
        this.pp = pp;
        this.pg = pg;
    }

    public float calc() {
        float pm = (pp + pg) / 2;   // PM Profundidade Média
        return dg * dp * pm * 785;
    }

    public void print() {
        System.out.println(calc());
    }
}
