public class Main {
    public static void main(String[] args) {
        System.out.println("Работник и зарплата.");
        // Нужно иметь "систему", в которой есть "Сотрудники", их "Зарплаты" и надо
        // уметь отправлять им письма по e-mail с информацией об их зарплате


//        Employee emp1 = new Employee("Иванов Петр", "ivan@mail.ru", 001);
//        emp1.mailPaySlip(); // пробуем вызвать метод
//        String e = emp1.toString();
//        System.out.println(e);

        Salary s1 = new Salary("Иванов Петр", "ivanov_s@mail.com", 101, 60000 );
        Salary s2 = new Salary("Сидоров Алексей", "sidorov_a@mail.com", 102, 48000);



//        Employee e = new Salary("Сидоров Алексей", "sidorov_a@mail.com", 102, 48000);

        System.out.println("--- Вызываем метод mailPaySlip в классе Salary ---");
        System.out.println();
        s1.mailPaySlip();
        System.out.println();
        s2.mailPaySlip();

        s2.setSalary(50000);
        System.out.println();
        s2.mailPaySlip();

 /*       System.out.println("\n --- Вызываем метод mailPaySlip в классе Employee ---");
        e.mailPaySlip();

        System.out.println();

        s2.setSalary(54000); // изменили зарплату Сидорову
        s2.mailPaySlip(); // послали уведомление*/




    }
}