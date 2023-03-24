public class Auto extends Car {
    String brand;
    int capacity;

    // конструктор класса
    public Auto(int age, String usage, int speed, String brand, int capacity) {
        super(age, usage, speed);
        this.brand = brand;
        this.capacity = capacity;
    }
    @Override
    public void go() {
        System.out.println("Едем по дороге всей семьей");
        this.speed = speed;
    }
    @Override
    public void stop() {
        System.out.println("Автомобиль остановился");
        speed = 0;
        System.out.println("Скорость: " + speed);
    }
    @Override
    public void speed_up() {
        super.speed_up();
    }
}
