public class Voter {
    String name;
    String ID_num;
    int age;

    @Override
    public String toString() {
        return "Voter {" +
                "name ='" + name + '\'' +
                ", ID_num ='" + ID_num + '\'' +
                ", age =" + age +
                '}';
    }

    public Voter(String name, String ID_num, int age) {

        if (name.equals("")) {
            System.out.println("Имя не может быть пустым.");
        } else {
            this.name = name;
        }

        this.ID_num = ID_num;

        if (age > 16) {
            this.age = age;
            System.out.println("Избиратель может голосовать.");
        } else {
            this.age = age;
            System.out.println("Избиратель еще не может голосовать.");
        }
        if (name != null) {
            this.name = name;
        } else {
            System.out.println("Имя не может быть пустым");
        }

    }
}
