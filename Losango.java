package design.adapter;

// Parte da API Extra-Geometric-Shape

public class Losango implements GeometricShape {
    private final double a;
    private final double b;
    public Losango() {
        this(1.0d, 1.0d);
    }

    public Losango(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double area() {
    	double s = a * b;
        return s;
    }

    @Override
    public double perimeter() {
        return 2 * (a + b);
    }

    @Override
    public void drawShape() {
    System.out.println("Desenhando Losango com a área: " + area() + " e o perímetro: " + perimeter());
    }
}