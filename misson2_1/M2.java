package misson2_1;

public class M2 {

    public static void main(String[] args) {
        Book[] booksA = {
            new Book("태백산맥", "조정래"),
            new Book("이기적 유전자", "리처드 도킨즈"),
            new Book("자전거 도둑", "박완서"),
            new Book("토지", "박경리"),
            new Book("대변동", "제레드 다이아몬드")
        };

        Library A = new Library(booksA);
        Library A_1 = A;

        Book[] booksB = new Book[booksA.length + 1];
        for (int i = 0; i < booksA.length; i++) {
            booksB[i] = new Book(booksA[i]);
        }

        Library B = new Library(booksB);

        booksA[2].modify("그 많던 싱아는 누가 다 먹었을까", "박완서");
        booksB[5] = new Book("사피엔스", "유발 하라리");

        A.print("A");
        A_1.print("A_1");
        B.print("B");


    }

}

class Book {

    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    Book(Book b) {
        this.title = b.title;
        this.author = b.author;
    }

    public void modify(String title, String author) {
        this.title = title;
        this.author = author;
    }

}

class Library {

    Book[] books;

    Library(Book[] books) {
        this.books = books;
    }

    public void print(String name) {

        System.out.println(name + " 도서관");
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                System.out.println(books[i].title + "/" + books[i].author);
            }
        }
        System.out.println();
    }
}

