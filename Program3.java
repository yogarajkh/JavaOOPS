import java.util.*;

class Book {
    private String name;
    private String author;
    private double price;
    private int numPages;

    Book(String name, String author, double price, int numPages) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.numPages = numPages;
    }

    void setName(String name) {
        this.name = name;
    }

    void setAuthor(String author) {
        this.author = author;
    }

    void setPrice(double price) {
        this.price = price;
    }

    void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    String getName() {
        return name;
    }

    String getAuthor() {
        return author;
    }

    Double getPrice() {
        return price;
    }

    int getNumPages() {
        return numPages;
    }

    @Override
    public String toString() {
        return "Book [name=" + name + ", author=" + author + ", price=" + price + ", No. of pages=" + numPages + "]";
    }
}

class BookDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of books:");
        int n = scanner.nextInt();
        scanner.nextLine();

        Book[] books = new Book[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the details for book " + (i + 1) + ":");
            System.out.println("Name:");
            String name = scanner.nextLine();
            System.out.println("Author:");
            String author = scanner.nextLine();
            System.out.println("Price:");
            double price = scanner.nextDouble();
            System.out.println("Number of pages:");
            int numPages = scanner.nextInt();
            scanner.nextLine();

            books[i] = new Book(name, author, price, numPages);
        }

        for (Book book : books) {
            System.out.println(book);
        }

        
    }
}
