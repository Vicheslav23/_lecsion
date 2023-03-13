public class TwistDancer extends Dancer {

    // конструктор вытащил поля родительского класса
    public TwistDancer(String name, String sex, int age) {
        super(name, sex, age);
    }

    @Override
    public void dance() {
        System.out.println(toString() + " двигается под музыку, при этом он активно скручивает свое тело, приседает и как бы тушит носком ноги окурок на полу.");
    }
}
