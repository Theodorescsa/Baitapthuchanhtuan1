public class CreditCard {
    private String customer;
    private String bank;
    private String account;
    int limit;
    double balance;
    
    public CreditCard(String customer, String bank, String account, int limit, double balance) {
        this.customer = customer;
        this.bank = bank;
        this.account = account;
        this.limit = limit;
        this.balance = balance;
    }
    public CreditCard(String customer, String bank, String account, int limit) {
        this.customer = customer;
        this.bank = bank;
        this.account = account;
        this.limit = limit;
    }
    public CreditCard(CreditCard ob) {
        this.customer = ob.customer;
        this.bank = ob.bank;
        this.account = ob.account;
        this.limit = ob.limit;
        this.balance = ob.balance;
    }
    public String getCustomer() {
        return this.customer;
    }
    public String getBank() {
        return this.bank;
    }    
    public String getAccount() {
        return this.account;
    }    
    public int getLimit() {
        return this.limit;
    }
    public double getBalance() {
        return this.balance;
    }
    public static void printSummary(CreditCard ob) {
        System.out.println("-----------------------------\n");
        System.out.println("Customer|"+ob.getCustomer()+"\n");
        System.out.println("-----------------------------\n");
        System.out.println("Bank    |"+ob.getBank()+"\n");
        System.out.println("-----------------------------\n");
        System.out.println("Account |"+ob.getAccount()+"\n");
        System.out.println("-----------------------------\n");
        System.out.println("Limit   |"+ob.getLimit()+"\n");
        System.out.println("-----------------------------\n");
        System.out.println("Balance |"+ob.getBalance()+"\n");
    }
    public boolean charge(double price) {
        if(price+balance > limit) {
            System.out.println("Chuc nang thanh toan khong hoat dong duoc vui long tra no!!\n");
            return true;
        } else {
            balance+=price;
            System.out.println("Da thanh toan thanh cong!Khoan no hien tai:"+balance);
            return false;
        }
    }
    public void makePayment(double amount) {
        balance -= amount;
        System.out.println("ban da tra "+amount+" cho ngan hang!"+" Khoan no hien tai:"+balance);
    }
    public static void main(String[] args) {
        CreditCard person1 = new CreditCard("HaMy","Vietcombank","123456789",2000000000,1203424.9);
        printSummary(person1);
        person1.charge(2000000);
        person1.charge(2000000000);
        person1.makePayment(1000000000);
    }
}