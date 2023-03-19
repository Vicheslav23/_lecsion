public class Programmer extends Human{ // создали дочерный класс Programmer класса Human
    public int experience; // открытое поле, отражает кол-во лет опыта программиста

    //    создаем конструктор
    public Programmer(int age, boolean is_worker, int experience) {
        super(age, is_worker); //
        this.experience = experience;
    }
    // через Generаte вызываем Override Methods и выбераем equals(Object obj)
    @Override
    public boolean equals(Object obj) {
//        if (obj instanceof Programmer) {
        if (obj == null || this.getClass() != obj.getClass()) { // .getClass() - получения класса, к которому относится объект
            return false;
        }
            Programmer that = (Programmer) obj;
            return this.age == that.age && this.is_worker == that.is_worker && this.experience == that.experience;
        }
//        return false;
//    }
}
