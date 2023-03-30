import java.util.ArrayList;

 public class Category {
    // Категории товаров с возможностью их добавления категорий
    ArrayList <Product> products;
    String name;

    public Category(String name, ArrayList<Product> products) {
        this.products = products;
        this.name = String.valueOf(name);
    }

    @Override
    public String toString() {
        return "Категория - " +
                name +
                " " + products + '\n';

    }
     public ArrayList getProducts() {
         return products;
     }
     public void setProducts(ArrayList products) {
         this.products = products;
     }
     public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
