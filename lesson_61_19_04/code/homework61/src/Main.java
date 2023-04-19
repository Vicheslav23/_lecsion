import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

//       Задача1
//Есть класс Address с полями
//String street
//int houseNumber
//
//и класс Person с полями
//String name
//int age
//Address address
//
//Используя стримы, написать метод, принимающий список персонов и возвращающий список адресов тех, кто старше 17 лет.
//List<Address>getAddresses(List<Person> input)

        Address address1 = new Address("Street1",1);
        Address address2 = new Address("Street2",2);
        Address address3 = new Address("Street3",3);
        Address address4 = new Address("Street4",4);

        Person person1 = new Person("Person1",16,address1);
        Person person2 = new Person("Person2",35,address2);
        Person person3 = new Person("Person3",47,address3);
        Person person4 = new Person("Person4",13,address4);

        List<Person> persons = Arrays.asList(person1,person2,person3,person4);
        System.out.println(getAddresses(persons));
        //[Address{street='Street2', houseNumber=2},
        // Address{street='Street3', houseNumber=3}]

    }
    public static List<Address> getAddresses(List<Person> input){
        return input.stream()
                .filter(p -> p.getAge() > 17)
                .map(Person::getAddress)
                .collect(Collectors.toList());
    }
}