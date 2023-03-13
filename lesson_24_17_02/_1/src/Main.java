import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Задача 1. Вывести слово задом наперед. Пример:
        //Дано слово "троллейбус"
        //Результат работы программы "cубйеллорт"

        System.out.println("Написания слова задом наперед");

        String word = "троллейбус"; // задаем слово
        int lengthOfWord = word.length(); // определяем длину слова
        System.out.println("Длина слова = " + lengthOfWord); // вывод длины слова
        ArrayList<String> letters = new ArrayList<String>(); // создаем массив для букв из слова
        // Цикл в котором заполняем лист буквами из слова
        for (int i = 0; i < lengthOfWord; i++) {
            letters.add(String.valueOf(word.charAt(i))); // из слова берем каждую букву
        }
        System.out.println(letters); // вывод листа букв, из которых состоит слово
        ArrayList<String> lettersRev = new ArrayList<String>(); // создаем новый массив для слова наоборот
        // цикл, в котором будем
        // зписывать в 1-й элемент листа lettersRev
        // последний элемент листа letters, потом во 2-й предпоследний и т.д.
        for (int i = 0; i < lengthOfWord; i++) {
            String st = letters.get(lengthOfWord - 1 - i);
            lettersRev.add(i, st);  // заполняем лист буквами в обратном порядке
        }
        System.out.println(lettersRev); //печать листа



    }
}