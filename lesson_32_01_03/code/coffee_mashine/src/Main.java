import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Добро пожаловать в нашу кофейню!");
        enum CoffeeType {
            AMERICANO,
            ESPRESSO,
            CAPUCCINO,
            LATTE,
        }
        for (CoffeeType myCoffee : CoffeeType.values()) {
            System.out.println(myCoffee);
        }
//        ---------------------------------------------------------
        System.out.println("Для выбора нажните 1, 2, 3 или 4");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        CoffeeType myCoffee = CoffeeType.ESPRESSO; // инициализация списка, должно быть хотя бы одно значение
        switch (choice) {                          // меню для кофемашины - для пользователя
            case 1: {
                myCoffee = CoffeeType.ESPRESSO;
                break;
            }
            case 2: {
                myCoffee = CoffeeType.AMERICANO;
                break;
            }
            case 3: {
                myCoffee = CoffeeType.CAPUCCINO;
                break;
            }
            case 4: {
                myCoffee = CoffeeType.LATTE;
                break;
            }
        }
        switch (myCoffee) {         // назначаем стоимость
            case AMERICANO -> {
                System.out.println("Стоимость: " + 2 + " евро");
                int coffeePrice = 2;
                break;
            }
            case ESPRESSO -> {
                System.out.println("Стоимость: " + 3 + " евро");
                int coffeePrice = 3;
                break;
            }
            case CAPUCCINO -> {
                System.out.println("Стоимость: " + 4 + " евро");
                int coffeePrice = 4;
                break;
            }
            case LATTE -> {
                System.out.println("Стоимость: " + 5 + " евро");
                int coffeePrice = 5;
                break;
            }
        }
    }
}

/*
System.out.println("Добро пожаловать в нашу кофейню!");
        Scanner sc = new Scanner(System.in);
    enum CoffeeType {
        AMERICANO,
        ESPRESSO,
        CAPUCCINO,
        LATTE,
    }
        for (CoffeeType myCoffee : CoffeeType.values()) {
            System.out.println(myCoffee);
        }
        System.out.println("Для выбора нажните 1,2, 3 или 4");
        int choice = sc.nextInt();
        CoffeeType myCoffee = CoffeeType.ESPRESSO; // инициализация списка, должно быть хотя бы одно значение
        switch (choice) {
            case 1: {
                myCoffee = CoffeeType.ESPRESSO;
                break;
            }
            case 2: {
                myCoffee = CoffeeType.AMERICANO;
                break;
            }
            case 3: {
                myCoffee = CoffeeType.CAPUCCINO;
                break;
            }
            case 4: {
                myCoffee = CoffeeType.LATTE;
                break;
            }
        }
        switch (myCoffee) {
            case AMERICANO -> {
                System.out.println("Стоимость: " + 3 + " евро");
                int coffeePrice = 3;
                break;
            }
            case ESPRESSO -> {
                System.out.println("Стоимость: " + 2 + " евро");
                int coffeePrice = 2;
                break;
            }
            case CAPUCCINO -> {
                System.out.println("Стоимость: " + 4 + " евро");
                int coffeePrice = 3;
                break;
            }
            case LATTE -> {
                System.out.println("Стоимость: " + 5 + " евро");
                int coffeePrice = 5;
                break;



    }*/
