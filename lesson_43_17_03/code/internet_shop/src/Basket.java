import java.util.ArrayList;

public class Basket { // класс Basket (список купленных товаров)

//    Создать класс Basket, содержащий массив купленных товаров (ArrayList).
    String name;
    int price;
    public User user;

    // создали конструктор
    public Basket(String name, int price) {
        this.name = name;
        this.price = price;
    }
    // создали toString
    @Override
    public String toString() {
        return "Basket{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
    // метод, который связывает покупателя и корзину
    public void go() {
        System.out.println("Покупатель: " + user.getLogin() + " в Вашей корзине - " + this.name);
    }

    // создали геттер и сеттер
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
  }
