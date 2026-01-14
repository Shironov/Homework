package hw3OaC.task3;

import java.util.Arrays;

public class Student {
    private String name;
    private double[] grades; // null -> [....]
    int count;

    public Student(String name) {
        this.name = name;
        this.grades = new double[100];
        this.count = 0;
    }

    public void addGrade(int grade) {

        if (this.count > 99) {
            System.out.println("Нельзя добавить оценку, потому что лимит.");
            return;
        }

        grades[count] = grade;
        count++;


    }

    public String getName() {
        return name;
    }

    public double[] getGrades() {
        return grades;

    }

    public double getAverage() {
        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += grades[i];
        }

        double avarege = 0;
        if (count > 0) {
            avarege = (double) sum / count;
        }

        return avarege;
    }

    @Override
    public String toString() {
        return "========================================\n" +
                "Имя студента: " + name + "\n" +
                "Средний бал: " + getAverage() + "\n" +
                "========================================\n";
    }
}
