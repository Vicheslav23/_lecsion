public class Money {
    private long amount; // переменная типа long - это целые числа
    private String currency; // название валюты - USD, EUR, ...

    // конструктор
//    public Money(long amount, String currency) {
//        this.amount = amount;
//        this.currency = currency;
//    }
    // конструктор модифицированный
    public Money(double amount, String currency) { // переопределили тип переменной
        this.amount = Math.round(amount * 100); // переопределили тип переменной
        this.currency = currency;
    }

//    @Override
//    public String toString() {
//        return "Money{" +
//                "amount=" + amount +
//                ", currency='" + currency + '\'' +
//                '}';
//    }

// переопределяение метода toString
        @Override
    public String toString() {
        return String.format("%.2f %s", amount / 100.0, currency.toUpperCase());
    }

    // переопределяение метода equals
    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Money money)) {
            return false;
        }
        return amount == money.amount && currency.equalsIgnoreCase(money.currency);
    }
   /* @Override
    public boolean equals(Object obj) {
        if (obj == null || this.getClass() != obj.getClass()) { // если объект obj является экземпляром класса Human
            return false;
        }
        Money that = (Money) obj;
        return this.amount == that.amount && this.currency.equalsIgnoreCase(that.currency);
    }*/
}
