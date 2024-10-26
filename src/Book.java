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
}
