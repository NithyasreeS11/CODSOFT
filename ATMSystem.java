import java.util.Scanner;

public class ATMSystem {

    static class UserAccount {
        private int balance;

        public UserAccount(int initialBalance) {
            this.balance = initialBalance;
        }

        public int getBalance() {
            return balance;
        }

        public void deposit(int amount) {
            if (amount > 0) {
                balance += amount;
            } else {
                System.out.println("Invalid deposit amount.");
            }
        }

        public boolean withdraw(int amount) {
            if (amount > 0 && balance >= amount) {
                balance -= amount;
                return true;
            } else {
                return false;
            }
        }
    }

    static class ATM {
        private UserAccount userAccount;

        public ATM(UserAccount userAccount) {
            this.userAccount = userAccount;
        }

        public void withdraw(int amount) {
            if (userAccount.withdraw(amount)) {
                System.out.println("Withdrawal successful. New balance: Rs. " + userAccount.getBalance());
            } else {
                System.out.println("Insufficient funds or invalid amount.");
            }
        }

        public void deposit(int amount) {
            userAccount.deposit(amount);
            System.out.println("Deposit successful. New balance: Rs. " + userAccount.getBalance());
        }

        public void checkBalance() {
            System.out.println("Your balance is: Rs. " + userAccount.getBalance());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserAccount account = new UserAccount(150000); // Initialize user account
        ATM atm = new ATM(account); // Create ATM with the account

        System.out.println("*********WELCOME TO OUR BANK*********");
        System.out.println("1-Deposit 2-Withdraw 3-CheckBalance 4-Exit");

        while (true) {
            System.out.print("Enter your choice: ");
            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter the amount to deposit: ");
                        if (scanner.hasNextInt()) {
                            int depositAmount = scanner.nextInt();
                            atm.deposit(depositAmount);
                        } else {
                            System.out.println("invalid input");
                            scanner.next();
                        }
                        break;
                    case 2:
                        System.out.print("Enter the amount to withdraw: ");
                        if (scanner.hasNextInt()) {
                            int withdrawAmount = scanner.nextInt();
                            atm.withdraw(withdrawAmount);
                        } else {
                            System.out.println("invalid input");
                            scanner.next();
                        }
                        break;
                    case 3:
                        atm.checkBalance();
                        break;
                    case 4:
                        System.out.println("Thank you for using our ATM.");
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice. Please enter a valid option.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // Consume invalid input
            }
        }
    }
}