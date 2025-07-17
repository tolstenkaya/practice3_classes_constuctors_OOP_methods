import java.util.Date;
import java.util.Scanner;

public class Book {
    private String title;
    private String author;
    private int yearPublished;

    public void setTitle(String title){
        this.title=title;
    }
    public void setAuthor(String author){
        this.author=author;;
    }
    public void setYearPublished(int yearPublished){
        this.yearPublished=yearPublished;
    }

    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public int getYearPublished(){
        return yearPublished;
    }
    Book(){
        setTitle("Dandelion Wine");
        setAuthor("Ray Bradbury");
        setYearPublished(1957);
    }

    Book(String title, String author, int year){
        setTitle(title);
        setAuthor(author);
        setYearPublished(year);
    }

    void printInfo(){
        System.out.println("Title: "+getTitle());
        System.out.println("Author: "+getAuthor());
        System.out.println("Year published: "+getYearPublished());
    }

    Book acceptInfo(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("-------------------------");

        System.out.print("Enter title: ");
        String book_title = scanner.nextLine();

        System.out.print("Enter author: ");
        String book_author = scanner.nextLine();

        System.out.print("Enter year: ");
        int book_yearPublished = scanner.nextInt();

        return new Book(book_title, book_author, book_yearPublished);

    }
}
