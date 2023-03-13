import java.util.ArrayList;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        ArrayList <String> namesList = new ArrayList <String>(
                Arrays.asList("Peter","Vladimir","Stepan", "Sasha"));

        System.out.println(namesList);

        System.out.println();
        for (String st : namesList) {
            System.out.println(st);
        }

        System.out.println("------ Первый вариант ------");
        ArrayList<String> arr = new ArrayList<>(
                Arrays.asList("1", "2", "3", "4", "5")
        );
        System.out.println(" -- Вывод исходного массива -- \n" + arr + "\n_______");
        System.out.println(" -- Вывод массива в цикле -- ");
// Ключевая часть начало:
        for (String item : arr) {
            item = "9999";
            System.out.printf("%s | ", item);
        }
// Ключевая часть конец.
        System.out.println("\n_______\n -- Исходный массив не изменился -- \n" + arr);

        System.out.println("\n\n ------ Второй вариант ------ \n");
        System.out.println(" -- Вывод исходного массива -- \n" + arr + "\n_______");
        System.out.println(" -- Вывод массива в цикле -- ");
// Ключевая часть начало:
        int i = 0;
        for (String item : arr) {
            arr.set(i, "9999");
            i++;
            System.out.printf("%s | ", item);
        }
// Ключевая часть конец.
        System.out.println("\n_______\n -- Исходный массив ИЗМЕНИЛСЯ -- \n" + arr);

    }
}