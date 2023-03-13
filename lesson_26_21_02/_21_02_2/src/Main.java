import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        System.out.println("Список группы с указанием пола");

        HashMap<String, String> group23 = new HashMap<String, String>();

        int man = 0;

        group23.put( "Vadim", "M");
        group23.put( "Leonid", "M");
        group23.put( "Lilian", "M");
        group23.put( "Viacheslav", "M");
        group23.put( "Katerina", "F");
        group23.put( "Dina", "F");
        group23.put( "Natalia", "F");
        group23.put( "Elisabeth", "F");
        group23.put( "Ekaterina", "F");

        for (String i : group23.keySet()) { // проход по всем ключам
            // System.out.println(group23.get(i));
            if (group23.get(i) == "M") {
//            if (group23.get(i).equals("M")) // второй вариант написании
                man++;
            }
        }

        System.out.println("Мужчин в группе: " + man);
        int woman = group23.size() - man;
        System.out.println("Женщин в группе: " + woman);







    }
}