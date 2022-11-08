package tr.edu.maltepeproject.oop;

public class Student extends  Person {

    public void borrows(Book b1) {

            System.out.println(setName() + " Borrowed " + b1.getTitle());
        }

        public void reads(Book b1){
            System.out.println(setName() + " Reading " + b1.getTitle());

        }
    }
