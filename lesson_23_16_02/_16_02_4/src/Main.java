import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {

        // Обратная сортировка ArrayList
        ArrayList<String> mylist = new ArrayList<String>();
        mylist.add("practice");
        mylist.add("code");
        mylist.add("quiz");
        mylist.add("lesson");
        System.out.println("Original List : " + mylist);

        Collections.reverse(mylist);

        System.out.println("Reversed List: " + mylist);

    }
}