package homework.hw3OaC.task3;

public class Main {

    static void main() {
        Group group = new Group(3);
        group.addStudent("Ann");
        group.addStudent("Petr");
        group.addStudent("Vasya");

        group.displayAll();
    }
}
