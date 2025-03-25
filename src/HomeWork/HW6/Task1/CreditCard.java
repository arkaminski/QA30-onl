package HomeWork.HW6.Task1;
import java.util.Scanner;

public class CreditCard{

    private long accountNum;
    private int balance;

    public CreditCard(long accountNum, int balance){
        this.accountNum = accountNum;
        this.balance = balance;
    }

    public void depositToBalance(int money){
        balance += money;
        System.out.println("After replenishing the balance on " + money + " your balance is: " + balance);
        Scanner sc = new Scanner(System.in);
    }

    public void withdrawFromBalance(int money){
        if(balance < money){
            System.out.println("You withdraw " + money + ", but your balance is:  " + balance);
            Scanner sc = new Scanner(System.in);
            return;
        }
        balance -= money;
        System.out.println("After withdraw " + money + "your balance is: " + balance);
        Scanner sc = new Scanner(System.in);
    }

    public void allInfo(){
        System.out.println("Account number - " + accountNum + "\n"
                + "Balance - " + balance);
        Scanner sc = new Scanner(System.in);
    }

}
