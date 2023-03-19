public class Salary extends Employee {
    private double salary;

    public Salary(String name, String email, int ID_num, double salary) {
        super(name, email, ID_num);
        this.salary = salary;
    }
    public void mailPaySlip() {
//        System.out.println("Это метод класса Salary");
        System.out.println("Уважаемый " + getName() + ", направляем вам информацию о зарплате на адрес " + getEmail());
        System.out.println("Ваша годовая зарплата: " + getSalary());
        System.out.println("Ваша ежемесячная зарплата:" + getSalary()/12);
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double newSalary) {
//        this.salary = salary;
        if (newSalary > 0){
            salary = newSalary;
        }
    }

    @Override
    public String toString() {
        return "Salary{" +
                "salary=" + salary +
                '}';
    }
}
