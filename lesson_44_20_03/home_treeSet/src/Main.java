import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
//        Создайте TreeSet и внесите в него федеративные земли Германии.
//        Выведите список земель на печать.
//Baden-Württemberg
//Баден-Вюртемберг
//Bayern
//Бавария
//Berlin
//Берлин
//Brandenburg
//Бранденбург
//Bremen
//Бремен
//Hamburg
//Гамбург
//Hessen
//Гессен
//Mecklenburg-Vorpommern
//Мекленбург-Передняя Померания
//Niedersachsen
//Нижняя Саксония
//Nordrhein-Westfalen
//Северный Рейн-Вестфалия
//Rheinland-Pfalz
//Рейнланд-Пфальц
//Saarland
//Саар
//Sachsen
//Саксония
//Sachsen-Anhalt
//Саксония-Анхальт
//Schleswig-Holstein
//Шлезвиг-Гольштейн
//Thüringen
//Тюрингия

        TreeSet land = new TreeSet<>();
        land.add("Гессен");
        land.add("Саксония-Ангальт");
        land.add("Нижняя Саксония");
        land.add("Гамбург");
        land.add("Тюрингия");
        land.add("Северный Рейн");
        land.add("Саксония");
        land.add("Рейн-ланд-Пфальц");
        land.add("Мекленбург");
        land.add("Баден - Вюртенберг");
        land.add("Саар");
        land.add("Шлейвиг");
        land.add("Бремен");
        land.add("Бавария");
        land.add("Берлин");
        land.add("Брандербург");

        System.out.println(land);
        System.out.println();

        TreeSet dasLand = new TreeSet<>();
        dasLand.add("Baden-Württemberg");
        dasLand.add("Bayern");
        dasLand.add("Berlin");
        dasLand.add("Brandenburg");
        dasLand.add("Bremen");
        dasLand.add("Hamburg");
        dasLand.add("Hessen");
        dasLand.add("Mecklenburg-Vorpommern");
        dasLand.add("Niedersachsen");
        dasLand.add("Nordrhein-Westfalen");
        dasLand.add("Rheinland-Pfalz");
        dasLand.add("Saarland");
        dasLand.add("Sachsen");
        dasLand.add("Sachsen-Anhalt");
        dasLand.add("Schleswig-Holstein");
        dasLand.add("Thüringen");

        System.out.println(dasLand);
    }
}