import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        System.out.println("Сравнения Домов");

        House house1 = new House(100, 150000, "Hannover");
        House house2 = new House(85, 135000, "Pattensen");
        House house3 = new House(75, 183000, "Berlin");
        House house4 = new House(150, 75000, "Kharkiv");

        TreeSet  houses = new TreeSet<>();

        houses.add(house1);
        houses.add(house2);
        houses.add(house3);
        houses.add(house4);

        System.out.println(houses);

    }
}