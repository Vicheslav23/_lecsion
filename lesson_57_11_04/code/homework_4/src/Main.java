import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
/* 4. Есть текстовый файл, содержащий информацию о клиенте, название устройства и цену.
Имена клиентов могут повторяться.
Файл имеет такой вид:
John, Smith, Notebook, 500
Jill, White, Mac,  800
John, Smith, Keybord,25
Ann, Green, Mousepad, 5
Jill, White, Apple,60
Написать метод, читающий информацию из файла, суммирующий цену для каждого покупателя
и записывающий результат в выходной файл. Этот файл будет иметь такой вид:
Ann Green 5
John Smith 500
Jill White 860
     */
        String inputFileName = "C:\\Users\\Лилия\\IdeaProjects\\_lecsion\\lesson_57_11_04\\code\\homework_1\\src\\inputFile.txt"; // имя входного файла
        String outputFileName = "C:\\Users\\Лилия\\IdeaProjects\\_lecsion\\lesson_57_11_04\\code\\homework_1\\src\\outputFile.txt"; // имя выходного файла
        try {
            processFile(inputFileName, outputFileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void processFile(String inputFileName, String outputFileName) throws IOException {
        Map<String, Integer> pricesByCustomer = new HashMap<>(); // словарь, в котором будем хранить суммарные цены для каждого покупателя
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName))) {
            String line = reader.readLine(); // читаем первую строку из файла
            while (line != null) { // пока не достигнем конца файла
                String[] parts = line.split(","); // разделяем строку на элементы
                String firstName = parts[0].trim();
                String lastName = parts[1].trim();
                String device = parts[2].trim();
                int price = Integer.parseInt(parts[3].trim());
                String customer = firstName + " " + lastName; // объединяем имя и фамилию в одну строку
                int oldPrice = pricesByCustomer.getOrDefault(customer, 0); // получаем суммарную цену для данного покупателя (если еще не была добавлена, то 0)
                int newPrice = oldPrice + price; // считаем новую суммарную цену
                pricesByCustomer.put(customer, newPrice); // обновляем словарь
                line = reader.readLine(); // читаем следующую строку из файла
            }
        }

        try (FileWriter writer = new FileWriter(outputFileName)) {
            for (Map.Entry<String, Integer> entry : pricesByCustomer.entrySet()) { // проходимся по всем парам "покупатель - суммарная цена"
                String customer = entry.getKey();
                int price = entry.getValue();
                writer.write(customer + " " + price + "\n"); // записываем строку в выходной файл
            }
        }
    }
}