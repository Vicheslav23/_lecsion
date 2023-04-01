import java.time.LocalDate; // import the LocalDate class
import java.time.LocalTime; // import the LocalTime class
import java.time.LocalDateTime; // import the LocalDateTime class
import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        LocalDate myToday = LocalDate.now(); // Create a date object
        System.out.println("Today is: " + myToday); // Display the current date
        System.out.println();

        LocalTime myTime = LocalTime.now();
        System.out.println(myTime);
        System.out.println();

        LocalDateTime myDateTime = LocalDateTime.now();
        System.out.println("Current Date and Time: " + myDateTime);
        System.out.println();

        System.out.println("Before formatting: " + myDateTime); // берем текущую дату и время

        DateTimeFormatter myDateTimeFormatted = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"); // задаем новый формат
        String formattedDate = myDateTime.format(myDateTimeFormatted); // передаем формат в метод
        System.out.println("After formatting: " + formattedDate); // напечатали новую строку с отформатированной датой и временем

    }
}