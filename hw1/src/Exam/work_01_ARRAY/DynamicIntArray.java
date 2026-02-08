package Exam.work_01_ARRAY;

import java.util.Arrays;

public class DynamicIntArray {
    private int[] buffer;
    private int size;

    public DynamicIntArray() {
        this.buffer = new int[10];
        this.size = 0;
    }
    int[] debug() {
        return buffer;
    }

    public void add(int x) {
        if (buffer.length == size) {
            buffer = Arrays.copyOf(buffer, buffer.length * 2);
        }
        buffer[size++] = x;

    }
    public int getSize(){
        return size;
    }

    public static void main(){
        DynamicIntArray array = new DynamicIntArray();

        int[] oldref = array.debug();
        System.out.println("Исходная ссылка на buffer: " + oldref);
        System.out.println("Исходная емкость " + oldref);

        for(int i=0; i<=9; i++){
            array.add(i);
        }
        System.out.println("Текущий размер массива: " + array.getSize());
        System.out.println("Проверка ссылок на равенство: " + (array.debug() == oldref));

        System.out.println("Добавляем еще один елемент в buffer");

        array.add(54);

        int[] newRef = array.debug();
        System.out.println("Новая ссылка на buffer: "+ newRef);
        System.out.println(newRef == oldref);
    }

}
