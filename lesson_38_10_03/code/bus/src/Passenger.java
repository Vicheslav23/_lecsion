public class Passenger {

//    Создать класс Passenger с атрибутами: имя, возраст (должен быть старше 10 лет).

    String name;
    int age;

    @Override
    public String toString() {
        return "Пассажир: " +
                " имя: " + name +
                ", возраст: " + age +
                ' ';
    }

    public Passenger(String name, int age) {
        this.name = name;
        if (age > 10) {
            this.age = age;
            System.out.println("Oплачиввй за проезд");
        } else {
            this.age = age;

        }
    }
}
