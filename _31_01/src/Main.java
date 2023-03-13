import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


       /* Scanner scan = new Scanner(System.in);
        System.out.println( " Enter number :");

        int x =scan.nextInt();

        if(x==1)
        {
            System.out.println("x is one");
        }
        else if(x==2){
            System.out.println("x is two" );
        }
        else if (x==3){
            System.out.println("x is three");
        }
        else if (x==4){
            System.out.println("x is four");
        }
        else {
            System.out.println(x + " is not between 1 and 4");
        }
*/
        //---------------------------------------------------------------------------------
       /* // есть целое положительное число. Нужно вывести на экран количество его цифр если их не
        // больше четырех в следующем виде :
        //   3 ->   "It is a one  digit number
        //   10 -> "It is a two digit number
        //   368 ->  "It is a three digit number
        //  6785 -> "It is a four digit number
        // если же кличество цифр числа больше 4 то вывести надпись "the number is too big for me"

        Scanner scan1 = new Scanner(System.in);
        System.out.println( "Enter number: ");

        int number =scan1.nextInt();

        if (number>=0 && number<10){
            System.out.println("It is a one  digit number");
        }
        else if (number>=10 && number<100){
            System.out.println("It is a two digit number");
        }
        else if (number>=100 && number<1000){
            System.out.println("It is a three digit number");
        }
        else if (number>=1000 && number<10000){
            System.out.println("It is a four digit number");
        }
        else {
            System.out.println("The number is not between 0 and 9999");}*/
        //---------------------------------------------------------------------------------------
        // Найти максимальное из трех целых чисел используя какой либо из вариантов еlse if.
        /*int number1 = 10, number2 = 30, number3 = 1;

        if (number1 >=number2 && number1>=number3)
            System.out.println(number1+" is the largest number");

        else if (number2>=number1 && number2>number3)
            System.out.println(number2+" is the largest number");
        else
            System.out.println(number3 +" is the largest number");*/

        // 2-ой вариант
        /*int number1 = 10, number2 = 30, number3 = 1;
        if(number1>=number2) {

            if (number1 >= number3) {
                System.out.println(number1 + " is the largest");
            }
            else {
                System.out.println(number3 + " is the largest");
            }
        }
        else {
            if (number2 >= number3) {
                System.out.println(number2 + " is the largest");
            } else {
                System.out.println(number3 + " is the largest");
            }
        }*/
        //------------------------------------------------------------------------------------
        // consultation_31_01_23
        // 1.Написать программу, определяющую является ли целое число положительным,
        // отрицательным или нулем и выводящую соответствующее сообщение на экран.

        //int n = 0;
        //number is zero
        //n = 34;
        //number is positive
        /*if (n > 0) {
            System.out.println("number is positive");
        } else if (n < 0) {
            System.out.println("number is negative");
        } else {
            System.out.println("number is zero");
        }*/

        // вариант - 2:

        /*if (n > 0) System.out.println("number is positive");
        if (n < 0) System.out.println("number is negative");
        if (n == 0) System.out.println("number is zero");*/
        //-----------------------------------------------------------------------------------------

        // 2.Напишите программу, которая принимает три числа и выводит на экран "All numbers are equal",
        // "All numbers are different", "Some numbers are equal"  в соответствующих случаях

        /*int x1 = 8;
        int y1 = 8;
        int z1 = 8;

        if (x1 == y1 && x1 == z1) {
            System.out.println("All numbers are equal");
        } else if ((x1 == y1) || (x1 == z1) || (y1 == z1)) {
            System.out.println("Some numbers are equal");
        }else {
            System.out.println("All numbers are different");
        }*/
        //------------------------------------------------------------------------------------------







        //System.out.println("Hello world!");
    }
}