public class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // площадь окружности
    public double square() {
        return Math.PI * radius * radius;
    }
}
