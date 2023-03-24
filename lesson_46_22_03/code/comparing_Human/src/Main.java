import java.util.*;

import static java.util.Arrays.sort;

public class Main {
    public static void main(String[] args) {
//  Пример класса Human - сделать сортируемые списки по полям класса.

        System.out.println("Сравнение объектов класса Human");
        System.out.println();

        Human peter = new Human("Петр", 200, 78, 27);
        Human daniil = new Human("Даниил", 178, 83, 22);
        Human viktor = new Human("Виктор", 182, 90, 24);
        Human andrei = new Human("Андрей", 165, 45, 18);
        Human yakov = new Human("Яков", 170, 65, 23);
        Human alex = new Human("Алексей", 185, 65, 23);

        String[] names = {"Петр", "Даниил", "Виктор", "Андрей", "Яков", "Алексей"}; // массив строк с именами

        Human[] humans = {peter, daniil, viktor, andrei, yakov, alex}; // массив объектов типа Human

        ArrayList list = new ArrayList<>();
        list.add(peter);
        list.add(daniil);
        list.add(viktor);
        list.add(andrei);
        list.add(yakov);
        list.add(alex);

        Collections.sort(list, new HumanByNameComparator());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println();

        Collections.sort(list, new HumanByHeightComparator());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println();

        Collections.sort(list, new HumanByWeightComparator());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println();

        Collections.sort(list, new HumanByAgeComparator());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}