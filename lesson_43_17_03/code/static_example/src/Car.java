public class Car {
    static final String platform = "Number one";
    int age;
    static String color; // изиенилась переменная на static используя модификатор static в методе
//    String color;

    public Car(int age, String color) {
        this.age = age;
        this.color = color;
    }
//    используем модификатор static в методе
    public static void paint() {

        System.out.println("Автомобиль покрашен в " + color + " цвет");
    }

//    public void paint() {
//        System.out.println("Автомобиль покрашен в " + this.color + " цвет");
//    }

    @Override
    public String toString() {
        return "Car{" +
                "age=" + age +
                ", color='" + color + '\'' +
                ", Platform= " + platform + '}';
    }
}
