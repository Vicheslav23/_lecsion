public class Main {
    public static void main(String[] args) {

        System.out.println("Сравнение объектов");
        System.out.println();

        Human h1 = new Human(51, true);
        Human h2 = new Human(51, true);

        System.out.println(h1==h2); // после сравнения будет false, но они одинаковые
        System.out.println(h1.equals(h2)); // после сравнения будет true, теперь правильно =>
                                           // После @Override public boolean equals(Object obj)

        Programmer p1 = new Programmer(51,true,30);

        System.out.println(h1.equals(p1)); // после сравнения будет true, но они разные!!!
                                           // так как у Programmer есть experience


//        System.out.println(p1.equals(h1)); // <= симметрия (поменяли местами h1 и p1) после сравнения будет true, но они разные!!!
                                             // так как у Programmer есть experience

        System.out.println(p1.equals(h1)); // станет false после переопределения (if (obj instanceof Human))

        Programmer p2 = new Programmer(51,true, 25);
//        System.out.println(p1.equals(p2)); // после сравнения будет true, но они разные!!!
                                             // так как experience разный
        System.out.println(p1.equals(p2)); // станет false после переопределения (if (obj instanceof Human))

    }
}