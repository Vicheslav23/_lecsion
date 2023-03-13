public class BreakDancer extends Dancer{

//    прописывается как в TwistDancer

    public BreakDancer(String name, String sex, int age) {
        super(name, sex, age);
    }
    @Override
    public void dance() {
        System.out.println(toString() + " двигается под музыку, при этом он двигается как робот.");
    }

}
