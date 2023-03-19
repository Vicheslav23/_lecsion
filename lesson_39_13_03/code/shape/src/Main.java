public class Main {
    public static void main(String[] args) {
//  Класс Shape (Фигура) с методом square, создаем наследников Triangle, Rectangle, Trapezoid, Circle
//  Внутри каждого из наследников определяем/уточняем метод для вычисления площади фигуры.
        System.out.println("Площади фигур");

        // круг
        double r = 10;
        Circle o1 = new Circle("", r);
        double s_circle = o1.square(); // вызываем метод для расчета площади
        System.out.println("Площадь круга: S = " + s_circle);

        // прямоугольник
        double a = 15;
        double b = 30;

        Rectangle rec1 = new Rectangle("rectangle",a, b);
        double s_rectangle = rec1.square(); // вызываем метод для расчета площади
        System.out.println("Площадь прямоугольника: S = " + s_rectangle);

        // треугольник
        double width = 10;
        double h = 20;

        Triangle tr1 = new Triangle("triangle", width, h);
        double s_tr = tr1.square();
        System.out.println("Площадь треугольника: S = " + s_tr);


        // трапеция
        Trapezoid trap1 = new Trapezoid("trapezoid", 10, 30, 20);
        double s_trap = trap1.square();
        System.out.println("Площадь трапеции: S = " + s_trap);
    }
}