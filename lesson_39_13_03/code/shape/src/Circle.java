public class Circle extends Shape {
    double radius;

    // конструктор класса
    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }
    // площадь окружности

    public double square() {

        return Math.PI * radius * radius;
    }
}
