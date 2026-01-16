package homework.hw3OaC.task1;

public class main {
    public static void main(){
        BankAccount account = new BankAccount(176, "Михаил");
        account.deposit(1000);
        account.withDraw(550.6);
        account.withDraw(100000);
        double balance = account.getBalance();
        System.out.println("Текущий баланс: "+ balance);
        account.displayInfo();
    }

}
