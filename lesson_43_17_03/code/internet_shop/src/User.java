public class User {
//    Создать класс User, содержащий логин, пароль и объект класса Basket.
//     Создать несколько объектов класса User.
    String login;
    int password;
    Basket basket;

    // создали конструктор

    public User(String login, int password, Basket basket) {
        this.login = login;
        this.password = password;
        this.basket = basket;
    }

 /*   // метод, который связывает покупателя и корзину
    public void go (Basket basket) {
        this.basket = basket;
        this.basket.setUser(this);
    }*/
    // создали toString
    @Override
    public String toString() {
        return "Покупатель: " +
                "login = " + login +
                ", password = " + password +
                ", Ваша корзина: " + basket +
                ' ';
    }
    // создали геттер и сеттер

    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public int getPassword() {
        return password;
    }
    public void setPassword(int password) {
        this.password = password;
    }
    public Basket getBasket() {
        return basket;
    }
    public void setBasket(Basket basket) {
        this.basket = basket;
    }
}
