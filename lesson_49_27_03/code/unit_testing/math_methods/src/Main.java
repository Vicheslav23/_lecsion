public class Main {
    public static void main(String[] args) {
        System.out.println("Математические методы");
        // Нам надо написать методы:
        // - Проверка, что число простое
        // - Проверка, что число четное
        // - Действие n! = 1*2*3*...*n, то есть 5! = 1*2*3*4*5 = 120

// - Проверка, что число простое
        MathMethods method1 = new MathMethods();
        System.out.println(method1.isPrimeNumber(121));
        System.out.println(method1.isPrimeNumber(17));
        System.out.println(method1.isPrimeNumber(13));
        System.out.println(method1.isPrimeNumber(4));
        System.out.println();

// - Проверка, что число четное
        System.out.println(method1.isEven(10));
        System.out.println(method1.isEven(23));
        System.out.println();

// - Действие n! = 1*2*3*...*n, то есть 5! = 1*2*3*4*5 = 120
        System.out.println(method1.faktorial(5));

    }
}