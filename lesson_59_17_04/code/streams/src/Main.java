import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        Optional<String> empty = Optional.empty(); //создали пустой объкт
        System.out.println(empty.isPresent());

        String str = "Hello";
        Optional<String> stringOptional = Optional.of(str); // создали контейнер в котором есть"Hello"
        System.out.println(stringOptional.isPresent());

        String str1 = null;
//        Optional.of(str1);

        Optional<String> opt = Optional.ofNullable(str1); // может принимать null
        System.out.println("Optional of nullable for opt is " + opt.isPresent());

//        проверка присутсвия значения в Optional, методы isPresent() and isEmpty()
//        isPresent() вернет true если значение внутри не равно null

        System.out.println(opt.isEmpty());

//        метод ifPresent()

        if (str != null){
            System.out.println(str.length());
        }

        Optional<String> strToCheck = Optional.of("hello");
        strToCheck.ifPresent( s -> System.out.println(s.length()));

// method orElse() - при отсутствии значения использует дефолное значение в orElse()

        String nullName = null;
        nullName = "Bill";

        String name = Optional.ofNullable(nullName).orElse("Jack");
        System.out.println(name);

//    получение значения с помощью метода get(). Если значение = null, то метод бросает NoSuchElementException

    Optional<String> optionalBill = Optional.of("Bill");
    String bill = optionalBill.get();
        System.out.println(bill);

}
}