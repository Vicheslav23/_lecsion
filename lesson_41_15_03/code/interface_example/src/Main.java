public class Main {
    public static void main(String[] args) {
        
        System.out.println("Пример интерфейса в Java");

        Vehicle vehicle = new Vehicle(); // создать объект (create object)
        vehicle.moveFast(); // использовать метод из интерфейса Move (use method from Interface Move)
        vehicle.moveSlow(); // использовать метод из интерфейса Move (use method from Interface Move)
    }
}