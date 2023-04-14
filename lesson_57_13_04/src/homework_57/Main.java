package homework_57;

public class Main {
    public static void main(String[] args) {

//    Написать следующие лямбды используя наши интерфейсы

//    1. сложить строки a и  b
//    2.есть строка, если ее длина равна 3 вернуть true  иначе  false
//    3.Есть строка string распечатать ее в виде !string!

        StringConcate stringConcate = (a, b) -> a.concat(b);
        System.out.println(stringConcate.concat("Hallo ", "world"));

        Checkable checkable = (a) -> ((a.length() == 3) ? true : false);
        System.out.println(checkable.check("Hallo"));
        System.out.println(checkable.check("abc"));

        Printable printable = (a) -> "!" + a + "!";
        System.out.println(printable.print("string"));
    }
}
