package xx;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test2 {
    public static void main(String[] args) {

        Account Xiaoli = new Account(1122, 20000, 4.5);
        Xiaoli.withDraw(2500);
        Xiaoli.deposit(3000);
        System.out.println("账户:" + Xiaoli.getid() + "的余额:" + Xiaoli.getbalance());
        System.out.println("账户:" + Xiaoli.getid() + "的月利息:" + Xiaoli.GetMonthlyInterestRate());
        Xiaoli.getdateCreated();

    }
}

class Account {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0.0;
    private int dateCreated;

    GregorianCalendar cl = new GregorianCalendar();

    public Account() {
    }// 创建的无参构造方法

    public Account(int id, double balance, double annualInterestRate) {// 创建特定id构造方法
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        // System.out.println("您的账户:" + id + "\n余额:" + balance + "\n年利率:" +
        // annualInterestRate + "%");
    }

    public void getdateCreated() {
        System.out.print("开户时间是: " + cl.get(Calendar.YEAR) + "年" + (cl.get(Calendar.MONTH) + 1) + "月"
                + cl.get(Calendar.DAY_OF_MONTH) + "日");
    }

    public int getid() {
        return this.id;
    }

    public int setid(int id) {
        this.id = id;
        return this.id;
    }

    public double getbalance() {
        return balance;
    }

    public double setbalance(double balance) {
        this.balance = balance;
        return balance;
    }

    public double getannualInterestRate() {
        return annualInterestRate;
    }

    public double setannualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
        return annualInterestRate;
    }

    public double GetMonthlyInterestRate() {
        return annualInterestRate / 12 * balance / 100;
    }

    public double withDraw(double amount) {
        balance -= amount;
        return balance;
    }

    public double deposit(double amount) {
        balance += amount;
        return balance;
    }

}
