import java.util.ArrayList;

    public class Basket { // класс Basket (список купленных товаров)

        ArrayList products;

        public Basket(ArrayList products) {
            this.products = products;
        }

        @Override
        public String toString() {
            return " " +
                    products +
                    ' ';
        }
}
