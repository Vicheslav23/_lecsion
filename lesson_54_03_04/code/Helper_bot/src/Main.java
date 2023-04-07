import java.util.Scanner;

public class Main {
//    garbageSorter();
//    public static void main(String[] args) {

//  Задача 2. Задача на условие, switch case Создать "Бот-помощник",
//  который помогает сортировать мусор. На входе - наименование выбрасываемого мусора,
//  на выходе сообщение, в какого цвета урну нужно отправить этот мусор.
//  Если выбрасывается стекло (бутылки, банки и т.д.), то бот должен запросить цвет и указать, куда выбросить цветное стекло.

        public static void garbageSorter(){
            Scanner scanner = new Scanner(System.in);

            String garbageSort;

            do{
                System.out.println("What kind of garbage do you want to throw away?");//какой мусор вы хотите выбросить?
                garbageSort = scanner.nextLine().toUpperCase();

                switch (garbageSort) {

                    case "PAPER"://бумага
                        System.out.println("Throw to white container");// выбросить в белый контейнер
                        break;
                    case "FOOD": // пищевые отходы
                        System.out.println("Throw to red container");//  выбросить в красный контейнер
                        break;
                    case "GLASS":// стекло
                        System.out.println("Indicate the colour - WHITE, GREEN or BROWN");// укажите цвет белый,зеленый,
                        // коричневый
                        String glassColour = scanner.nextLine();
                        if (glassColour.equalsIgnoreCase("WHITE")) {
                            System.out.println("Throw to white glass compartment");// выбросить в  отделение для белого
                        } else if (glassColour.equalsIgnoreCase("GREEN")) {
                            System.out.println("Throw to green glass compartment");// выбросить в отделение для зеленого
                        } else {
                            System.out.println("Throw to brown glass compartment");// выбросить в отделение для коричневого
                        }
                        break;
                    default:
                        System.out.println("This sort of garbage does not exist");//мусор такого сорта не существует
                }
                System.out.println("Do you want to throw away more garbage? Enter any letter if yes and 'no' if not");
                //хотите выбросить еще мусор ? введите любую букву если да и no  если нет

            }   while(!(scanner.nextLine().toUpperCase().equals("NO")));
        }
    }