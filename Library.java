import java.util.ArrayList;
import java.util.List;

public class Library {
    private String name;
    private String location;
    private List<Book> booksWarehouse;

    public Library(String name, String location) {
        booksWarehouse = new ArrayList<Book>();
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public void addToBooksWarehouse(Book book) {
        booksWarehouse.add(book);
    }

    public boolean Take(Book book) {
        if (booksWarehouse.contains(book)) {
            booksWarehouse.remove(book);
            return true;
        } else {
            System.out.println("This product is not in the Library.");
            return false;
        }
    }
    public void Return(Book book) {
        booksWarehouse.add(book);
    }
}
