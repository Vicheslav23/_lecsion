import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*Scanner scanner = new Scanner ("qwerty");

        String s = scanner.nextLine();
       // System.out.println(s);

        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Enter your name :");


        String str1 = scanner1.nextLine();
        System.out.println("Your name:" + str1);*/

        /* написать программу, принимающую с клавиатуры 2 числа и выводящую их на экран
  c переставленными местами значениями
        int  num1 = 10
        // int num2 = 5
        //.........
        //  на выходе должно быть : num1=5  num2 = 10 */

       int num = 10;
        int num2 = 5;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num1");
        int num1 = scanner.nextInt();
        System.out.println("you entered num2 as " + num2);
        int temp = num1;
        num1 = num2;
        num1 = temp;
        System.out.println("and now num1 is " + num1 + " and num2 is " + num2);








        //System.out.println("Hello world!");//
    }
}