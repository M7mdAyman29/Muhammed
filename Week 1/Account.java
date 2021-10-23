import java.text.SimpleDateFormat;  
import java.util.Date;
 class Account 
 {
    private int id;
    private double balance;
    private double annulInterestRate;
    private  Date dataCreate = new Date();

    public Account() 
    {
        id = 0;
        balance = 0;
        annulInterestRate = 0;
    }

    public Account(int id, double balance)
    {
        this.id = id;
        this.balance = balance;
    }

    public void set_Id(int id) 
    {
        this.id = id;
    }

    public int getId() 
    {
        return id;
    }

    public void set_Balance(double balance) 
    {
        this.balance = balance;
    }

    public double get_Balance() 
    {
        return balance;
    }

    public void set_annulInteerestRate(double annulInterestRate)
    {
        this.annulInterestRate = annulInterestRate;
    }

    public double get_annulInterestRate() 
    {
        return annulInterestRate;
    }

    public void get_DataCreated() 
    {
     SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
    System.out.println(formatter.format(dataCreate));  
    }

    public double getMonthlyInterestRate()
    {
        return annulInterestRate / 12;
    }

    public void withdraw(double withdraw) 
    {
        balance -= withdraw;
    }

    public void deposit(double deposit) 
    {
        balance += deposit;
    }
}

 class Main 
 {

    public static void main(String[] args) 
    {
        Account a = new Account(1122, 20000);
        a.set_annulInteerestRate(4.5);
        a.withdraw(2500);
        a.deposit(3000);
        System.out.println("Your Balance Is : " + a.get_Balance());
        System.out.println("Your Monthly Interest Is : " + a.getMonthlyInterestRate() / 100 * a.get_Balance());
        System.out.print("You Create The Account In ");
        a.get_DataCreated();
    }

 }
