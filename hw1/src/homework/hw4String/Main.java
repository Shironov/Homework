package homework.hw4String;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static void main() {

//    upperFirstWord("hello       world yeS");

        Cat cat = new Cat();
        System.out.println(cat);
    }

    /*
    1.Строку разбить на массив слов
    2.Проходим по массиву подстрок чтобы у каждого слова изменить первую букву
    3.Изменяем первую букву каждого слова на верхний регистр
    4. Соединяем все слова водну строку и выводим
     */
   static void upperFirstWord(String text){

        String[] words = text.split("\\s+");

       System.out.println(Arrays.toString(words));
        StringBuilder result = new StringBuilder();
        for(String word : words){

            // word = hello
            result.append(Character.toUpperCase(word.charAt(0))) // H
                    .append(word.substring(1)) // ello
                    .append(" ");
        }
        System.out.println(result);
    }
}
