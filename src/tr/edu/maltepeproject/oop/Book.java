package tr.edu.maltepeproject.oop;

public class Book {
    private String title;

    public Book(String title) {
        this.title = title;
    }
    boolean available = false;
    public void bookAvailable() {
        available = true;

    }
    public void bookNotAvailable() {
        available = false;
    }
    boolean isBookAvailable() {
        return  available;
    }




    public String getTitle(){ return title;}

    public void setTitle(){ this.title = title;}

    public String toString(){
        return "Title:" + this.title;
    }
}
