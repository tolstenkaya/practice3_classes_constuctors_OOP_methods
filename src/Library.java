import java.util.ArrayList;
import java.util.stream.Collectors;

public class Library {
    ArrayList<Book>books;

    public Library(){
        books=new ArrayList<Book>();
    }

    public ArrayList<Book> addBook(Book book){
        books.add(book);
        return books;
    }

    public void printAllBooks(){
        System.out.println("Books");
        for(Book book:books){
            book.printInfo();
            System.out.println();
        }
    }

    public Library findBooksByAuthor(String author){
        ArrayList<Book> found_books = books.stream().filter(book -> book.getAuthor().equals(author)).collect(Collectors.toCollection(ArrayList::new));
        Library library = new Library();
        for(Book book:found_books){
            library.addBook(book);
        }

        return library;
    }
}
