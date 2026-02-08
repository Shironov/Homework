package Exam.work_01_ARRAY.Lab1;

public class DArray {
    private int[] array;
    private int size;
    private int capacity;
    private int reallocCount;

    public DArray() {
        capacity = 1;
        array = new int[capacity];
        size = 0;
        reallocCount = 0;
    }

    public void add(int value) {
        if (size == capacity) {
            capacity *= 2;
            int[] newArray = new int[capacity];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
            reallocCount++;
        }
        array[size++] = value;
    }

    public static void main(String[] args) {
        DArray arr = new DArray();
        for (int i = 0; i < 1000; i++) {
            arr.add(i);
        }
        System.out.println("Реаллокаций: " + arr.reallocCount);
        System.out.println("Финальная емкость: " + arr.capacity);
    }
}