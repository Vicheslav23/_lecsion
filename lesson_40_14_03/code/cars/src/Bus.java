public class Bus extends Car {
    String brand;
    int seats;

    // Конструктор класса


    public Bus(int age, String usage, int speed, String brand, int seats) {
        super(age, usage, speed);
        this.brand = brand;
        this.seats = seats;
    }

    // геттер
    public String getBrand() {
        return brand;
    }

    // сеттер
    public void setBrand(String brand) {
        this.brand = brand;
    }

    // геттер
    public int getSeats() {
        return seats;
    }

    // сеттер
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void go() {
        System.out.println("Едем по дороге c пассажирами");
        this.speed = speed;
    }

    @Override
    public void stop() {
        System.out.println("Автобус остановился");
        speed = 0;
    }

    @Override
    public void speed_up() {
        super.speed_up();
    }

    @Override
    public void speed_down() {
        super.speed_down();
    }
}
