import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        Класс Dancer и его наследники.
        System.out.println("Пример наследования с классом Dancer");

//        Dancer d1 = new Dancer("","",25)

        TwistDancer d2 = new TwistDancer("Дима","M", 27);
                d2.dance();

        BreakDancer d3 = new BreakDancer("Вика", "Ж", 22);
        d3.dance();

        ClassicDancer d4 = new ClassicDancer("Петя", "M", 23);
        d4.dance();

        List<Dancer> dancerList = new ArrayList<>();
        dancerList.add(d2);
        dancerList.add(d3);
        dancerList.add(d4);

        System.out.println(dancerList);

//        for (int i = 0; i < dancerList.size(); i++) {

//            System.out.println(dancerList.get(i));
//        }



    }
}