public class Main {
    public static void main(String[] args) {

        //написать лямбда выражение такое, что если длина строки = 4, то вернуть четыре звездочки иначе вернуть
        // строку без изменений
        Trahsfomable trahsfomable = s -> s.length() == 4 ? s = "****" : s;
        System.out.println("Trahsfomable");
        System.out.println(trahsfomable.modify("ab"));
        System.out.println(trahsfomable.modify("abcd"));

        // написать лямбда выражение такое, что будет печататься "Hello World"
        Producable producable = () -> "Hello World";
        System.out.println("Producable");
        System.out.println(producable.produce());

//  -------------------------------------------------------


    }
}