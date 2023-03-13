public class Main {
    public static void main(String[] args) {
//  Создать класс Address, расширяющий класс Employee.
//  Реализовать в нем конструктор и геттеры.
//  В классе Main создать двух работников с адресами, напечать в консоли их адреса.

        Address coWorker1 = new Address("Котов Илья", 536487, "kotov@gmail.com", 36785,"Ганновер","Дорфщтрассе, 15");
        System.out.println(coWorker1.toString());

        Address coWorker2 = new Address("Халтурин Емеля", 348659,"haltyem@gmail.com", 53789, "Бад-Кройнцах", "Arbeitstrasse");
        System.out.println(coWorker2.toString());






    }
}