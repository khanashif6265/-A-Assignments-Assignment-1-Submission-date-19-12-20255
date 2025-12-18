import java.util.Scanner;


class BankAccount {
private double balance;
private String name;


BankAccount(String name, double balance) {
this.name = name;
this.balance = balance;
}


void deposit(double amt) {
balance += amt;
}


void withdraw(double amt) throws Exception {
if (amt > balance) throw new Exception("Insufficient Balance");
balance -= amt;
}


void display() {
System.out.println("Name: " + name);
System.out.println("Balance: " + balance);
}
}


class BankMain {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
BankAccount acc = new BankAccount("User", 1000);
try {
acc.deposit(500);
acc.withdraw(300);
acc.display();
} catch (Exception e) {
System.out.println(e.getMessage());
}
}
}