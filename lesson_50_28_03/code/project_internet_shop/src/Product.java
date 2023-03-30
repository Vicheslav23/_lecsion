public class Product {
    //Товары с ценой и рейтингом

    String name;
    double price;
    int rating;

    public Product(String name, double price, int rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }
    @Override
    public String toString() {
        return "Товар:" +
                " наименование - " + name +
                ", цена - " + price +
                " у.е, рейтинг - " + rating + '\n';

    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        if (Double.compare(product.price, price) != 0) return false;
        return name.equals(product.name);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getRating() {
        return rating;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }
}
