import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
//  Пример класса Dog - сделать так, чтобы можно было отсортировать элементы класса (собаки) по годам.

        System.out.println("Сортируем собак по именам и возрасту");
        System.out.println();

        List dogList = new ArrayList();

        Dog dog1 = new Dog("Шегги", 3);
        Dog dog2 = new Dog("Бобик", 7);
        Dog dog3 = new Dog("Роджер", 10);
        Dog dog4 = new Dog("Альма", 4);
        Dog dog5 = new Dog("Тамми", 1);

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
        dogList.add(dog4);
        dogList.add(dog5);

        Collections.sort(dogList);   // Сортируем список
        System.out.println(dogList); // печатаем результат

         Collections.sort(dogList, new Dog());
        for (int i = 0; i < dogList.size(); i++) {
            System.out.println(dogList.get(i));
        }


        // Сортируем список, используя компаратор

    }
}