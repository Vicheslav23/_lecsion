public class Triangle extends Shape {
    double a;
    double h;

    public Triangle(String name, double a, double h) {
        super(name);
        this.a = a;
        this.h = h;
    }
// площадь треугольника
    public double square() {
        return (a * h) / 2;
    }
}
