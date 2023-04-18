import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\Лилия\\IdeaProjects\\_lecsion\\lesson_57_11_04\\code\\homework_1\\src\\file_age.txt"; // имя файла, который нужно прочитать
        List<Person> persons = getPersonsOlderThan18(fileName);
        for (Person person : persons) {
            System.out.println(person.getName() + ", " + person.getAge());
        }
    }
    public static List<Person> getPersonsOlderThan18(String fileName) {
        List<Person> persons = new ArrayList<>(); // список, в котором будем хранить людей старше 18 лет
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line = reader.readLine(); // читаем первую строку из файла
            while (line != null) { // пока не достигнем конца файла
                String[] parts = line.split(", "); // разделяем строку на имя и возраст
                String name = parts[0];
                int age = Integer.parseInt(parts[1]);
                if (age > 18) { // если возраст больше 18 лет, то добавляем человека в список
                    persons.add(new Person(name, age));
                }
                line = reader.readLine(); // читаем следующую строку из файла
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Collections.sort(persons); // сортируем список по возрасту
        return persons;
    }
}
