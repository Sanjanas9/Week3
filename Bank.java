class BankAcccount {
    double balance = 50000;
    float intrestRate = 10.00f;
}

 

class SavingsAccount extends BankAcccount {
    Scanner sc = new Scanner(System.in);
    double minBalance = 500;

 

    void withdraw() {
        while(true){
            System.out.println("Enter the Amount");
            double amount = sc.nextDouble();
            double balance1 = balance - amount;
            if ( balance1>= minBalance) {
                balance=balance-amount;
                System.out.println(" balance is " + balance);
                break;
            } else {
                System.out.println("Amount must be greater than minimum balance");
            }
        }
    }

 

}

 

public class BankAccounts {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount();
        sa.withdraw();
    }
}