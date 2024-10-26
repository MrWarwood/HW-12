import java.util.Objects;

public class Book {
    private String book;
    private Author author;
    private int publicationYear;

    public Book(String book, Author author, int publicationYear) {
        this.book = book;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getBook() {
        return this.book;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getAge() {
        return this.publicationYear;
    }

    public void setAge(int age) {
        this.publicationYear = age;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book1 = (Book) o;
        return publicationYear == book1.publicationYear && Objects.equals(book, book1.book) && Objects.equals(author, book1.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(book, author, publicationYear);
    }
}
