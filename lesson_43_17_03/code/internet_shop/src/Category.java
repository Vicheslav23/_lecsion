import java.util.ArrayList;
public class Category {

        // Создать класс Категория, имеющий переменные имя и массив товаров.
        String name;
        ArrayList products;

    // конструктор класса
        public Category(String name, ArrayList products) {
            this.name = name;
            this.products = products;
        }
    // переопределили метод toString
        @Override
        public String toString() {
            return "Категория - " +
                   name +
                    ". " + products +
                    ' ';
        }
}
