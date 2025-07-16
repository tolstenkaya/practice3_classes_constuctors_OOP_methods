import java.util.Date;
import java.util.Scanner;

public class Book {
    String title;
    String author;
    int yearPublished;

    Book(){
        title = "Dandelion Wine";
        author = "Ray Bradbury";
        yearPublished = 1957;
    }

    Book(String title, String author, int year){
        this.title=title;
        this.author=author;
        this.yearPublished=year;
    }

    void printInfo(){
        System.out.println("-------------------------");
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Year published: "+yearPublished);
        System.out.println("-------------------------");
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
