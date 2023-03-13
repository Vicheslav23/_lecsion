import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("Подсчитать количество слов в предложении, "+
                "занести слова из предложения в ArrayList (слова разделены пробелами, знаки препинания не учитываются");

        // Задача 2. Подсчитать количество слов в предложении, занести слова из
        // предложения в ArrayList (слова разделены пробелами, знаки препинания не учитываются)
        // Предложение: Все счастливые семьи похожи друг на друга, каждая несчастливая семья несчастлива по-своему.
        // Ключевой алгоритм - ищем пробелы и подсчитываем их количество.
        // задаем предложение

        System.out.println("Все счастливые семьи похожи друг на друга, каждая несчастливая семья несчастлива по-своему.");
        System.out.println();

        String sentence = "Все счастливые семьи похожи друг на друга, каждая несчастливая семья несчастлива по-своему.";
        int lengthOfSentence = sentence.length(); // длина предложения
        int count = 0; // счетчик пробелов
        // проходим циклом по всей длине предложения, если найден " ", то count++
        for (int i = 0; i < lengthOfSentence; i++) {
            int st = sentence.charAt(i);
            if (st == ' ') {
                count++;
            }
        }
        System.out.println("В предложении " + count + " пробелов и " + (count + 1) + " слов.");

        System.out.println();

        //        1 -й вариант

        /*String[] s = sentence.split(" "); // преобразуем предложение в массив слов
        // проверочная печать
        for (int i = 0; i < s.length; i++) {
            // System.out.print(s[i] + " | ");
        }
        System.out.println();
        // Заносим слова в список
        ArrayList<String> wordsInSentence = new ArrayList<String>();
        for (int i = 0; i < count + 1; i++) {
            wordsInSentence.add(i, s[i]);
        }
        System.out.println(wordsInSentence);*/

//        2- й вариант

        String sentence1 = "Все счастливые семьи похожи друг на друга, каждая несчастливая семья несчастлива по-своему.";

        String[] s1 = sentence1.split(" "); // пробел указан в кавычках!!

        for ( int i = 0 ; i < s1.length  ; i++ ) {
            System.out.print(s1[i] + " | ");
        }
        System.out.println();

        ArrayList<String> sentenceWords = new ArrayList<String>();
        for ( int i=0 ; i <  s1.length ; i++ ) {
            sentenceWords.add(i , s1 [i]);
        }
        System.out.print(sentenceWords);

    }
}