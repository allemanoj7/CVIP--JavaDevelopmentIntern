import java.util.Scanner;
class ATM {
    float Balance;
    int PIN = 2345;
    Scanner sc = new Scanner(System.in);
    public void checkPin() {
        System.out.print("Enter your pin : ");
        int enteredpin = sc.nextInt();
        System.out.println();
        if (enteredpin == PIN) {
            menu();
        } else {
            System.out.println("Enter a Valid pin ");
            checkPin();
        }
    }
    public void menu() {
        System.out.println("Enter Your Choice : ");
        System.out.println("1.Check Account Balance");
        System.out.println("2.Withdraw Amoount");
        System.out.println("3.Deposite Amount");
        System.out.println("4.Exit");
        int opt = sc.nextInt();
        System.out.println();
        if (opt == 1) {
            checkBalance();
        }

        else if (opt == 2) {
            withDrawAmt();
        }

        else if (opt == 3) {
            depositeAmt();
        } else if (opt == 4) {
            return;
        } else {
            System.out.println("Enter a Valid Option");
        }
    }

    public void checkBalance() {
        System.out.println("Balance :" + Balance + "\n");
        menu();
    }

    public void withDrawAmt() {
        System.out.print("Enter Amount to Withdraw : ");
        float amount = sc.nextFloat();
        if (amount > Balance) {
            System.out.println("Insufficient Balance");
        } else {
            Balance = Balance - amount;
            System.out.println("Amount withdrawl successfully");
        }
        System.out.println();
        menu();
    }

    public void depositeAmt() {
        System.out.print("Enter Amount  to Deposite : ");
        float amount = sc.nextInt();
        Balance = Balance + amount;
        System.out.println("Amount Deposited Successfully");
        System.out.println();
        menu();
    }
}

class ATMInterface {
    public static void main(String[] args) {

        ATM obj = new ATM();
        obj.checkPin();
    }
}