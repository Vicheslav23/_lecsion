import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Работа с файлами");

        String path = "C:/Users/Лилия/IdeaProjects/_lecsion/lesson_48_24_03/code/file_io_example/src";

        String fileName = "data.txt";

        // CRUD - create, read, update, delete

        createFile(path, fileName); // создаем файл
        String data = "Я помню чудное мгновенье...";
        writeDataInFile(path, fileName, data); // пишем данные в файл
        String d = readDataFromFile(path, fileName);
        System.out.println(d);
    }
    //
    private static void createFile(String path, String fileName) {
        try {
            File myFile = new File ( path + fileName); // Укажите свое имя файла

            if (myFile.createNewFile()) {
                System.out.println("File created: " + myFile.getName());
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }

    private static void writeDataInFile(String path, String fileName, String data) {
        try {
            FileWriter myWriter = new FileWriter(path + fileName); // используем класс и его метод
            myWriter.write(data); // Пишем то, что записываем в файл
            myWriter.close(); // Закрываем метод
            System.out.println("Успешная запись в файл."); // Сообщение об успехе
        } catch (IOException e) {  // поймали ошибку и положили ее в переменную с именем e
            System.out.println("Произошла ошибка."); // Сообщение об ошибке
            e.printStackTrace(); // печать содержания ошибок
        }
    }

    private static String readDataFromFile(String path, String fileName) {
        String data = "";
        try {
            File myFile = new File(path + fileName);
            Scanner myReader = new Scanner(myFile); // готовим сканер для чтения
            while (myReader.hasNextLine()) {
                data = myReader.nextLine(); // считываем строку
                // System.out.println(data); // печатаем считанную строку
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Произошла ошибка.");
            e.printStackTrace();
        }
        return data;
    }
}
