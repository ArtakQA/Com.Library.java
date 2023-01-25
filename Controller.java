public class Controller {
    public static void main(String[] args) {
        Library Lib = new Library("New York public library", "476 5th Ave · Near Bryant Park");
        Book Potter = new Book();
        Potter.setAuthor("Joanne Rowling");
        Potter.setTitle("Harry Potter and philosophy stone");
        Lib.addToBooksWarehouse(Potter);
        Student Human = new Student("Alen Smith");
        Lib.Take(Potter);
        Human.addBook(Potter);
        Human.read();
        Human.removeBook(Potter);
        Lib.Return(Potter);
        System.out.println("Thank you very much!!!!");
    }
}
