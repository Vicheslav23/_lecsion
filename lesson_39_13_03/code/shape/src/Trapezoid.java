public class Trapezoid extends Shape {

    double width1; // сторона трапеции
    double width2; // сторона трапеции
    double height; // высота трапеции

    public Trapezoid(String name, double width1, double width2, double height) {
        super(name);
        this.width1 = width1;
        this.width2 = width2;
        this.height = height;
    }

    // площадь трапеции
    public double square() {
        return (width1 + width2) * height / 2;
    }
}
