public class Main {
    public static void main(String[] args) {
// Задача 2. Добавить методы проверки делимости на 3, 5. Разработать тесты, покрывающие код этих методов.

        System.out.println("Математические методы");

//  проверка делимости на 3
        MathMethods methods = new MathMethods();
        System.out.println(methods.IsThreeNumber(33));
        System.out.println();

//  проверка делимости на 5
        System.out.println(methods.IsFiveNumber(12));


    }
}