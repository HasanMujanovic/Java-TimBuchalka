public class Bank {
    private int number;
    private double balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public void depositFunds(double deposit){
        setBalance(deposit);
    }
    public void withdrawFunds(double withdraw){
        if (withdraw - this.balance > 0){
            System.out.println("You have less money " +
                    "than you want to withdraw");
        } else balance -= withdraw;

    }
    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setBalance(double balance) {
        this.balance += balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


}
