import java.util.Scanner;

class BookForArray {
    String title, author;
    public BookForArray(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

public class BookArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BookForArray[] book = new BookForArray[2];

        for (int i = 0; i < book.length; i++) {
            System.out.print("Title>> ");
            String title = scanner.nextLine();
            System.out.print("Author>> ");
            String author = scanner.nextLine();

            book[i] = new BookForArray(title, author);
        }

        for (int i = 0; i < book.length; i++) {
            System.out.println("(" + book[i].title + ", " + book[i].author + ")");
        }

        scanner.close();
    }
}
