import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        System.out.println("Сравнения автомобилей");

        Car car1 = new Car(2014, 5500, 123000, 105, "Opel");
        Car car2 = new Car(2020, 10500, 55000, 120, "BMW");
        Car car3 = new Car(2005, 3500, 250000, 100, "Audi");
        Car car4 = new Car(2010, 4500, 170000, 95, "Ford");
        Car car5 = new Car(2000, 7500, 253000, 92, "Mercedes");

        TreeSet cars = new TreeSet<>();

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);

        System.out.println(cars);





    }
}