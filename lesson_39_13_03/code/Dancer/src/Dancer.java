public abstract class Dancer {
    String name; // это имя танцора
    String sex; // пол танцора
    int age; // его возраст

    public void dance() {
        System.out.println(toString() + " двигается под музыку...");
    }

//    конструктор для Dancer
    public Dancer(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
//   toString для Dancer
    @Override
    public String toString() {
        return "Танцор " +
                "имя ='" + name + '\'' +
                ", возраст ='" + age + '\'' +
                ", пол ='" + sex + '\'' +
                ' ';
    }
}
