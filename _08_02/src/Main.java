public class Main {
    public static void main(String[] args) {

        /* Задача 1: Опрелеить массив для хранения 10 чисел.
         Заполнить массив целыми числами кратными 10 от 10 до 100.
          Распечатать элементы массива в виде:
          Element at index 0: значение эленета.
         */
        /*int[] numArray = new int[10];
        for (int i = 0; i < 10; i++) {
            numArray[i] = i * 10 + 10;
            System.out.println(" Element at index " + i + " " + numArray[i]);
        }
        int sum = 0;
        for ( int i = 0; i < numArray[i]; i++) {
            sum = sum + numArray[i];
        }
            System.out.println(" Sum of elements of Array is: " + sum);*/
        //-------------------------------------------------------------------
        /*Задача 3. Даны оценки двух учеников за четверть:
         Ученик1: 5, 3, 3, 4, 5, 4, 5, 5
         Ученик2: 3, 4, 5, 5, 2, 5, 4
         Найдите средний балл для каждого ученика и выясните, кто из них лучше учится.
         */
        /*int [] myArray1 = new int[]{5, 3, 3, 5, 4, 5, 5};
        int [] myArray2 = new int[]{3, 4, 5, 5, 2, 5, 4};

        double sum1 = 0;
        double sum2 = 0;

        double average1 = 0;
        double average2 = 0;

        for (int i = 0; i < myArray1.length; i++) {
            sum1 += myArray1[i];
            average1 = sum1 / myArray1.length;
        }
        System.out.println(sum1);
        System.out.println(average1);

        for (int i = 0; i < myArray2.length; i++) {
            sum2 += myArray2[i];
            average2 = sum2 / myArray2.length;
        }
        System.out.println();
        System.out.println(sum2);
        System.out.println(average2);

        System.out.println();
        System.out.println("Средний балл ученика 1 = " + average1);
        System.out.println("Средний балл ученика 2 = " + average2);

        if (average1 > average2) {
            System.out.println("Ученик 1 учится лучше");
        } else {
            System.out.println("Ученик 2 учится лучше");
        }*/
        //-----------------------------------------------------------------------------------
        // Задача 1. Создать массив, в котором храняться названия дней недели.
        // Вывести на печать выходные дни.
        /*String[] dayWeek = new String [] {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        for (int i = 5; i < dayWeek.length; i++){

            System.out.println(dayWeek[i]);
        }
        //---------------------------------------------------------------------------------------------------
        // Задача 2. Создать массив, содержащий данные о дневной температуре в вашем городе с начала февраля 2023 года.
        // Определить среднюю температуру месяца.
        int[] temperature = new int[] { 2, 1, -2, 0, 3, 5, 4, -3};
        double sum = 0;
        double average = 0;

        for (int i = 0; i < temperature.length; i++) {
            sum += temperature[i];
            average = sum / temperature.length;
        }
        System.out.println("Average temperature: " + average);*/

        //------------------------------------------------------------------------------------------------------
        //Задача 3(*). Создать массив, в котором храняться даты и температуры.
        // Вывести на печать таблицу с данными по температуре по дням и среднюю температуру за период наблюдения.
        int[] temperature = new int[] {2, 1, -2, 0, 3, 5, 4};
        String[] dayWeek = new String [] {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };

        for (int i = 0; i < temperature.length; i++){
            System.out.println(dayWeek[i] + ": " + temperature[i]);
        }
        double sum = 0;
        double average = 0;

        for (int i = 0; i < temperature.length; i++) {
            sum += temperature[i];
            average = sum / temperature.length;
        }
        System.out.println("Average temperature: " + average);

        System.out.println();






    }
}