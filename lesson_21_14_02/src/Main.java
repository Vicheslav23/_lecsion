import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*System.out.println("Нахождение НОД для двух целых чисел a и b");
        // Задача: найти наибольший общий делитель (НОД) двух целых чисел a и b.
        //Примеры:
        //15 и 20: НОД = 5
        //15 и 60: НОД = 15
        //17 и 23: НОД = 1
        //24 и 40: НОД = 8
        //6 и 18: НОД = 6

        //Алгоритм:
        //Шаг 1: сравнить числа a и b, найти меньшее из них, пусть меньшее будет min, а большее max.
        //Шаг 2: пройти в цикле от 1 до min (включительно) и делить min на параметр цикла.
        //Если min разделилось нацело на параметр цикла, то делим второе число max на это же число.
        //Если max разделилось нацело на параметр цикла, то НОД = параметр цикла.

        Scanner scan = new Scanner(System.in);

        int nod = 0;
        System.out.println("Введите 1-е число: ");
        int a = scan.nextInt();
        System.out.println("Введите 2-е число: ");
        int b = scan.nextInt();
        System.out.println("Вы ввели число " + a +" и " + b);

        int min = min (a, b);
        int max = max (a, b);

        System.out.println("Меньшее число: " + min);
        System.out.println("Большее число: " + max);

        for (int i = 1; i <= min; i++) {
            if (min % i == 0) {
                if (max % i == 0) {
                    nod = i;
                }
            }
        }
        System.out.println("НОД чисел a и b = " + nod );
    }
    public static int min ( int num1, int num2){
        if (num1 < num2) {
            return num1;
        } else return num2;
    }
    public static int max ( int num1, int num2){
        if (num1 > num2) {
            return num1;
        } else return num2;
    }*/
//    -----------------------------------------------------------
        /*System.out.println("Поиск элемента массива");

        // Задать массив случайных целыхх чисел от 1 до 10 включительно.
        // Запросить у пользователя произвольное число от 1 до 10.
        // Проверить, встретилось ли введенное число в массиве и сколько раз.
        // Поиск в массиве реализовать как метод, на входе которого массив и искомое число, на выходе -
        // какое количество раз оно встретилось.
        //   ТИП[] имя_массива = new ТИП[размер];
        // int n = (int)(( Math.random() * (b - a + 1) + a)) - генерирует случайное **целое** число в интервале [a, b]
        //   a - может быть, b - может быть
        Scanner scan = new Scanner(System.in);

        int[] arrayIntRandom = new int[10];

        for (int i = 0; i < arrayIntRandom.length; i++) {
            arrayIntRandom[i] = (int) ((Math.random() * (10 - 1 + 1) + 1));
//            System.out.println("Задуманный массив: " + arrayIntRandom[i]);
        }
        System.out.println("Введите целое число от 1 до 10");
        int num = scan.nextInt();

        int c = findNumber(arrayIntRandom, num);

        System.out.println("Число " + num + " встретилось в массиве " + c + " раз");
    }
    public static int findNumber(int array[], int find_num) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == find_num) {
                count ++;
            }
        }
        return count;
}*/
//-------------------------------------------------------------------------------------
// Задача о поиске минимального и максимального элемента массива
//        зададим массив случайных чисел от 1 до 10
//        реализовать метод поиска макс из чисел в массиве и миним
//        расспечатать массив, миним и макс
        /*int[] arrayIntRandom = new int[10];

        for (int i = 0; i < arrayIntRandom.length; i++) {
            arrayIntRandom[i] = (int) ((Math.random() * (10 - 1 + 1) + 1));
        }
        int min = min(arrayIntRandom);
        System.out.println("Минимальный элемент массива равен: " + min);
        int max = max(arrayIntRandom);
        System.out.println("Максимальный элемент массива равен: " + max);

    }

    public static int min(int array[]) {
        int minimum = 10;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minimum) {
                minimum = array[i];
            }
        }
        return minimum;
    }
        public static int max (int array[]) {
            int maxsimum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxsimum) {
                maxsimum = array[i];
            }
        }
        return maxsimum;
    }*/
//    -------------------------------------------------------------------------------------------
//    Задача 2 Задача про удаление дубликатов. Задумать случайный массив из 10 целых чисел от 1 до 10.
//    Проверить массив на наичие в нем дубликатов, вместо найденного дубликата задать 0.
//    Пример Задуман массив: 1, 5, 7, 6, 5, 3, 6, 9, 10, 5 После удаления дубликатов: 1, 5, 7, 6, 0, 3, 0, 9, 10, 0

        int[] arrayDuplicate = new int[10];
        for (int i = 0; i < arrayDuplicate.length; i++) {
            arrayDuplicate[i] = (int) ((Math.random() * (10 - 1 + 1) + 1));
            System.out.println("Задуманный массив: " + arrayDuplicate[i]);
        }
        int c = duplicate(arrayDuplicate);

    }
    public static int duplicate(int arrayDuplicate[]) {
        int count = 0;
        for (int i = 0; i <= arrayDuplicate.length; i++) {
            for (int a = i + 1; a < arrayDuplicate.length; a++) {
                if (arrayDuplicate[i] == arrayDuplicate[a]) {
                    count++;
                    System.out.println("Дубликаты : " + arrayDuplicate[a]);
                }
            }
        }return count;
    }
}


