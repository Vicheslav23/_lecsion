public class Human {
    public int age; // открытое поле класса, отвечает за возраст
    public boolean is_worker; // открытое поле класса, отвечает за статус: работает или нет

    //    создаем конструктор
    public Human(int age, boolean is_worker) {
        this.age = age;
        this.is_worker = is_worker;
    }
// через Generаte вызываем Override Methods и выбераем equals(Object obj)
    @Override
    public boolean equals(Object obj) {
//        if (obj instanceof Human) {
        if (obj == null || this.getClass() != obj.getClass()) { // .getClass() - получения класса, к которому относится объект
            return false;
        }
        Human that =(Human) obj;
        return this.age == that.age && this.is_worker ==that.is_worker;
    }
//    return false;
        }
