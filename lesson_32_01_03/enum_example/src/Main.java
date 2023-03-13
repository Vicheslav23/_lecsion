public class Main {
    public static void main(String[] args) {

        System.out.println("Пример использования enum - четыре времени года");

          enum Seasons {
            WINTER,
            SPRING,
            SUMMER,
            AUTUMN;
        }
                Seasons mySeason = Seasons.SUMMER; // меняем времена года и будет высвечиватся то время года который бедет указан
                switch(mySeason) { // бегает по значениям mySeason

                    case SPRING:
                        System.out.println("Травка зеленеет, солнышко блестит");
                        System.out.println("Весной наступает Пасха, красим яйца!");
                        break; // отработали и вышли
                    case SUMMER:
                        System.out.println("Планируем отпуск!");
                        break;
                    case AUTUMN:
                        System.out.println("Готовим сани к зиме!");
                        break;
                    case WINTER:
                            System.out.println("Точим лыжи!");
                         break;
                }
    }
}