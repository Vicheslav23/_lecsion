import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {

        ArrayList<String> protocolOfResults = new ArrayList<String>();

        protocolOfResults.add("12.03 сек - участник под номером 1");
        protocolOfResults.add("11.09 сек - участник под номером 2");
        protocolOfResults.add("10.02 сек - участник под номером 3");
        protocolOfResults.add("10.05 сек - участник под номером 4");
        protocolOfResults.add("10.08 сек - участник под номером 5");
        protocolOfResults.add("10.03 сек - участник под номером 6");

        System.out.println(protocolOfResults);

        Collections.sort(protocolOfResults);

        for (int i = 0; i < protocolOfResults.size(); i ++) {
            System.out.println( i + " " + protocolOfResults.get(i));
        }



    }
}