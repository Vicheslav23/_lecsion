public class Bus {
    int bus_line; // номер маршрута
    public Driver driver; // водитель взят из класса Driver
    int capacity; // вместимость
    int speed; // скорость автобуса
    int price; // стоимость проезда

    public Bus(int bus_line, int capacity, int speed, int price) {
        this.bus_line = bus_line;
        this.capacity = capacity;
        this.speed = speed;
        this.price = price;
    }

    // сеттер назначает водителя для класса Bus из класса Driver
    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    // метод, который связывает автобус и водителя
    public void go() {
        System.out.println("Автобус " + this.bus_line + " поехал под управлением - " + driver.getName());
    }

    public Driver getDriver() {
        return driver;
    }

    @Override
    public String toString() {
        return "Информация об автобусе: " + "\n" +
                "Номер маршрута: " + bus_line + "\n" +
                "Вместимость: " + capacity + " кресел " + "\n" +
                "Водитель: " + getDriver().name + "\n" +
                "Скорость на маршруте: " + speed  +  ". ";
        // ", price=" + price +;
    }
}
