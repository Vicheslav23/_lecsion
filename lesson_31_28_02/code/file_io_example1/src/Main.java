import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        --------------------------------------------------------------------

        // Создание нового файла
        System.out.println("Пример работы с файлом - СОЗДАНИЕ НОВОГО ФАЙЛА");

        String path = "c:\\Users\\Лилия\\IdeaProjects\\_lecsion\\_28_02\\file_io_example1\\src\\";

        try {
            File myFile = new File(path + "test.txt"); // Укажите свое имя файла

            if (myFile.createNewFile()) {
                System.out.println("Файл создан: " + myFile.getName());
            } else {
                System.out.println("Файл уже существует.");
            }
        } catch (IOException e) {
            System.out.println("Произошла ошибка.");
            e.printStackTrace();
        }
//        ---------------------------------------------------------------------------

        // Запись в файл текста
        System.out.println("Пример работы с файлом - ЗАПИСЬ в ФАЙЛ");

        try {
            FileWriter myWriter = new FileWriter(path + "test.txt");
            myWriter.write("Это пробная запись текста в файл.");
            myWriter.close();
            System.out.println("Успешная запись в файл.");
        } catch (IOException e) {
            System.out.println("Произошла ошибка.");
            e.printStackTrace();
        }
//        ------------------------------------------------------------------------------

        // Чтение текста из файла
        System.out.println("Пример работы с файлом - ЧТЕНИЕ из ФАЙЛА");

        try {
            File myFile = new File(path + "test.txt");
            Scanner myReader = new Scanner(myFile); // готовим сканер для чтения
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine(); // считываем строку
                System.out.println(data); // печатаем считанную строку
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Произошла ошибка.");
            e.printStackTrace();
        }
    }
}