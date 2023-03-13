public abstract class Animal { //создания абстрактного класса Animal
    String name; // это будет кошка, собака, медведь и т.д.

    // метод для звуков
    public void makeNoise(){
    }
    // метод для еды
    public void eat() {
    }
    // метод для описания
    public void getDescription() {
    }


    // сеттер для наименования животного
    public void setName(String name) {
        this.name = name;
    }
    // конструктор для создания животного
    public Animal(String name) {
        this.name = name;
    }
}
