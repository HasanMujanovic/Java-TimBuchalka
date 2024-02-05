public class Main {
    public static void main(String[] args) {
Bank bank = new Bank();
bank.depositFunds(100);
bank.withdrawFunds(130);
System.out.println(bank.getBalance());
    }
}
