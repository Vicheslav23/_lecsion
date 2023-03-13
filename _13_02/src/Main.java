import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    // задать функцию, которая вычисляет частное a и b
    public static int div(int num1, int num2) {
        return num1 / num2;

    }
    public static void main(String[] args) {

//        Примеры:
//       1)  Деление на 0:

        // считать с клавиатуры целое a
        // считать с клавиатуры целое b
        // задать функцию, которая вычисляет частное a и b
        // запустить бесконечный цикл для ввода a и b, чтобы не запускать программу каждый раз
        // проверить, что будет, если задать b = 0 - должна появиться ошибка, программа закончится аварйно
        // применить try ... catch для обработки ошибки деления на 0
        // протестировать программу

       /* while (true) {  // запустить бесконечный цикл для ввода a и b, чтобы не запускать программу каждый раз
            try {

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter number a: ");
            int a = scan.nextInt();
            System.out.println("Enter number b: ");
            int b = scan.nextInt();
            int c = div(a, b); // задать функцию, которая вычисляет частное a и b
                System.out.println(a + " / " + b + " = " + c);
            } catch (ArithmeticException ex) {
                System.out.println( ex.getMessage() + " Делить на ноль нельзя!");
            }
        }
    }*/
//        --------------------------------------------------------------------------------------------

        // Пример с выходом за пределы размера массива:

// Задать массив на 3 элемента
// Обратиться к элементу массива с индексом больше 3 - программа должна закончиться аварийно
// Применить try ... catch для обработки ошибки обращения за длину массива
// Протестировать программу
        /*int[] myNumbers = {1, 2, 3};
        try {
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println("Вы обратились к элементу массива, индекс которого больше, чем длина массива.");
        };*/
//        --------------------------------------------------------------------------------------------------

// Пример с делением на 0 и обработкой неправильного ввода (символы вместо чисел)

// Сделать калькуллятор для деления с защитой от деления на 0 и ввода символов вместо цифр
//Калькулятор деления a на b, оформляем бесконечный цикл, защита от деления на 0
// и ввода символов вместо чисел;
        /*Scanner scanner = new Scanner(System.in);
        char choice_y_or_n;
        System.out.println("Division a / b ");
        while (true) {
            int a = 0;
            int b = 0;
            int c = 0;
            try {
                System.out.println("Input a: ");
                a = scanner.nextInt();
                System.out.println("Input b: ");
                b = scanner.nextInt();
                c = div(a, b);
                System.out.println("Result " + a + " / " + b + " = " + c);
            } catch (ArithmeticException ex) {
                System.out.println("Ошибка " + ex.getMessage() + " На 0 делить нельзя!");
            } catch (InputMismatchException ex) {
                System.out.println("Ошибка ввода, вы ввели не число!");
            };
            System.out.println("Continue? y/n ");
            choice_y_or_n = scanner.next().toLowerCase().charAt(0);
            if (choice_y_or_n == 'n') {
                break;
            } else continue;
        }*/
//        -----------------------------------------------------------------------------------------------

//    Примеры:
//    Расчет периметра прямоугольника, защита от ввода символов вместо числа и ввода отрицательных чисел;
        // Калькулятор для вычисления периметра комнаты
// На входе: a и b - стороны прямоугольника
// На выходе: периметр прямоугольника
// Ключевой алгоритм: p = 2*(a=b)
// Интерфейс: защититься от ошибок пользователя при вводе a и b, нельзя вводить символы вместо цифр
// и отрицательные числа в качестве длины сторон комнаты.
// Предложить пользователю продолжить работу калькулятора
// до тех пор, пока он не откажется.
// Проверку введенного числа на позитивность выполнить в вызываемой функции,
// котороая сообщает о неправильном вводе данных.

        Scanner scanner = new Scanner(System.in);

        char choice_y_or_n;

        while (true) {
            try {
                System.out.println("Введите длину 1-й стороны прямоугольника: ");
                int a = scanner.nextInt();
                System.out.println("Введите длину 2-й стороны прямоугольника: ");
                int b = scanner.nextInt();

                if (a > 0 && b > 0){
                    System.out.println("Периметр прямоугольника = " + 2 * (a + b));
                } else {
                    System.out.println("Вы ввели отрицательное число");
                }
            } catch (ArithmeticException ex) {
                System.out.println("Ошибка " + ex.getMessage() + " На 0 делить нельзя!");
            } catch (InputMismatchException ex) {
                System.out.println("ошибка ввода, вы ввели не число!");
            }
            System.out.println(" Продолжим? -y/n");
            choice_y_or_n = scanner.next().toLowerCase().charAt(0);
            if (choice_y_or_n == 'n') {
                break;
                } else continue;

            private static void checkPositive(int a) {
                if (a <= 0) {
                    System.out.println(" Wrong input.");
                }
        }
    }
}