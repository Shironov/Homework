package hw3OaC.task3;

public class Group {
    private Student[] students;
    private int count;
    public Group(int size) {
        students = new Student[size];
        count = 0;
    }
    public void addStudent(String name){
       students[count] = new Student(name);
       count++;
    }
    public double getAverageGrade(){
        double sum = 0;
        for(int i = 0; i < count; i++){
            sum += students[i].getAverage();
        }

        return sum;
    }

    public void displayAll(){
        for (Student student : students){
            System.out.println(student);
        }
    }
}
