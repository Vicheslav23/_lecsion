public class User {
    String login;
    int password;
    Basket basket;

    public User(String login, int password, Basket basket) {
        this.login = login;
        this.password = password;
        this.basket = basket;
    }

    @Override
    public String toString() {
        return "Покупатель: " +
                "login - " + login + ", \n" +
                "            password - " + password + ", \n" +
                "            Ваша корзина: " + "\n" + basket +
                ' ';
    }
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
