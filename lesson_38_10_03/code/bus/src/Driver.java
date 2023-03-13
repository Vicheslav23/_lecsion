public class Driver {

    /* Создать класс Driver с атрибутами: имя водителя,
    возраст водителя (должен быть старшше 21 года и
    не старше 65 лет).*/

    String name;
    int age;

    @Override
    public String toString() {
        return "Водитель -" +
                " фамилия: " + name +
                ", возраст водителя: " + age +
                ' ';
    }
    public Driver(String name, int age) {
        this.name = name;
        if (age > 21 && age < 65) {
            this.age = age;
        } else {
            this.age = age;
            System.out.println("Возраст водителя не подходит");
        }
    }

}
