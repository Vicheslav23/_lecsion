public class Main {
    public static void main(String[] args) {

        System.out.println("Пример создания класса");

        // создание класса внутри класса Main
        class Car { // придумали имя класса

            // описали главные его поля, характиристики:
            String brand; // марка - Audi, BMW, Mercedes, Opel, ...
            String type; // тип - седан, универсал, внедорожник, ...
            String color;
            int year; // год выпуска
        }

        Car myCar = new Car();
        myCar.brand = "Opel";
        myCar.type = "miniVan";
        myCar.color = "white";
        myCar.year = 2014;

        System.out.println("My car: " + myCar.brand + ", " + myCar.type + ", год выпуска: " + myCar.year + ", цвет: " + myCar.color);
        System.out.println();

        // использование класса, определенного в другом файле

        Pet myPet = new Pet();
        myPet.type = "Cat";
        myPet.breed = "Mestizo";
        myPet.name = "Katty";
        myPet.weight = 4.50;

        System.out.println("My pet: " + myPet.type + ", порода: " + myPet.breed + ", name: " + myPet.name + ", weight: " + myPet.weight + " kg.");
        System.out.println();
        System.out.println(myPet.toString());
//        System.out.println("Вес: " + myPet.getWeight());


    }
}