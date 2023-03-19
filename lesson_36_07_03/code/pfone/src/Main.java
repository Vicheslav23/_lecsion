public class Main {
    public static void main(String[] args) {

        System.out.println("Класс Телефон - практикум");
        System.out.println();

  /*  Phone myphone1 = new Phone();
    myphone1.phoneNumber = "+38 050 3005803";
    myphone1.brand = "Aйфон";
    myphone1.model = "7";

    Phone myphone2 = new Phone();
    myphone2.phoneNumber = "+38 050 4028229";
    myphone2.brand = "Apple";
    myphone2.model = "13";

    Phone myphone3 = new Phone();
    myphone3.phoneNumber = "+49 151 20408783 ";
    myphone3.brand = "Samsung";
    myphone3.model = "A5";

        System.out.println(myphone1.toString());
        System.out.println(myphone2.toString());
        System.out.println(myphone3.toString());

        myphone1.receiveCall("Мой приятель");

        System.out.println("Номер первого телефона: " + myphone1.getPhoneNumber());
        System.out.println("Номер первого телефона: " + myphone2.getPhoneNumber());
        System.out.println("Номер первого телефона: " + myphone3.getPhoneNumber());
*/
//        -----------------------------------------------
        Phone phone1 = new Phone("+38 050 300 58 03", "Айфон", "7");
        Phone phone2 = new Phone("+38 050 402 82 29", "Apple", "13");

        System.out.println(phone1);
        System.out.println(phone2);
//
    }
}