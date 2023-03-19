public class Auto extends Car{ // дочерный класс Car
    int capacity;

    public Auto(int age, String color, int capacity) {
        super(age, color);
        this.capacity = capacity;
    }
// переопределяем метод
//    @Override
//    public void paint() {
//        super.paint();
//        System.out.println("Красим на конвеере");
//    }

    @Override
    public String toString() {
        return "Auto {" +
                "capacity = " + capacity +
                ", age = " + age +
                ", color = " + color +
                '}';
    }
}
