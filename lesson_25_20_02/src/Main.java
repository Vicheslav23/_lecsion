import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        System.out.println("Латинский алфавит");
        // Заполним множество символами латинского алфавита в цикле for
        // код символа "A" - 65, код символа "B" - 66, и т.д. до код "Z" = 90.

        HashSet<String> latAlphabet = new HashSet<String>(); //инициализация HashMap
        System.out.println();
        // заполняем HashSet в цикле
        for ( int i = 0 ; i < 26 ; i++ ) {
            latAlphabet.add(String.valueOf((char)(i + 65))); // берем букву, соответствующую символу
        }
        System.out.println(latAlphabet); // печать полученного сета
        // Добавим опять, еще раз букву K
        latAlphabet.add("K");
        System.out.println();
        System.out.println(latAlphabet); // печать сета
    }
}