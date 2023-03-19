public class Phone {
    String phoneNumber;
    String brand;
    String model;

    @Override
    public String toString() {
        return "Phone{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
    public void receiveCall (String name) {
        System.out.println("Звонит: " + name);
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Phone(String phoneNumber, String brand, String model) {
        this.phoneNumber = phoneNumber;
        this.brand = brand;
        this.model = model;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
//        Phone phone1 = new Phone("+7903 123 45 67", "iPhone", 280);
//        Phone phone2 = new Phone("+49 176 00 000 123", "Samsung", 290);
//        Phone phone3 = new Phone("+49 152 00 000 321", "Sony", 250);
//
//        System.out.println(phone1.toString());
//        System.out.println(phone2.toString());
//        System.out.println(phone3.toString());
}
