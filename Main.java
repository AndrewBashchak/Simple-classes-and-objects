public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, 218, "Classic");
        Book b2 = new Book("The Hunger Games", "Suzanne Collins", 2008, 374, "Fantasy");
        Book b3 = new Book("The Testaments", "Margaret Atwood", 2019, 320, "Dystopian");

        Book[] library = {b1, b2, b3};

        for (Book b : library) {
            System.out.println(b.toString());
            System.out.println("Fantasy: " + b.isGenre("Fantasy"));
        }
    }
}
