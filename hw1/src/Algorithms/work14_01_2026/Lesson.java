package Algorithms.work14_01_2026;

public class Lesson {
    static void main(String[] args) {
        /*
        Префиксные суммы (prefix sum)
            - множественные зпросы сумм
            - подсчет кол-во элементов
            - задачи накоппительными значениями
            - поиск подмассива с заданой суммой
         */
        /*
        Формула:
        sum(left, right) = prefix[right + 1] - prefix[left]

        Визуал:
        Исходный массив: [3, 1, 4, 2, 5]
               Индексы:   0  1  2  3  4   5
        Prefix sum:      [0, 3, 4, 8, 10, 15]

        prefix[0] = 0 (простая сумма)
        prefix[1] = 3 (сумма [0..0]
        prefix[2] = 3 + 1 = 4 ( [0..1])
        prefix[3] = 3+1+4 = 8 (0..2)
        prefix[4] = 3+1+4+2 = 10
        prefix[5] = 3+1+4+2+5 = 15

        sum(1,3) = prefix[3+1] - prefix[1] = 10 - 3 = 7
         */

        int[] numbers = {3,1,4,2,5};

        System.out.println(prefixSum(numbers, 1,3)); // 7
        System.out.println(prefixSum(numbers, 0,3)); // 10
    }

    private static int prefixSum(int[] numbers, int left, int right) {
        int[] prefix = new int[numbers.length + 1]; // [0, 0, 0, 0, 0]

        for(int i = 0; i< numbers.length; i++){
            prefix[i+1] = prefix[i] + numbers[i];
        }

        return prefix[right + 1] - prefix[left];

    }


}
