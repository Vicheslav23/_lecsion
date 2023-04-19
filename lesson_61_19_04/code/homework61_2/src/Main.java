import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        // Задача2
        //Используя стримы написать метод, принимающий строку, состоящую из слов, разделенных пробелом и букву
        // и возвращающий количество слов, начинающихся с этой буквы.
        //long countWords (String input, String letter)
        //
        //пример: принимает "aaa ffff aa bbbb a bb aaa gggggggggggggg" и "a" -> возвращает 4 ,
        // т.к. слово, начинающееся на a встречается 4 раза

        String string = "aaa ffff aa bbbb a bb aaa gggggggggggggg";
        System.out.println(countWords(string,"a"));
    }
    public static long countWords (String input, String letter){
        long counter = Stream.of(input.split(" "))
                .filter(word ->word.startsWith(letter))
                .count();
        return counter;
    }

}