public class Main{
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
    }
}