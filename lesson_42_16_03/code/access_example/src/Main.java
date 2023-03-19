public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Person person = new Person("Viacheslav", 51, "Dorfstrasse, 5a", "050 300 58 03");
        person.displayName();
        person.displayAge();
        person.displayPhone();
//      person.displayAddress();
    }
}