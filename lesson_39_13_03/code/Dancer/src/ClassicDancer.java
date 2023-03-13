public class ClassicDancer extends Dancer {

    public ClassicDancer(String name, String sex, int age) {
        super(name, sex, age);
    }

    @Override
    public void dance() {
        System.out.println(toString() + " двигается под музыку");

    }
}
