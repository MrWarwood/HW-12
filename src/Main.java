public class Main {
    public static void main(String[] args) {
        System.out.println("hw 12");
        System.out.println();

        Book warAndPeace = new Book("Война и мир", "Толстой", 1869);
        System.out.println(warAndPeace.getBook());
        System.out.println(warAndPeace.getAuthor());
        System.out.println(warAndPeace.getAge());
        warAndPeace.setAge(2024);
        System.out.println("Замена года на " + warAndPeace.getAge());

        System.out.println();

        Book mumu = new Book("Муму", "Тургенев", 1852);
        System.out.println(mumu.getBook());
        System.out.println(mumu.getAuthor());
        System.out.println(mumu.getAge());
        mumu.setAge(2024);
        System.out.println("Замена года на " + mumu.getAge());

        System.out.println();

        Author tolstoy = new Author("Лев", "Толстой");
        System.out.print(tolstoy.getName());
        System.out.println(" " + tolstoy.getSurname());

        System.out.println();

        Author turgenev = new Author("Иван", "Тургенев");
        System.out.print(turgenev.getName());
        System.out.println(" " + turgenev.getSurname());
    }
}