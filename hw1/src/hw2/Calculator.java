package hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        double a = sc.nextDouble();
        System.out.println("Введите второе число: ");
        double b = sc.nextDouble();
        System.out.println("Введите операцию (+, -, *, /): ");
        char op = sc.next().charAt(0);
        switch (op){
            case '+':
                System.out.println("Результат: " + (a + b));
                break;
            case '-':
                System.out.println("Результат: " + (a - b));
                break;
            case '*':
                System.out.println("Результат: " + (a * b));
            case '/':
                if(b==0){
                    System.out.println("Ошибка");

                }else {
                    System.out.println("Результат: " + (a / b));
                }
                break;
            default:
                System.out.println("Некорректный ввод");
        }


    }
}
