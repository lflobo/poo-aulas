package pt.ipb.esact.poo.aulas.aula03;

public class Book {
    String title;
    int year;
    static int count;

    Book() {
        this("not defined", -1);
    }

    Book(String title) {
        this(title, -1);
    }

    Book(int year) {
        this("not defined", year);
    }

    Book(String title, int year) {
        setTitle(title);
        setYear(year);
        ++count;
    }

    void setTitle(String title) {
        this.title = title;
    }

    String getTitle() {
        return title;
    }

    void setYear(int year) {
        if (year > 1900)
            this.year = year;
    }

    int getYear() {
        return year;
    }

    static void showCount() {
        System.out.println("count = " + count);
    }


}
