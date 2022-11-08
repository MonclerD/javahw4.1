package tr.edu.maltepeproject.oop;

public class Main {

    public static void main(String[] args) {
	Student s1 = new Student();
    Professor p1 = new Professor();
    Book b1= new Book("Java Book");
    Book b2 = new Book("C prog Book");
    Book b3 = new Book("Op system Book");
    Library l1 = new Library();

    b1.bookAvailable();
    b1.isBookAvailable();
    b2.bookAvailable();
    b2.isBookAvailable();

    s1.setName("Emin");
    p1.setName("Ensar");
    s1.borrows(b1);
    l1.lends(b1);
    s1.reads(b1);
    b1.bookNotAvailable();

    p1.borrows(b2);
    l1.lends(b2);
    p1.reads(b2);

    }
}
