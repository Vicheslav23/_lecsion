import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
/*  1.	Есть  текстовый файл.  Написать метод,  читающий файл и возвращающий строку,
 состоящую из строчек этого файла, разделенных пробелом.
Пример текстового файла:
aaa
bbbbbbb
cc
результат : aaa bbbbbbb cc
 */
        String fileName = "C:\\Users\\Лилия\\IdeaProjects\\_lecsion\\lesson_57_11_04\\code\\homework_1\\src\\file.txt"; // имя файла, который нужно прочитать
        String fileContents = readFromFile(fileName);
        System.out.println(fileContents);
    }
    public static String readFromFile(String fileName) {
        StringBuilder fileContents = new StringBuilder(); // создаем StringBuilder, в котором будем хранить содержимое файла
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line = reader.readLine(); // читаем первую строку из файла
            while (line != null) { // пока не достигнем конца файла
                fileContents.append(line).append(" "); // добавляем строку в StringBuilder, разделяя пробелом
                line = reader.readLine(); // читаем следующую строку из файла
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fileContents.toString().trim(); // возвращаем содержимое файла, удаляя последний пробел
    }
}