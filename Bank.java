import java.util.Scanner;

// Application Logic
public class Bank {
    private BankAccount account;

    public void startBanking() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Java Bank!");
        System.out.print("Enter Account Holder Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Account Number: ");
        String number = scanner.nextLine();

        System.out.print("Create a (1) Normal or (2) Savings account? ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            account = new BankAccount(name, number);
        } else {
            account = new SavingsAccount(name, number);
        }

        int option;
        do {
            System.out.println("\n1. Deposit\n2. Withdraw\n3. Check Balance\n4. Exit");
            System.out.print("Choose an option: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter amount to deposit: ₹");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ₹");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    account.checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using Java Bank!");
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        } while (option != 4);

        scanner.close();
    }
}
