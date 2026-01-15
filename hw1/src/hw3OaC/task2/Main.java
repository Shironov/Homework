package hw3OaC.task2;
/*2) Класс Book: поля — название, автор, год издания, количество страниц, прочитано страниц. Методы: read(pages)
— добавляет прочитанные страницы, getProgress() — возвращает процент прочитанного, isFinished() — вернёт true если дочитана*/
public class Main {
    static void main() {
        Book book = new Book("Мастер и Маргарита", "М.А. Булгаков", 1967, 100);

        book.read(26);
        System.out.println(book.getProgress());

        boolean finish = book.isFinished();
        System.out.println(finish);

    }

}
