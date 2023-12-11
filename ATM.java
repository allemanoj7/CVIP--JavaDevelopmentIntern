import java.util.Scanner;

class BankTerminal {
    float accountBalance;
    int personalIdentificationNumber = 2345;
    Scanner scanner = new Scanner(System.in);

    public void authenticateUser() {
        System.out.print("Enter your PIN: ");
        int enteredPIN = scanner.nextInt();
        System.out.println();
        if (enteredPIN == personalIdentificationNumber) {
            displayMenu();
        } else {
            System.out.println("Enter a valid PIN");
            authenticateUser();
        }
    }

    public void displayMenu() {
        System.out.println("Enter Your Choice: ");
        System.out.println("1. Check Account Balance");
        System.out.println("2. Withdraw Amount");
        System.out.println("3. Deposit Amount");
        System.out.println("4. Exit");
        int option = scanner.nextInt();
        System.out.println();
        if (option == 1) {
            checkAccountBalance();
        } else if (option == 2) {
            withdrawAmount();
        } else if (option == 3) {
            depositAmount();
        } else if (option == 4) {
            return;
        } else {
            System.out.println("Enter a valid option");
        }
    }

    public void checkAccountBalance() {
        System.out.println("Account Balance: " + accountBalance + "\n");
        displayMenu();
    }

    public void withdrawAmount() {
        System.out.print("Enter Amount to Withdraw: ");
        float amount = scanner.nextFloat();
        if (amount > accountBalance) {
            System.out.println("Insufficient Balance");
        } else {
            accountBalance = accountBalance - amount;
            System.out.println("Amount withdrawal successful");
        }
        System.out.println();
        displayMenu();
    }

    public void depositAmount() {
        System.out.print("Enter Amount to Deposit: ");
        float amount = scanner.nextInt();
        accountBalance = accountBalance + amount;
        System.out.println("Amount Deposited Successfully");
        System.out.println();
        displayMenu();
    }
}

class ATM {
    public static void main(String[] args) {
        BankTerminal bankTerminal = new BankTerminal();
        bankTerminal.authenticateUser();
    }
}
