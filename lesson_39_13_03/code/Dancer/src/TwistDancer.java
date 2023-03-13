public class TwistDancer extends Dancer {

    // конструктор вытащил поля родительского класса
    public TwistDancer(String name, String sex, int age) {
        super(name, sex, age); // эти поля из родительского класса
    }
    // переопределяем метод dance из родительского класса
    // на данном этапе мы пишем словами, как танцуют твист
    // Code -> Generate -> выбрать метод

    @Override
    public void dance() {
        System.out.println(toString() + " двигается под музыку, при этом он активно скручивает свое тело, приседает и как бы тушит носком ноги окурок на полу.");
    }
}
