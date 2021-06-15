package p1.p1e01;

public class Horses {
    private float kg;
    private float meters;
    private float seconds;

    public float getKg() {
        return kg;
    }

    public void setKg(float kg) {
        this.kg = kg;
    }

    public float getMeters() {
        return meters;
    }

    public void setMeters(float meters) {
        this.meters = meters;
    }

    public float getSeconds() {
        return seconds;
    }

    public void setSeconds(float seconds) {
        this.seconds = seconds;
    }

    public Horses(float kg, float meters, float seconds) {
        this.kg = kg;
        this.meters = meters;
        this.seconds = seconds;
    }

    public float calc() {
        return (kg * (meters / seconds)) / 745.6999f;
    }

    public void print() {
        System.out.printf("%.4f", calc());
    }
}
