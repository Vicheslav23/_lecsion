import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача о поиске случайного дубликата в массиве.");

        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 100; i++){
            numbers.add(i , i +1);
        }
        System.out.println(numbers);

        int sum = 0;
        int sum1 = 0;

        for (int i = 0; i < numbers.size(); i++){
            sum = sum + numbers.get(i);
        }
        System.out.println("Длина массива: " + numbers.size() + ". Сумма всех элементов: " + sum);

        int random = (int) (Math.random() + (100 - 1 +1) +1);

        numbers.add(random,random);

        System.out.println(numbers);

        for (int i = 0; i < numbers.size(); i++){
            sum1 = sum1 + numbers.get(i);
        }
        int dublicat = sum1 - sum;
        System.out.println("Длина нового массива: " + numbers.size() + ". Сумма всех элементов: " + dublicat);

    }
}