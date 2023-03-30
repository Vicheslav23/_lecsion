import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Интернет-магазин
//
//Категории товаров с возможностью их добавления категорий
//Товары с ценой и рейтингом
//Добавление и редактура товаров
//Каталог товаров с возможностью сортировки по ценам и/или рейтингу
//Пользователи
//Купленные товары у каждого пользователя

        System.out.println("--------------------------------------------");
        System.out.println("         Интернет-магазин"                   );
        System.out.println("--------------------------------------------");

// создаем продукты|объекты в классе Products

        Product p1 = new Product("ноутбук", 1000, 8);
        Product p2 = new Product("принтер", 150, 6);
        Product p3 = new Product("микрофон", 250, 7);
        Product p4 = new Product("наушники", 100, 7);
        Product p5 = new Product("мышка", 15, 7);

        Product r1 = new Product("телевизор", 300, 8);
        Product r2 = new Product("холодильник", 250, 6);
        Product r3 = new Product("электрочайник", 50, 7);
        Product r4 = new Product("стиральная машина", 200, 7);
        Product r5 = new Product("кофемашина", 350, 7);

// массив товаров
        ArrayList<Product> products = new ArrayList<>();
        products.add(p1);
        products.add(p2);
        products.add(p3);
        products.add(p4);
        products.add(p5);

        ArrayList<Product> products2 = new ArrayList<>();
        products2.add(r1);
        products2.add(r2);
        products2.add(r3);
        products2.add(r4);
        products2.add(r5);

// создаем несколько категорий товаров
        Category category1 = new Category("оргтехника", products);
        Category category2 = new Category("бытовая техника", products2);

// массив категорий товаров
        ArrayList<Category> categories = new ArrayList<>();
        categories.add(category1);
        categories.add(category2);

// меню
        boolean keyExit = true;
        while (keyExit) {
            System.out.println("Меню. Выберите действие:");
            System.out.println("1 - категория товара");
            System.out.println("2 - мои покупки");

            Scanner scanner;
           try {
                scanner = new Scanner(System.in);
                int key = scanner.nextInt();
                switch (key) {
                    case (1):
                        for (int i = 0; i < categories.size(); i++) {
                            System.out.println();
                            System.out.println(categories.get(i));
                    }
                        break;
                    case (2):
                            System.out.println("Ваша корзина" + new Basket(products));
                        break;
                    default:
                        System.out.println("Некорректный ввод.");
                        break;
                }
            }
// проверка на некорректный ввод
           catch (InputMismatchException e) {
                System.out.println("Нельзя вводить символы!");
            }
            System.out.println();

// код на да или нет
            System.out.println("Хотите продолжить? y/n");
            scanner = new Scanner(System.in);
            char ch = scanner.next().toLowerCase().charAt(0);
            if (ch == 'n')
                break;
            else continue;
        }
// печать массива товаров
 /*           for (int i = 0; i < products.size(); i++) {
                System.out.println(products.get(i));
            }
            System.out.println();*/



            // создаем корзину
            Basket b1 = new Basket(products);
            Basket b2 = new Basket(products);

            // создаем пользователей
            User user1 = new User("log1", 12345, b1);
            User user2 = new User("log2", 54321, b2);
            System.out.println(user1);
            System.out.println(user2);

        }
    }
