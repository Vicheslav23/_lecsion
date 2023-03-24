public class House implements Comparable<House> {
    int area; //площадь дома
    int price;
    String city;

    // создаем конструктор
    public House(int area, int price, String city) {
        this.area = area;
        this.price = price;
        this.city = city;
    }
    // переопределяем метод через toString
    @Override
    public String toString() {
        return "House: " +
                "area = " + area +
                ", price = " + price +
                ", city = " + city + '\n' +
                ' ';
    }
    @Override
    public int compareTo(House anotherHouse) {
        if (this.area == anotherHouse.area) {
            return 0;
        } else if (this.area < anotherHouse.area) {
            return -1;
        } else {
            return 1;
        }
    }
    /* @Override
    public int compareTo(House anotherHouse) {
        if (this.price == anotherHouse.price) {
            return 0;
        } else if (this.price < anotherHouse.price) {
            return -1;
        } else {
            return 1;
        }
    }*/

}
