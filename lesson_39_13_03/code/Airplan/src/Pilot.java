public class Pilot {

    String name;
    int age;
    String rank;
    Airplan airplan; // самолет, на котором летит пилот

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getRank() {
        return rank;
    }
    public Pilot(String name, int age, String rank) {
        this.name = name;
        if (age >= 25 && age <= 50) {
            this.age = age;
            System.out.println("Пилот допущен");
        } else {
            System.out.println("Пилот не допущен");
            this.rank = rank;
        }

        // метод, который сажает пилота на самолет
        public void go(Airplan airplan){
            this.airplan = airplan;
            this.airplan.setPilot(this);
        }
        // метод, который отображает, что пилот в самолет
        public void pilot() {
            this.airplan.go();  // вызываем метод из класса Airplan
        }
    }
}
