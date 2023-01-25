import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Book> Books;
    public Student(String name){
        this.name = name;
        Books = new ArrayList<Book>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void addBook (Book book) {
        Books.add(book);
    }
    public void removeBook (Book book) {
        Books.remove(book);
    }

    public List<Book> getBooks() {
        return Books;
    }

    public void read () {
        System.out.println("I'm reading now");
    }
}
