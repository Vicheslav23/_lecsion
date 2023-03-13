import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

//        Задача 1
//Создайте телефонную книгу нашей группы.

        HashMap<String, Long> group23 = new HashMap<>();

        group23.put( "Vadim", +49_151_43225785L);
        group23.put( "Leonid B", +49_151_66457781L);
        group23.put( "Lilian", +49_151_32256648L);
        group23.put( "Viacheslav", +49_151_20408783L);
        group23.put( "Dina", +49_151_12154128L);
        group23.put( "Katerina Z", +49_151_65998420L);
        group23.put( "Katerina K", +49_151_35102001L);
        group23.put( "Валентин", +49_151_32500497L);
        group23.put( "Oleg", +49_151_99850026L);
        group23.put( "Жека", +49_151_35487782L);
        group23.put( "Yehor", +49_151_25462783L);
        group23.put( "Maryna", +49_151_23258467L);
        group23.put( "Leonid K", +49_151_33255458L);

        for (String i : group23.keySet()) {
            System.out.println("key: " + i + " value: " + group23.get(i));
        }

    }
}