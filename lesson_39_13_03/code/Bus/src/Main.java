public class Main {
    public static void main(String[] args) {
        System.out.println("Задача про автобус.");

        // Создаём автобус
        Bus bus1 = new Bus( 1, 36, 60, 2);

        // Создаем водителя
        Driver d1 = new Driver("Водила Водилов", 25);

        // назначаем водителя на автобус
        d1.go(bus1);
        System.out.println("Водитель автобуса: " + bus1.getDriver().name);

        System.out.println();
        // печатаем информацию о маршруте
        System.out.println(bus1);

        // рассчет потенциальной выручки
        int revenue = 0;
        revenue = (int)(0.6 * bus1.capacity) * 5 * bus1.price;

        System.out.println("Потенциальная дневная выручка: " + revenue);
    }
}