public class BankCard implements Debit, Credit{

    @Override
    public void creditMethod() {
        System.out.println("Add some money to account...");
    }

    @Override
    public void debitMethod() {
        System.out.println("Deduct some money from account...");
    }
}
