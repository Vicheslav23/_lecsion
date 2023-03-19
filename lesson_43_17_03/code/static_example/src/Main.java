public class Main {
    public static void main(String[] args) {
        System.out.println("Эксперимент с модификатором static ");

        Car car1 = new Car(0,"red");
        car1.paint();

        System.out.println(car1);

        Auto auto1 = new Auto(0, "white", 5);
        auto1.paint();
        System.out.println(auto1);

    }
}