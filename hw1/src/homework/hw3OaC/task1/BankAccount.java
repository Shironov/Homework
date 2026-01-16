package homework.hw3OaC.task1;


/*
) Класс BankAccount: поля — номер счёта, владелец, баланс. Методы: deposit (пополнить),
 withdraw (снять, с проверкой что хватает денег), getBalance, displayInfo. Баланс не может быть отрицательным!
 */

public class BankAccount {

    private int accNumber;
    private String owner;
    private double balance;

    public BankAccount(int accNumber, String owner){
    this.accNumber = accNumber;
    this.owner = owner;
    this.balance = 0;
    }

    public void deposit(double money){
        if(money>0) {
            balance += money;
            System.out.println("Баланс пополнен на: " + money + "\nВаш баланс: " + balance);
        }else{
            System.out.println("Ошибка - Отрицательная сумма!");
        }
    }

    public void withDraw(double money){
        if(money > 0 && balance >= money){
            balance-= money;
            System.out.println("Снято: "+ money + "\n Ваш баланс: " + balance);
        }else{
            System.out.println("Недостаточно средств!");
        }
    }
    public double getBalance(){
        return balance;
    }
    public void displayInfo(){
        System.out.println("Информация о счете: ");
        System.out.println("Номер счета: "+ accNumber);
        System.out.println("Владелец: "+owner);
        System.out.println("Баланс: "+balance);

    }


}
