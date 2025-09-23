public class Book {
    private String title;

    public Book() {
        title = "None";
    }

    public Book(String myTitle) {
        title = myTitle;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String newTitle) {
        title = newTitle;
    }


}
class TestClass {
    public static void main(String[] args) {
        Book b1 = new Book("My Book");
        Book b2 = new Book("My Book");
        Book b3;

        b3 = b2;

        System.out.println(b1.getTitle());
        System.out.println(b2.getTitle());
        System.out.println(b3.getTitle());

    }
}