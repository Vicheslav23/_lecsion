public class Main {
    public static void main(String[] args) {
         System.out.println("Hello world!");

        System.out.println("Работа с 2-мерными массивами");

        int[] [] field = new int[10][10];
        for (int i = 0; i < field.length; i++) {
            for (int q = 0; q < field.length; q++) {
                field [i][q] = i + 1;
                System.out.print(field[i][q] + " ");
            }
            System.out.println();
        }








    }
}