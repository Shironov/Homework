package Classwork.work_16_01_STRING;

public class Lesson {

    static void main() {
        String str1 = "Hello";
        String str2 = new String("Hello");
        char[] chars = {'h', 'i'};
        String s3 = new String(chars);

        /*

        | Последовательность | Значение |
        |-------------------|----------|
        | `\n` | Новая строка (перевод строки) |
        | `\t` | Табуляция |
        | `\\` | Обратный слэш |
        | `\"` | Двойная кавычка |
        | `\'` | Одинарная кавычка |

         */
        System.out.println("Hello\n");

        String s4 = "Hello";
        s4 = s4.toLowerCase();
        System.out.println(s4);


        String a = "hi";
        String b = "h1";
        System.out.println(a==b);

        String c = new String("hi");

        System.out.println(a==c);
        System.out.println(a.equals(c));

        // [1,2,3,4,5....10000] вывести строку которая создержит "1, 2, 3, 4"
        String result = "";
        for(int i=0; i<10000; i++){
            result = result + i +", ";
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<10000; i++){
            sb.append(i).append(", ");
        }
        System.out.println(sb.toString());


//        String name = getName();
//        if(name.equals("Ann")){} // Плохо
//        if(name!= null && name.equals("Ann")){} // Хорошо
//        if("Ann".equals(name)){} // Хорошо

        a = "apple";
        b = "banan";
        int res = a.compareTo(b);  // (-) a<b \\(+) a>b \\ (0) a==b


        // Форматирование
        String name = "Вася";
        int age =22;
        double salary = 500.5;

        System.out.printf("Имя: %s, возраст: %d, зарплата: %.2f", name,age,salary);
        String info = String.format("Имя: %s, возраст: %d, зарплата: %.2f", name,age,salary);
    }

    // Подсчитай, сколько раз буква 'а' (включая 'А') встречается в строке.
    public static void task1(String text){

        int count = 0;
        char[] chars = text.toLowerCase().toCharArray();

        for(char c : chars){
            if(c=='a'){
                count++;
            }
        }

        System.out.println(count);
    }

    // Разверни строку задом наперёд.
    public void reverse(String text){
        char[] chars = text.toCharArray();
        for(char c : chars){
        }
    }
}
