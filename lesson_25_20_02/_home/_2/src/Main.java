import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Задача 3
//  В автосервисе решили узнать, сколько всего уникальных машин они обсужили за время своей работы.
//  В архиве имеются все заказ-наряды, в которых зафиксированы VIN обслуженных машин.
//  Написать приложение для автосервиса, проверить его работу на тестовом наборе данных для 10 автомобилей
//  (VIN машин запросить у коллег из группы). Пусть VIN содержит 2 буквы и 3 цифры.

        System.out.println("Ввод VIN кода обслуженных машин");
        Scanner userInput = new Scanner(System.in);

        String VIN_code = "";
        char userChoice;
        int hash = 0;

        HashSet<String> vinCode = new HashSet<String>();

        do {
            System.out.println("Введите VIN автомобиля: ");
            VIN_code = userInput.next();
            vinCode.add(VIN_code);

            System.out.println("Для для остановки нажмите S, чтобы продолжить - любую другую букву.");
            userChoice = userInput.next().toLowerCase().charAt(0);
            if (userChoice == 's') {break;}
        } while (true);

        System.out.println("Введенные VIN коды автомобиля: ");
        System.out.println(vinCode);
        System.out.println();

        for (String st : vinCode) {
            System.out.println(st);
        }
        System.out.println();
        do {
            System.out.println("Проверка, есть ли уже такой VIN код?");
            System.out.println("Введите VIN код: ");
            VIN_code = userInput.next();
            if (vinCode.contains(VIN_code)) {
                System.out.println("Да, такой VIN код уже есть.");
            } else {
                System.out.println("Нет, такого VIN код еще нет.");
            };
            System.out.println("Для для остановки проверки нажмите s, чтобы продолжить - любую другую букву.");
            userChoice = userInput.next().toLowerCase().charAt(0);
            if (userChoice == 's') {break;}
        } while (true);

    }
}