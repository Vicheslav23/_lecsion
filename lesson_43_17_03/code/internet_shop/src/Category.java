import java.util.ArrayList;
public class Category {

        //        Создать класс Категория, имеющий переменные имя и массив товаров.
        String name;
        ArrayList products;

        public Category(String name, ArrayList products) {
            this.name = name;
            this.products = products;
        }

        @Override
        public String toString() {
            return "Category{" +
                    "name='" + name + '\'' +
                    ", products=" + products +
                    '}';
        }
}
