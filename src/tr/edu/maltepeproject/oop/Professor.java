package tr.edu.maltepeproject.oop;

public class Professor extends Person {
    public void borrows(Book b1) {
        if (b1.available) {
            System.out.println(setName() + " Borrowed " + b1.getTitle());
        } else {
            System.out.println(b1.getTitle() + " is not available");
        }
    }

        public void reads(Book b2){
        System.out.println(setName() + " Reading " + b2.getTitle());
    }

}