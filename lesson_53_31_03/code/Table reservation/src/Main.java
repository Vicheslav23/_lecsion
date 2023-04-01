import java.time.LocalDate; // import the LocalDate class
import java.time.LocalTime; // import the LocalTime class
import java.time.LocalDateTime; // import the LocalDateTime class
import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class
public class Main {
    public static void main(String[] args) {
        System.out.println("Table reservation");


        Table_reservation tr1 = new Table_reservation(1, true, LocalDateTime.now());
        System.out.println(tr1);

    }
}