public abstract class Employee {

    private String name;  // модификатор доступа private защищает данные от прямого доступа
    private String email;
    private int ID_num;

    // конструктор класса Employee
    public Employee(String name, String email, int ID_num) {
        this.name = name;
        this.email = email;
        this.ID_num = ID_num;
    }
    // метод отправляет работнику информацию о зарплате на его e-mail
    public void mailPaySlip(){
        System.out.println("Это метод класса Employee");
        System.out.println("Уважаемый " + this.name + ", направляем вам информацию о зарплате на адрес " + this.email);
    }
// вызываем toString через ALT+Insert - метод собирает информацию о сотруднике в одну строку
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", ID_num=" + ID_num +
                '}';
    }
// вызываем Geter через ALT+Insert
// getter для имени работника
    public String getName() {
        return name;
    }

    // getter для e-mail работника
    public String getEmail() {
        return email;
    }

    // getter для ID_num работника
    public int getID_num() {
        return ID_num;
    }
}
