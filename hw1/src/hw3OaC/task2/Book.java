package hw3OaC.task2;
/*2) Класс Book: поля — название, автор, год издания, количество страниц, прочитано страниц. Методы: read(pages) —
 добавляет прочитанные страницы, getProgress() — возвращает процент прочитанного, isFinished() — вернёт true если дочитана*/
public class Book {
    private String title;
    private String author;
    private int year;
    private int countPages;
    private int countRead;


    public Book(String title, String author, int year, int countPages){
        this.title = title;
        this.author = author;
        this.year = year;
        this.countPages = countPages;
        this.countRead = 0;

    }


    void read(int pages){
        if (pages <= 0) {
            System.out.println("Ошибка! Количество страниц должно быть положительным");
            return;
        }
        int remainder = countPages - countRead;

        if(pages > remainder){
            System.out.println("В книге нет столько страниц! осталось страниц: " + remainder);
        }
        else{
            countRead+=pages;
            System.out.println("Вы прочитали: "+ pages+" страниц. "+ "Осталось: " + (countPages-countRead)+" страниц!");

        }




    }
    double getProgress(){
        return (double) countRead/countPages * 100;

    }
    boolean isFinished(){
        return countRead >= countPages;
    }

}
