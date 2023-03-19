public class Main {
    public static void main(String[] args) {
        System.out.println("Задача про аэробус");

//  Реализовать классы Airplan и Pilot, назначить пилота на рейс на конкртеном самолете.

        Airplan airplan1 = new Airplan(36);

        Pilot pilot1 = new Pilot("",29,"2");
        pilot1.go(airplan1);
        System.out.println("Водитель автобуса: " + airplan1.getpilot().name);


    }
}