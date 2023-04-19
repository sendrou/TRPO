import java.util.Iterator;
import java.util.LinkedList;

class Library {
    String name;
    LinkedList<Book> bookList = new LinkedList();

    Library(String name, LinkedList<Book> bookList) {
        this.name = name;
        this.bookList = bookList;
    }

    void displayInfo() {
        System.out.printf("Название библиотеки: %s\n", this.name);
        Iterator var1 = this.bookList.iterator();

        while (var1.hasNext()) {
            Book bookList = (Book) var1.next();
            bookList.displayInfo();
        }
    }

    void displayAuthorInfo(String authorName, int authorFind) {
        Iterator var4 = this.bookList.iterator();

        while (var4.hasNext()) {
            Book bookList = (Book) var4.next();
            bookList.displayAuthorInfo(authorName, authorFind);
        }
    }
    void displayBookInfo(String bookName, int bookFind) {
        Iterator var6 = this.bookList.iterator();

        while (var6.hasNext()) {
            Book bookList = (Book) var6.next();
            bookList.displayBookInfo(bookName, bookFind);
        }
    }
}

