import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        System.out.println("Пример наполнения TreeSet");

        TreeSet ts = new TreeSet<>();

        ts.add("A");
        ts.add("C");
        ts.add("A"); // удаляет дубликат
        ts.add("J");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");
        ts.add("Viacheslav");
        ts.add(" ");
        ts.add("23");

        System.out.println(ts);
        System.out.println();

        System.out.println("Пример с целыми числами" );
        TreeSet tsNum = new TreeSet();
        // Добавляем элементы к набору дерева
        tsNum.add(1);
        tsNum.add(5);
        tsNum.add(12);
        tsNum.add(3);
        tsNum.add(6);
        tsNum.add(10);
        tsNum.add(9);

        System.out.println(tsNum);
    }
}