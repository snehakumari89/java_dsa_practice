package oops.encapsulation;

public class Main {
    public static void main(String[] args) {
        Banking acc=new Banking("Sneha","1234",5000);
        System.out.println(acc.getAccountHolderName());
        acc.deposit(20000);
        System.out.println(acc.getBalance());
        acc.withdraw(500);
        System.out.println("final amount"+" "+acc.getBalance());
        acc.setAccountHolderName("Guriya");
        System.out.println(acc.getAccountNumber());
        System.out.println(acc.getAccountHolderName());

    }
}
