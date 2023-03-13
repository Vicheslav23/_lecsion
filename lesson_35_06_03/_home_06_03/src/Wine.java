public class Wine {

    String name;
    String sort;
    int year;

    @Override
    public String toString() {
        return "Wine{" +
                " name = " + name + '\'' +
                ", soft = " + sort + '\'' +
                ", year = " + year +
                 '}';
    }
    public String onStock(int n) {

        return ("На складе имеется количество бутылок: " + n);
    }

    public int getYear() {
        return year;
    }
}
