import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//      Задача.Написать метод выводящий на экран таблицу умножения для числа N при N = 5

        multiply();
        primeNumber();
    }

    public static void multiply() {

        int i = 0;
        int a = 10;
        int n = 5;

        do {
            System.out.println(i + "*" + n + "=" + (i * n));
            i++;
        }
        while (i <= a);
        {
            System.out.println();
        }
    }

    //    ----------------------------------------------------------------------------------------------
//    Задача. Вывести на экран все простые числа, меньше введенного N.
    public static void primeNumber() {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.print(" Enter number: ");
        n = scan.nextInt();

       /* n = n - 1;
        do {
            System.out.print(n + " ");
            n--;}
            while (n>0);
    }*/
        for (int j = 1; j >= n; j++) {
            //n = 0;
            for (int i = 1; i > j + 1; i++) {
                if (j % i == 0) {
                    //n++;
                }
            }
            if (n == 2) {
                System.out.println(j + " ");
            }
        }
    }
}