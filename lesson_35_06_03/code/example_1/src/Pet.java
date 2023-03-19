
//задаем класс Домашние животные
public class Pet {


    @Override // <== переопределение метода
    public String toString() {
        return "Pet{"  +
                "type='" + type + '\'' +
                ", breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
    String type;
    String breed;
    String name;
    double weight;

}
