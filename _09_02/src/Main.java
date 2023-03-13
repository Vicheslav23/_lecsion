public class Main {
    public static void main(String[] args) {

        // арифметическая прогрессия A(n) = A1 + d*(n-1), d - разница прогресии, A1 - первый член
        // Пусть A1 = 15, d = 7, сформировать массив из 10 первых чисел такой арифметической прогрессии
        // вывести на печать в строчку

        /*System.out.println("Арифметическая прогрессия: ");

        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = 15 + 7 * i;
            System.out.print(a[i] + " | ");
        }
        System.out.println();
        System.out.println();
        //----------------------------------------------------------------------------------------------
        // заполнение случайными числами
        // бросаем кубик с 6-ю гранями 20 раз

        System.out.println("Бросаем кубик 20 раз: ");

        int[] score = new int[20];
        for (int i = 0; i < score.length; i++) {
            score[i] = (int) ((Math.random() * (6 - 1 + 1) + 1));
            System.out.print(score[i] + " | ");
        }*/
        //-----------------------------------------------------------------------------------------------
        /*Задача 1. Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в строку,
        а затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 … 7 5 3 1).*/
//В переменной а будет храниться значение размера массива, которое мы получим с помощью простого цикла
        /*int a=0;
        for(int i=1;i<=99;i++){
            if(i%2!=0)a++;
        }
        //Создадим массив, и используя цикл, заполним его ячейки. Сразу выведем на экран значения элементов массива в строку
        int[] Mas = new int[a];
        for(int i=1,b=0;i<=99;i++){
            if(i%2!=0){
                Mas[b]=i;
                System.out.print(Mas[b]+" ");
                b++;
            }
        }
        //Выведем на экран каждый элемент массива на отдельной строке в обратном порядке
        System.out.println(" ");
        //for(int i=Mas.length-1;i>=0;i--){
           // System.out.print(Mas[i]);
        //}*/
        /*Задача 1. Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в строку,
        а затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 … 7 5 3 1).

        int num = 0;

        for (int i = 1; i <= 99; i++){
            if (i % 2 != 0) num++;
        }
        int [] oddNumber = new int[num];

        for (int i = 1, num1 = 0; i <= 99; i++){
            if ( i % 2 != 0) {
                oddNumber[num1] = i;

                System.out.print(" " + oddNumber[num1]);
                num1 ++;
            }
        }
        System.out.println();
        for (int i = oddNumber.length - 1; i >= 0; i-- ){
            System.out.print(" " + oddNumber[i]);
        }*/

        /*Задача 2. Запустить "Рулетку" 20 раз. В "Рулетке" на круге 36 ячеек, куда может попасть шарик,
        и два цвета - красный, черный. Результат попытки вывести так:
        "Выиграл номер NN, четное или нечетное, цвет"*/
        /*int a = 0;
        int b = 36;
        int[] roulette = new int[20];
        for (int i = 0; i < roulette.length; i++){
            roulette[i] = (int) ((Math.random() * (b - a + 1) + a));
            System.out.print(roulette[i] + " ");
        }
        System.out.println();

        for (int i = 0; i <= roulette.length - 1; i++) {
            if ((roulette[i] % 2) == 0) {
                System.out.print("Even number: " + roulette[i] + " ");
            } else {
                System.out.print("Odd number: " + roulette[i] + " ");
            }
        }

        /*int[] color = new int[35];

            for (int i = 0; i <= color.length - 1; i++) {

                if (i == 0) {
                    String colors = "green";
                    System.out.println( colors + ": " + color[i]);
                }
            }*/



        /*Задача 3. Смоделировать поведение биржевого индекса в течение месяца.
         Биржевой индекс выбрать самостоятельно, данные о его изменениях взять из Интернета,
          месяц - январь 2023 года.*/



//        Задача 4. Создайте массив из 20-ти первых чисел Фибоначчи и выведите его на экран.
//        Первый и второй члены последовательности Фибоначчи равны единицам,
//        а каждый следующий — сумме двух предыдущих.

        int num1 = 0;
        int num2 = 1;
        int[] fibon = new int[20];
        for (int i = 1; i < fibon.length; i++ ){
            if ( i < 2){
                fibon[i] = 1;
            } else {
            fibon[i] = num1 + num2;
            num1 = num2;
            num2 = fibon[i];}

            System.out.print(fibon[i] + " ");
        }




    }
}