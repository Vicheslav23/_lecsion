import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

// Задача 2
//Решить задачу про результаты забега на 100 м (или про погодное наблюдение), используя HashMap.

        HashMap<String, Double> protocolOfResults = new HashMap<>();


        protocolOfResults.put("участник под номером 1", 12.03);
        protocolOfResults.put("участник под номером 2", 11.09);
        protocolOfResults.put("участник под номером 3", 10.02);
        protocolOfResults.put("участник под номером 4", 10.05);
        protocolOfResults.put("участник под номером 5", 10.08);
        protocolOfResults.put("участник под номером 6", 10.03);

        for (String i : protocolOfResults.keySet()) {
            System.out.println("key: " + i + " value: " + protocolOfResults.get(i));
        }
    }
}