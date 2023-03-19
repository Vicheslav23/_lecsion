import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Разделим группу студентов на две группы случайным образом");
        String path = "/Users/leonidk/Library/Mobile Documents/com~apple~CloudDocs/Documents/Моя работа/Курс Java Core/cohort23.2/basic_programming/lesson_35/code/two_group_random/src/";
        String fileName = "group.txt";
        List<String> groupList = new ArrayList<>(); // задаем массив для списка группы
        fillingList(groupList, path, fileName); // заполняем список
        // печатаем список группы как он в файле (в алфавитном порядке)
        for (String st : groupList) {
            System.out.print(st + " | ");
        }
        System.out.println();
        // перетасовываем список в случайном порядке
        Collections.shuffle(groupList);  // метод shuffle в Collections тасует случайным образом элементы коллекции
        // печатаем список группы после случайной перетасовки
        for (String st : groupList) {
            System.out.print(st + " | ");
        }
        System.out.println();
        int l = groupList.size(); // узнаем длину списка
        int l1 = l / 2; // узнаем длину "половинки" группы
        int l2 = l - l1; // узнаем длину второй "половинки" группы
        System.out.println("Размер 1-й группы " + l1 + ". Размер 2-й группы " + l2); // печатаем длины новых списков
        List<String> groupList1 = new ArrayList<>(); // определяем массив под список 1-й группы
        List<String> groupList2 = new ArrayList<>(); // определяем массив под список 2-й группы
        // разделяем список на два списка
        // это 1-я группа
        fillingList1(groupList, groupList1, l1);
        // это 2-я группа
        fillingList2(groupList, groupList2, l2);
        // печатаем список первой группы
        for (String st : groupList1) {
            System.out.print(st + " | ");
        }
        System.out.println();
        // печатаем список второй группы
        for (String st : groupList2) {
            System.out.print(st + " | ");
        }
    }

    // метод заполняет список 1-й группы
    private static void fillingList1(List<String> array_old, List<String> array_new, int l) {
        for (int i = 0; i < l; i++) {
            array_new.add(array_old.get(i)); // берем элемент из перетасовнного случайно списка в новый список
        }
    }

    // метод заполняет список 2-й группы
    private static void fillingList2(List<String> array_old, List<String> array_new, int l) {
        for (int i = 0; i < l; i++) {
            array_new.add(array_old.get(i + l - 1)); // берем элемент из перетасовнного случайно списка в новый список
        }
    }

    // метод заполняет список из файла
    private static void fillingList(List<String> array, String p, String fn) {
        try {
            File myFile = new File(p + fn); // задаем считыватель из файла
            Scanner myReader = new Scanner(myFile); // готовим сканер для чтения
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine(); // считываем строку
                array.add(data); // добавляем считаную строку в список array
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Произошла ошибка, такого файла нет.");
            e.printStackTrace();
        }
    }
}