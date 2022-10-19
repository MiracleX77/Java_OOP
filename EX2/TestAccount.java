package EX2;

public class TestAccount {
    public static void main(String[] args) {
        Customer c1 = new Customer(101,"big", 1000);
        Account a1=new Account(101, c1, 10000);
        System.out.println(a1);
        a1.deposit(50000);
        System.out.println(a1);
        a1.withdraw(2500);
        System.out.println(a1);
    }
    
}
