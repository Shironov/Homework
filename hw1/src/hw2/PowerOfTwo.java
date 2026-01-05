package hw2;

import java.util.Scanner;

public class PowerOfTwo {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = sc.nextInt();

        if(n > 0 && (n & (n-1)) == 0){
            System.out.println("Степень двойки");

        } else {
            System.out.println("Не степень двойки");
        }
    }
}
