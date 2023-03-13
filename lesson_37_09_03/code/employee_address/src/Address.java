public class Address extends Employee{

    //  Создать класс Address с адресами работников, расширяющий класс Employee

    int postCode;
    String ciny;
    String streetHouse;

    public Address(String name, int ID_num, String email, int postCode, String ciny, String streetHouse) {
        super(name, ID_num, email);
        this.postCode = postCode;
        this.ciny = ciny;
        this.streetHouse = streetHouse;
    }

    @Override
    public String toString() {
        return "Адрес сотрудника - " + getName() +
                ": почтовый индекс - " + postCode +
                ", город - " + ciny +
                ", улица/дом - " + streetHouse +
                ' ';
    }

    public int getPostCode() {
        return postCode;
    }

    public String getCiny() {
        return ciny;
    }

    public String getStreetHouse() {
        return streetHouse;
    }
}
