import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
/*  2.	Есть  файл, состоящий из строчек текста. Написать метод, читающий файл и находящий самую длинную строчку
 в этом файле. Метод возвращает эту строчку
    Пример текстового файла:
    aaa
    bbbbbbb
    cc
     результат :  bbbbbbb
    */
        String fileName = "C:\\Users\\Лилия\\IdeaProjects\\_lecsion\\lesson_57_11_04\\code\\homework_1\\src\\file.txt"; // имя файла, который нужно прочитать
        String longestLine = findLongestLine(fileName);
        System.out.println(longestLine);
    }

    public static String findLongestLine(String fileName) {
        String longestLine = ""; // строка, которая будет содержать самую длинную строку из файла
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line = reader.readLine(); // читаем первую строку из файла
            while (line != null) { // пока не достигнем конца файла
                if (line.length() > longestLine.length()) { // если текущая строка длиннее, чем сохраненная, то обновляем значение самой длинной строки
                    longestLine = line;
                }
                line = reader.readLine(); // читаем следующую строку из файла
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return longestLine;
    }
}