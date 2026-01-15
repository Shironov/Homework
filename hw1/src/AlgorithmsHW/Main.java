package AlgorithmsHW;

public class Main {
    public static void main() {
        int[] arr = {1, 4, 2, 10, 23, 3, 1, 0, 20};
        int K = 4;
        System.out.println("Наибольшая сумма окна в массиве: " + maxSum(arr, K));


    }

    public static int maxSum(int[] array, int k) {
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += array[i];
        }

        int maxSum = windowSum;


        for (int i = k; i < array.length; i++) {
            windowSum = windowSum + array[i] - array[i - k];
            maxSum = (maxSum > windowSum) ? maxSum : windowSum;
        }

        return maxSum;
    }
}

