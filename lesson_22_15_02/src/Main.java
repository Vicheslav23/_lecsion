import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {

        // Создадим список марок автомобилей
        ArrayList<String> autoBrand = new ArrayList<String>();

        autoBrand.add("BMW");
        autoBrand.add ("Opel");
        autoBrand.add ("VW");
        autoBrand.add ("Audi");
        autoBrand.add("Mercedes");
        autoBrand.add("Ford");

        System.out.println(autoBrand);

        int size = autoBrand.size();
        System.out.println("Размер листа, который создали: " + size);

        int index = autoBrand.indexOf("Ford");
        System.out.println("Номер " + "Ford" + "в списке " + index);

        autoBrand.remove(4);
        System.out.println(autoBrand);

        boolean autoBrandPresents = autoBrand.contains("Opel");
        System.out.println(autoBrandPresents);

        if (autoBrand.contains("Opel") == false) {
            autoBrand.add ("Opel");
        }
        System.out.println(autoBrand);

        if (autoBrand.contains("Fiat") == false) {
            autoBrand.add("Fiat");
        }
        System.out.println(autoBrand);

        for (int i = 0; i < autoBrand.size(); i ++) {
            System.out.println( i + " " + autoBrand.get(i));
        }
        System.out.println("------------------");

        Collections.sort(autoBrand);

        for (int i = 0; i < autoBrand.size(); i ++) {
            System.out.println( i + " " + autoBrand.get(i));
        }
    }
}