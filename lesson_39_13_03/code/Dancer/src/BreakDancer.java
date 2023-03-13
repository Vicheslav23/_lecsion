public class BreakDancer extends Dancer{

    public BreakDancer(String name, String sex, int age) {
        super(name, sex, age);
    }
    @Override
    public void dance() {
        System.out.println(toString() + " двигается под музыку, при этом он двигается как робот.");
    }

}
