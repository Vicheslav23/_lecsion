public abstract class Employee {

    private String name;
    private int ID_num;
    private String email;

    public Employee(String name, int ID_num, String email) {
        this.name = name;
        this.ID_num = ID_num;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Сотрудник: " +
                "Фамилия, Имя = " + name + '\'' +
                ", ID номер = " + ID_num +
                ", e-mail = " + email + '\'' +
                ' ';
    }

    public String getName() {
        return name;
    }

    public int getID_num() {
        return ID_num;
    }

    public String getEmail() {
        return email;
    }
}
