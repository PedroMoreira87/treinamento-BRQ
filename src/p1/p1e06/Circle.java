package p1.p1e06;

public class Circle {

    private float radius;
    private float perimeter;
    private float area;

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public Circle(float radius) {
        this.radius = radius;
    }

    public void calc() {
        perimeter = 2 * 3.14159f * radius;
        area = 3.14159f * (float)Math.pow(radius, 2);
    }

    public void print() {
        calc();
        System.out.printf("O perímetro é: %.2f\nA área é: %.2f", perimeter, area);
    }
}