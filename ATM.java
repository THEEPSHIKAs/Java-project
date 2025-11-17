import java.util.*;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 5000;

        while (true) {
            System.out.println("1-Check Balance  2-Deposit  3-Withdraw  4-Exit");
            int ch = sc.nextInt();

            if (ch == 1)
                System.out.println("Balance: " + balance);

            else if (ch == 2) {
                System.out.print("Enter amount: ");
                balance += sc.nextInt();
            }

            else if (ch == 3) {
                System.out.print("Enter amount: ");
                int amt = sc.nextInt();
                if (amt <= balance)
                    balance -= amt;
                else
                    System.out.println("Insufficient balance");
            }

            else
                break;
        }
    }
}
