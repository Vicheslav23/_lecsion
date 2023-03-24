public class Car implements Comparable<Car> {
    int year;
    int price;
    int mileage;
    int horsepower;
    String name;

    public Car(int year, int price, int mileage, int horsepower, String name) {
        this.year = year;
        this.price = price;
        this.mileage = mileage;
        this.horsepower = horsepower;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Автомобиль: " +
                "год выпуска - " + year +
                ", цена - " + price +
                " у.е, пробег - " + mileage +
                ", лошадиные силы - " + horsepower +
                ", марка - " + name + '\n' +
                ' ';
    }

   @Override
    public int compareTo(Car anotherCar) {
        if (this.year == anotherCar.year) {
            return 0;
        } else if (this.year < anotherCar.year) {
            return -1;
        } else {
            return 1;
        }
    }

  /*  @Override
    public int compareTo(Car anotherCar) {
        if (this.horsepower == anotherCar.horsepower) {
            return 0;
        } else if (this.horsepower < anotherCar.horsepower) {
            return -1;
        } else {
            return 1;
        }
    }*/
}
