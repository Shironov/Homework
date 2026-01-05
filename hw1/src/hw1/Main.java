package hw1;

import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        //Год рожденияи и возраст


        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год рождения: ");
        int birthYear = scanner.nextInt();
        int currentYear = 2026;
        int age = currentYear - birthYear;
        System.out.println("Ваш возраст " + age);*/



        //Проценты

        /*Scanner scanner = new Scanner(System.in);


        while(true){
            System.out.println("Введите сумму: ");
            float sum = scanner.nextFloat();
            System.out.println("Чаевые: ");
            int tips = scanner.nextInt();
            switch (tips){


                case 10:
                    System.out.println("Чаевые: " + sum * 0.1);
                    break;
                case 15:
                    System.out.println("Чаевые: " + sum * 0.15);
                        break;
                case 30:
                    System.out.println("Чаевые: " + sum * 0.3);
                        break;
                default:
                    System.out.println("Некорректный ввод! Введите 10, 15 или 30: ");
                    tips = scanner.nextInt();
                    break;


            }*/


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите температуру в градусах Цельсия: ");

        double tempC = scanner.nextDouble();

        double tempF = tempC * 1.8 + 32;

        System.out.println("Температура в Фаренгейтах: " + tempF);



    }
}
