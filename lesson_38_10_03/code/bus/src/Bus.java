public class Bus {
    /*
        Создать класс Bus с атрибутами: номер маршрута, водитель, вместимость 36 мест, скорость на маршруте
        (не может быть больше 60 км/ч), стоимость проезда 2 евро.

         В классе Bus создайте метод setDriver, который принимает имя драйвера и назначает его водителем автобуса.

        Сформируйте информцию об автобусе в следующем виде:
        Информация об автобусе:
        Номер маршрута : __
        Вместимость: ___ кресел
        Водитель: _____
        Скорость на маршруте: _____ */
    int route_number;
    String name;
    int capacity;
    int speed;
    int price;

    public Bus(int route_number, String name, int capacity, int speed, int price) {
        this.route_number = route_number;
        this.name = name;
        this.capacity = 36;
        if (speed <= 60) {
            this.speed = speed;
        } else {
            System.out.println("Автобус с очень большой скоростю - это небезпасно");
        }
        this.price = price;
    }
    @Override
    public String toString() {
        return "Информация об автобусе:" +
                " номер маршрута: " + route_number +
                ", водитель: " + name +
                ", вместимость: " + capacity +
                " мест, скорость на маршруте: " + speed +
                " км/ч" +
//                ", price=" + price +
                ' ';
    }
    public void setName(String name) {
        this.name = name;
    }
}
