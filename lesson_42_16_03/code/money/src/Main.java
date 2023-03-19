public class Main {
    public static void main(String[] args) {

        System.out.println("Сравнение для класса Money");

        Money m1 = new Money(1000,"usd");
        m1.toString();
        System.out.println(m1);

        Money m2 = new Money(100, "usd");
        System.out.println(m1.equals(m2));
    }
}