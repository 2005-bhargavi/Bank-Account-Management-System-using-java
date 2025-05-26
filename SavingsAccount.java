// Inheritance + Polymorphism (Method Overriding)
public class SavingsAccount extends BankAccount {
    private static final double INTEREST_RATE = 0.04;

    public SavingsAccount(String accountHolder, String accountNumber) {
        super(accountHolder, accountNumber);
    }

    // Method overriding (Polymorphism)
    @Override
    public void checkBalance() {
        double interest = balance * INTEREST_RATE;
        System.out.println("Savings Balance (including estimated interest): ₹" + (balance + interest));
    }
}
