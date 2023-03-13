import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //домашнее задание - метод, который возвращает число в кубе.
        numberInCube();
        multiplay();

    }

        public static void numberInCube() {
            Scanner scan = new Scanner(System.in);
            System.out.println(" Enter number: ");
            int n = scan.nextInt();
            int sum;
            sum = n*n*n;
            System.out.println("Number " + n + " in cube = "+sum);
        }
        //------------------------------------------------------------------------------
    // написать метод выводящий на экран таблицу квадратов
        public static void multiplay() {
            int i;

            for (i = 0; i <= 99; i++) ;
            {
                int res = i * i;
                System.out.println(res);
            }
        }

    /*public static int sumN (int n){
        int i =1;
        int sum = 0;

        while(i<=n){
            sum = sum+i;
            i++;
            //  sum+=i++;
        }
        return sum;*/
        //------------------------------------------------------------------------------
        /*Scanner scan = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scan.nextInt();
        System.out.println("Enter number is: " + number);

        boolean isPrime = true;

        for (int i = 2; i < number - 1; i++) {
            double div = number % i;
            if (div == 0) {
                isPrime = false;
            }
            if (isPrime) {
                System.out.println("number is not prime");
                break;
            } else {
                System.out.println("number is prime");
            }
        }*/



}