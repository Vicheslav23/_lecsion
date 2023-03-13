import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

// Задача 2  Создать список из 100 целых случайных чисел в интервале от 1 до 99,
// с помощью HashSet исключить повторы(дубликаты) и вывести на печать количество уникальных элементов
// полученного множества.

        System.out.println("Создать список из целых случайных чисел от 1 до 99, с помощью HashSet");
        System.out.println();

        int[] randomNumbers = new int[100];
        System.out.println("Список из 100 целых случайных чисел в интервале от 1 до 99:");
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = (int) ((Math.random() * (100 - 1 + 1) + 1));

            System.out.print(randomNumbers[i] + " ");
        }
        System.out.println();

        HashSet<Integer> numbers = new HashSet<Integer>();

        for (int i = 0; i < randomNumbers[i]; i++) {
            numbers.add(randomNumbers[i]);
        }
        int num = numbers.size();
        System.out.println("Количество уникальных элементов: " + num);

        for (Integer st : numbers) {
            System.out.print(st + " ");
        }
    }
}