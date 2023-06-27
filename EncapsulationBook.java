package Encapsulation;

public class EncapsulationBook {
    private String title;
    private String author;
    private int year;

    public EncapsulationBook(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
    }
}

class Main5 {
    public static void main(String[] args) {
        EncapsulationBook book = new EncapsulationBook("To Kill a Mockingbird", "Harper Lee", 1960);

        System.out.println("Original Book Info:");
        book.displayBookInfo();

        book.setYear(1962);
        System.out.println("\nUpdated Book Info:");
        book.displayBookInfo();

        book.setTitle("The Great Gatsby");
        book.setAuthor("F. Scott Fitzgerald");
        System.out.println("\nModified Book Info:");
        book.displayBookInfo();
    }
}

