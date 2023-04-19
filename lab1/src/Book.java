class Book {
    String name;
    String author;
    int yearOfWriting;

    Book(String name, String author, int yearOfWriting) {
        this.name = name;
        this.author = author;
        this.yearOfWriting = yearOfWriting;
    }

    void displayInfo() {
        System.out.printf("Название книги: %s, Автор: %s, Год написания: %d\n", this.name, this.author, this.yearOfWriting);
    }
    void displayAuthorInfo(String authorName, int authorFind) {
        if(authorName.equals(this.author)) {
            System.out.printf("Название книги: %s, Автор: %s, Год написания: %d\n", this.name, this.author, this.yearOfWriting);
            authorFind++;
        }
    }
    void displayBookInfo(String bookName, int bookFind) {
        if(bookName.equals(this.name)) {
            System.out.printf("Название книги: %s, Автор: %s, Год написания: %d\n", this.name, this.author, this.yearOfWriting);
            bookFind++;
        }
    }
}