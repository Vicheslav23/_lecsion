public class Main {
    public static void main(String[] args) {

       String[] cars = {"Audi","BMW","Ford","Honda","Hyundai","Kia","Mazda"};
        findCar(cars, "opel");
    }

        // {8,2,5,9}
        // Есть масссив целых чисел(неотсортированный),состоящий не меньше чем из двух элементов.
        // Написать метод,находящий и  выводящий на экран минимальный и
        // второй минимальный элемент маcсива если он есть

//        -----------------------------------------------------------------------------

        // Написать метод, который проверяет есть ли заказаная машина в салоне.
        // пример:String [] salon =
        // {"Audi","BMW","Ford","Honda","Hyundai","Kia","Mazda"};
        //название машины для поиска получаем с клавиатуры ( через Scanner)

        //1. создать метод public static  void findCar(String[]cars,String carToFind)
        //2.результат работы метода вывести на экран: carToFind is found  or not found
        //3. Алгоритм работы метода :
        // завести переменную хранящую длину массива
        // в цикле for  сравнивать (через if) каждый элемент массива с машиной, которую ищем
        // если нашли выводим на экран соответствующее уведомление если нет то пишет что такой машины нет.
        //4. Учесть правила сравнения стрингов ( через equals) и учесть возможность использования как больших  так
        // и маленьких букв
        // Arrays.toString(cars)
        //string.equals(string2)
        //{"Audi","BMW","Ford","Honda","Hyundai","Kia","Mazda"}
        public static void findCar(String[] cars, String carToFind) {
            int length = cars.length;

            for (int i = 0; i < length; i++) {

                if (cars[i].equalsIgnoreCase(carToFind)) {
                    System.out.println("this car is available");
                    return;
                }
            }
            System.out.println("this car is not available. Take ");

            for (String car : cars)
                System.out.print(car + " ");







    }
}