import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Список из 5 валют");
        enum CurrencisList {
            HRYVNIA,
            POUND_STERLING,
            EURO,
            US_DOLLAR,
        }
        for (CurrencisList myCurrencis : CurrencisList.values()) {
            System.out.println(myCurrencis);
        }
        System.out.println("Для выбора нажните 1, 2, 3 или 4");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        CurrencisList myCurrencis = CurrencisList.HRYVNIA;
        switch (choice) {
            case 1: {
                myCurrencis = CurrencisList.HRYVNIA;
                break;
            }
            case 2: {
                myCurrencis = CurrencisList.POUND_STERLING;
                break;
            }
            case 3: {
                myCurrencis = CurrencisList.EURO;
                break;
            }
            case 4: {
                myCurrencis = CurrencisList.US_DOLLAR;
                break;
            }
        }
        switch (myCurrencis) {
            case HRYVNIA -> {
                System.out.println("Стоимость: " + 36.71 + " грн за 1 $");
                break;
            }
            case POUND_STERLING -> {
                System.out.println("Стоимость: " + 0.83 + " GBP за 1 $");
                break;
            }
            case EURO -> {
                System.out.println("Стоимость: " + 0.94 + " EUR за 1 $");
                break;
            }
            case US_DOLLAR -> {
                System.out.println("Стоимость: " + 1 + " $ за 1 $");
                break;
            }
        }
    }
}