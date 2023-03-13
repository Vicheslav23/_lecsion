import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

//        Задача 1
//        Создать список из своей профессиональной области. Выполнить с ним все действия, как на уроке.
//        Придумать, спросить о каких-то еще возможных операциях с листом.
        /*ArrayList<String> shoppingList = new ArrayList<String>();

        shoppingList.add("Круассан");
        shoppingList.add("Кофе");
        shoppingList.add("Сливки");
        shoppingList.add("Сахар");
        shoppingList.add("Масло");
        shoppingList.add("Коньяк");

        System.out.println(shoppingList);

        int size = shoppingList.size();
        System.out.println("Размер листа, который создали: " + size);

        int index = shoppingList.indexOf("Коньяк");
        System.out.println("Номер " + "Коньяк" + "в списке " + index);

        shoppingList.remove(3);
        System.out.println(shoppingList);

        boolean shoppingListPresents = shoppingList.contains("Круассан");
        System.out.println(shoppingListPresents);

        if (shoppingList.contains("Круассан") == false) {
            shoppingList.add("Круассан");
        }
        System.out.println(shoppingList);

        if (shoppingList.contains("Помада") == false) {
            shoppingList.add("Помада");
        }
        System.out.println(shoppingList);
        System.out.println("------------------");

        for (int i = 0; i < shoppingList.size(); i++) {
            System.out.println(i + " " + shoppingList.get(i));
        }
        System.out.println("------------------");

        Collections.sort(shoppingList);

        for (int i = 0; i < shoppingList.size(); i++) {
            System.out.println(i + " " + shoppingList.get(i));
        }*/

//        Задача 2
//Имеются результаты забега на 100 метров группы бегунов из 10 участников.
// Внести эти результаты в компьютер согласно протоколу.
// Отсортировать результаты, напечатать кто занял 1-е и кто занял последнее место.

        ArrayList<String> protocolOfResults = new ArrayList<String>();

        protocolOfResults.add("12.03 сек - участник под номером 1");
        protocolOfResults.add("11.09 сек - участник под номером 2");
        protocolOfResults.add("10.02 сек - участник под номером 3");
        protocolOfResults.add("10.05 сек - участник под номером 4");
        protocolOfResults.add("10.08 сек - участник под номером 5");
        protocolOfResults.add("10.03 сек - участник под номером 6");

        System.out.println(protocolOfResults);

        Collections.sort(protocolOfResults);

        for (int i = 0; i < protocolOfResults.size(); i ++) {
            System.out.println( i + " " + protocolOfResults.get(i));
        }
    }
}