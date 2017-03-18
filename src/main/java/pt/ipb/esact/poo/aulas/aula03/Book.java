package pt.ipb.esact.poo.aulas.aula03;

public class Book {
    String title;
    int year;
    static int count;

    public Book() {
        this("not defined", -1);
    }

    public Book(String title) {
        this(title, -1);
    }

    public Book(int year) {
        this("not defined", year);
    }

    public Book(String title, int year) {
        setTitle(title);
        setYear(year);
        ++count;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setYear(int year) {
        if (year > 1900)
            this.year = year;
    }

    public int getYear() {
        return year;
    }

    public static void showCount() {
        System.out.println("count = " + count);
    }


}
