import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //CLASSROOM

       /* Homework
        Написать программу, проверяющую является ли число четным или нечетным.
        Решить задачу двумя способами -через оператор if и через тернарный оператор.
        num%2 ==0
                */
        // Вариант - через оператор if :
        int num = 2;

        if (num % 2 == 0) {
            System.out.println(num + " is even number");
        } else {
            System.out.println((num + " is odd number"));
        }
        // Вариант - через тернарный оператор :

        //     String evenOrOdd = (num % 2 ==0)?"even number":"odd number";

        //------------------------------------------------------------------------------------

        // 1.написать простой калькулятор с четырьмя действиями, используя switch.
        // num1 и num2  +,-, /,*

        /* double num1,num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        num1 = sc.nextDouble();
        System.out.println("Enter the second number: ");
        num2 = sc.nextDouble();
        System.out.println("Enter an operator(+,-,/,*)");
        char operator =sc.next().charAt(0);

        //   sc.close();

        double result=0.0;

        switch (operator){

            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;

            case '*':
                result = num1*num2;
                break;

            case '/':
                result = num1/num2;
                break;

            default:
                System.out.println("Wrong operator");
        }
        if(operator=='+'||operator=='-'||operator=='*'||operator=='/')
            System.out.println(num1+" +operator+"+num2+" = "+result);*/

        //--------------------------------------------------------------------------------------

        //2.Написать программу, проверяющую является ли введенная с клавиатуры буква английского алфавита
        // гласной или  согласной . Написать как switch  и написать через if-else.
        // гласные: a,e,i,o,u,y:

        /* switch :

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");

        char ch1 = scanner.next().charAt(0);

        boolean isVowel=false;

        switch (ch1)
        {
            case 'a':
            case 'y':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            case 'Y':
            case 'e': isVowel =true;
        }*/

        // if - else :
         /* if (isVowel) {
            System.out.println(ch1 + " is a vowel");
        }
        else {
            if ((ch1 >= 'a' && ch1 <= 'z') || (ch1 >= 'A' && ch1 <= 'Z'))
                System.out.println(ch1 + " is a consonant");

            else
                System.out.println("Your symbol is not an english letter");
        }*/
        //---------------------------------------------------------------------------
        //3.Написать программу, находящую количество дней в месяце.
        // С клавиатуры вводятся два значения: номер месяца  и год.
        // А программа выдает количество дней в этом месяце.
        //month= 1 , year=2000 -> 31
        //month= 2 , year = 1999 -> 28
        //month= 2 , year = 2000 -> 29

        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year");
        int year = sc.nextInt();
        System.out.println("Enter month number from 1 to 12");
        int month = sc.nextInt();

        switch (month){
            case 1:
                System.out.println("January, 31 days");
                break;
            case 2:
                int numberOfDaysInFebruary;

                if((year%4==0)&&(((year%100)!=0)||((year%100==0)&&(year%400==0))))
                { numberOfDaysInFebruary =29;
                }
                else{numberOfDaysInFebruary=28;
                }
                System.out.println("February "+numberOfDaysInFebruary);
                break;
            case 3:
                System.out.println("March, 31 days");
                break;
            case 4:
                System.out.println("April, 30 days");
                break;
            default:
                System.out.println("you entered the wrong month number");
        }*/
        //---------------------------------------------------------------------------------------
        // consultation_01_02_23

        /*
        Напишите программу, которая определяет в каком порядке введены  числа .
        Выводит на экран increasing если  числа возрастают (1,2,3) ,
        decreasing если убывают (3,2,1)   и "neither decreasing no increasing"
        в остальных случаях

        int x = 1;
        int y = 2;
        int z = 3;

        if(x<y && y<z) {
            System.out.println("increasing");
        }else if(x>y && y>z){
            System.out.println("decreasing");
        }else {
            System.out.println("neither increasing nor decreasing");
        } */
        //-----------------------------------------------------------------------------------

        /*1.написать программу, которая принимает номер дня недели и выводит на экран название
        этого дня.
        // через switch и через if-else-if
        int day = 1;

        // через switch :

        if(day == 1) {
            System.out.println("Monday");
        }
        else if(day == 2){
            System.out.println("Tuesday");
        }
        else if(day == 3){
            System.out.println("Wednesday");
        }
        else if (day == 4){
            System.out.println("Thursday");
        }
        else if (day == 5){
            System.out.println("Friday");
        }
        else if (day == 6){
            System.out.println("Saturday");
        }
        else if(day == 7)
            System.out.println("Sunday");
        else{
            System.out.println("Please enter a number betwwen 1-7");
        }

        // через if-else-if :

        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Please enter a number betwwen 1-7");
        }         */

        // моё решение
        /*
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter number");
        int num = scan1.nextInt();

        // switch :
        /*switch (num) {
            case 1 : System.out.println(" monday ");
            break;
            case 2 : System.out.println(" Tuesday ");
            break;
            case 3 : System.out.println(" Wednesday ");
                break;
            case 4 : System.out.println(" Thursday ");
                break;
            case 5 : System.out.println(" Friday ");
                break;
            case 6 : System.out.println(" Saturday ");
                break;
            case 7 : System.out.println(" Sunday ");
                break;
            default: System.out.println();
        }*/
        //-------------------------------------------------------------------------------
        // if-else:

        /*  if (num == 1) {
            System.out.println(" monday ");}
        else if (num == 2) {
            System.out.println(" Tuesday ");
            }
        else if (num == 3) {
            System.out.println(" Wednesday ");
        }
            else if (num == 4) {
                System.out.println(" Thursday ");
            }
            else if (num == 5) {
                    System.out.println(" Friday ");
            }
            else if (num == 6) {
                        System.out.println(" Saturday ");
            }
            else if (num == 7) {
                            System.out.println(" Sunday ");
            }
            else { System.out.println("No");}*/
        //-------------------------------------------------------------------------------

        // 2. Написать программу, которая определяет оценку за тест студента
        //        если по результатам теста решено >= 90% вопросов то тогда оценка 5
        //        если по результатам теста решено >=70% вопросов но < 90% вопросов то тогда оценка 4
        //        если по результатам теста решено >=50% вопросов но < 70% вопросов то тогда оценка 3
        //        если по результатам теста решено <50% вопросов  то тогда оценка 2

        /*Scanner scan1 = new Scanner(System.in);
        System.out.println("Введите результат");
        int res = scan1.nextInt();
        if (res >= 90) {
            System.out.println("оценка 5");
        } else if (res >= 70) {
            System.out.println("оценка 4");
        } else if (res >= 50) {
            System.out.println("оценка 3");
        } else if (res < 50) {
            System.out.println("оценка 2");
        } else {
            System.out.println("invalid");
        }*/

        //----------------------------------------------------------------------------------
        // варинт 2;

        int testResult = 89;

        if(testResult>=90) {
            System.out.println("you get 5");
        }
        else if(testResult>=70 && testResult<90){
            System.out.println("you get 4");
        }
        else if(testResult>=50 && testResult<70){
            System.out.println("you get 3");
        }
        else if (testResult<50){
            System.out.println("you get 2");
        }
        else{
            System.out.println("invalid");
        }
























        //System.out.println("Hello world!");
    }
}