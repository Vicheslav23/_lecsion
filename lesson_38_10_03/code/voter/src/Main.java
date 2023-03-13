public class Main {
    public static void main(String[] args) {

//        Задача об Избирателе, ему болжно быть более 16 лет.

        System.out.println("Контроль возраста избирателя на уровне конструктора класса");
        System.out.println();

        Voter v1 = new Voter("Willy", "123456789", 15); //  вызов конструктора объекта класса
        System.out.println(v1);
        System.out.println();

        Voter v2 = new Voter("Andres", "987654321", 35); //  вызов конструктора объекта класса
        System.out.println(v2);
        System.out.println();

        Voter v3 = new Voter("", "", 47);




    }
}