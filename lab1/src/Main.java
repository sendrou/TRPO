import java.util.*;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        LinkedList<Library> libraryList = new LinkedList();
        LinkedList<Book> bookListFirst = new LinkedList();

        bookListFirst.add(new Book("451 градус по Фаренгейту", "Рэй Брэдбери", 1953));
        bookListFirst.add(new Book("Марсианские хроники", "Рэй Брэдбери", 1950));
        bookListFirst.add(new Book("Всё лето в один день", "Рэй Брэдбери", 1954));
        bookListFirst.add(new Book("1984", "Джордж Оруэлл", 1984));
        bookListFirst.add(new Book("Скотный двор", "Джордж Оруэлл", 1945));
        libraryList.add(new Library("Гомельская", bookListFirst));

        LinkedList<Book> bookListSecond = new LinkedList();
        bookListSecond.add(new Book("Почему я пишу", "Джордж Оруэлл", 1946));
        bookListSecond.add(new Book("Будет ласковый дождь", "Рэй Брэдбери", 1950));
        bookListSecond.add(new Book("Пешеход", "Рэй Брэдбери", 1951));
        bookListSecond.add(new Book("Дни в Бирме", "Джордж Оруэлл", 1934));
        bookListSecond.add(new Book("Памяти Каталонии", "Джордж Оруэлл", 1938));
        libraryList.add(new Library("Минская", bookListSecond));

        Scanner in = new Scanner(System.in);



        int k = 0;
        while(k==0) {


            int authorFind = 0;
            int bookFind = 0;
            System.out.print("1.Вывести всю информацию\n");
            System.out.print("2.Вывести все книги одного автора из каждой библиотеки\n");
            System.out.print("3.Вывести всю информация по книге(название, автор, год написания)\n");
            System.out.print("4.Добавить книгу\n");
            System.out.print("5.Выход\n");
            int num = in.nextInt();
            switch (num) {
                case 1:
                    Iterator var1 = libraryList.iterator();

                    while (var1.hasNext()) {
                        Library library = (Library) var1.next();
                        library.displayInfo();
                    }
                    break;
                case 2:
                    System.out.print("Введите Фамилию и Имя автора\n");
                    Scanner st1 = new Scanner(System.in);
                    String authorName = st1.nextLine();
                    Iterator var2 = libraryList.iterator();

                    while (var2.hasNext()) {
                        Library library = (Library) var2.next();
                        library.displayAuthorInfo(authorName, authorFind);
                    }
                    if(authorFind==0)
                        System.out.print("Нет информации об этом авторе\n");
                    break;
                case 3:
                    System.out.print("Введите название книги\n");
                    Scanner st2 = new Scanner(System.in);
                    String bookName = st2.nextLine();
                    Iterator var3 = libraryList.iterator();

                    while (var3.hasNext()) {
                        Library library = (Library) var3.next();
                        library.displayBookInfo(bookName, bookFind);
                    }
                    if(bookFind==0)
                        System.out.print("Нет информации об этой книге\n");
                    break;
                case 4:
                    System.out.print("Добавить в 1 или 2 библиотеку?\n");
                    Scanner st3 = new Scanner(System.in);
                    int numberOfLibrary = in.nextInt();
                    System.out.print("Введите название книги, фамилию и имя автора, а также год написания книги\n");
                    Scanner st4 = new Scanner(System.in);
                    String bookNameForAdd = st4.nextLine();
                    String authorNameForAdd = st4.nextLine();
                    int yearForAdd = st4.nextInt();
                    switch (numberOfLibrary){
                        case 1:
                            libraryList.removeFirst();
                            bookListFirst.add(new Book(bookNameForAdd,authorNameForAdd, yearForAdd));
                            libraryList.addFirst(new Library("Гомельская", bookListFirst));
                            break;
                        case 2:
                            libraryList.removeLast();
                            bookListSecond.add(new Book(bookNameForAdd,authorNameForAdd, yearForAdd));
                            libraryList.add(new Library("Минская", bookListSecond));
                            break;
                        default:
                            System.out.println("Проверьте правильность данных");
                    }
                    break;
                case 5:
                    k++;
                    break;
                default:
                    System.out.println("Проверьте правильность данных");
            }
        }


    }
}

