import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){

        //1. 📚 Створи клас Book з полями:
        //title, author, yearPublished (всі — String, крім year — int)
        //Реалізуй:
        //Конструктор
        //Метод printInfo() — виводить всі поля книги в гарному форматі
        //👉 Створи кілька об’єктів і протестуй.

//        Book book = new Book();
//        book.printInfo();
//        Book book1 = new Book("The Dreams In The Witch House","Howard Phillips Lovecraft", 1933);
//        book1.printInfo();
//        Book book2 = new Book();
//        book2 = book2.acceptInfo();
//        book2.printInfo();

        //2. 📐 Створи клас Rectangle з полями:
        //width, height (double)
        //Реалізуй:
        //Конструктор
        //Методи: calculateArea(), calculatePerimeter()
        //Метод isSquare() — повертає true, якщо ширина = висота

//        Rectangle rect = new Rectangle(12.5, 10);
//        System.out.println("Area: "+rect.calculateArea());
//        System.out.println("Perimeter: "+rect.calculatePerimeter());
//        System.out.println("The figure is square: "+rect.isSquare());

        //3. 👩‍🎓 Клас Student з полями:
        //name, age, grade (String, int, double)
        //Додай:
        //Метод isPassed() — повертає true, якщо grade >= 60
        //Метод increaseGrade(double percent) — збільшує оцінку

//        Student student = new Student("Alyona",24,90);
//        System.out.println("Student "+student.name+" passed exams: "+student.isPassed());
//        student.increaseGrade(7.5);
//        System.out.println(student.name+" has grade of "+student.grade);

        //4.
        //🔒 Перероби Student з попереднього завдання так:
        //Зроби всі поля private
        //Додай геттери та сеттери
        //Валідація: якщо grade < 0 або > 100 — не дозволяй встановлювати
//        Student student = new Student("Alyona",24,85);
////        student.printInfo();

        //5. 🏦 Створи клас з полями:
        //accountNumber (String), balance (double)
        //Реалізуй:
        //Метод deposit(double amount)
        //Метод withdraw(double amount) — лише якщо вистачає коштів
        //Метод printBalance()
//        BankAccount account = new BankAccount("123456789",0);
//        account.printBalance();
//        account.deposit(1000);
//        account.printBalance();
//        account.withdraw(500);
//        account.printBalance();
//        account.withdraw(1000);
//        account.printBalance();

        //6. 🚗 Поля: brand, model, fuel, isRunning
        //Реалізуй:
        //Метод startEngine() → запускає авто, змінює isRunning
        //Метод drive(double km) → зменшує паливо
        //Метод refuel(double liters) → додає паливо
        //💡 Подумай про початковий рівень пального та перевірку, чи вистачає його.
//        Car car = new Car("Toyota", "Camry", 50,false);
//        car.startEngine();
//        car.refuel(20);
//        car.drive(200);

        //7. 🎬 Створи клас Movie з полями:
        //title, genre, rating (0-10)
        //Реалізуй:
        //Метод isRecommended() — якщо рейтинг > 7
        //Створи список фільмів → відібрати рекомендовані

        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);
        ArrayList<Movie> movies = new ArrayList<Movie>();

        int choose_option = 0;
        do{
            System.out.println("Menu");
            System.out.println("1 - Add new movie");
            System.out.println("2 - Review all the movies");
            System.out.println("3 - Review recommended movies");
            System.out.println("0 - Exit!");
            System.out.println();
            System.out.print("Choose the option: ");
            choose_option=scan.nextInt();
            scan.nextLine();

            switch (choose_option){
                case 1:{
                    createMovie(movies, scan);
                    System.out.println("Movie was added!");
                    break;
                }
                case 2:{
                    reviewMovies(movies);
                    break;
                }
                case 3:{
                    reviewRecommendedMovies(movies);
                    break;
                }
                case 0:{
                    System.out.println("Exiting...");
                    break;
                }
                default:{
                    System.out.println("You enter the wrong number");
                }
            }
        }while(choose_option!=0);

    }

    public static void createMovie(ArrayList<Movie> list_movies, Scanner scan){
        System.out.println();
        System.out.print("Enter title: ");
        String user_title = scan.nextLine();
        System.out.print("Enter genre: ");
        String user_genre = scan.nextLine();
        System.out.print("Enter rating: ");
        double user_rating = scan.nextDouble();

        scan.nextLine();

        Movie movie = new Movie(user_title,user_genre,user_rating);
        list_movies.add(movie);
    }

    public static void reviewMovies(ArrayList<Movie> list_movies){
        System.out.println();
        System.out.println("Movies");

        for(int i=0;i<list_movies.size();i++){
            System.out.println(i+1+". Title: "+list_movies.get(i).getTitle());
            System.out.println("Genre: "+list_movies.get(i).getGenre());
            System.out.println("Rating: "+list_movies.get(i).getRating());
            System.out.println();
        }
    }

    public static void reviewRecommendedMovies(ArrayList<Movie> list_movies){
        System.out.println();
        System.out.println("Recommended movies");

        for(int i=0;i<list_movies.size();i++){
            if(list_movies.get(i).isRecommended()){
                System.out.println("Title: "+list_movies.get(i).getTitle());
                System.out.println("Genre: "+list_movies.get(i).getGenre());
                System.out.println("Rating: "+list_movies.get(i).getRating());
                System.out.println();
            }
        }
    }

}
