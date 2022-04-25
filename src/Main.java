public class Main {
    public static void main(String[] args) {
        separator();
        Book titleBook = new Book("Harry Potter and the Philosopher's Stone", 1998);
        Author author = new Author("Joanne", "Rowling");

        titleBook.setPublicationDate(1997);

        System.out.println("Title of the Book: " + titleBook.getNameBook());
        System.out.println("Date of publication of the Book: " + titleBook.getPublicationDate());
        System.out.println("Author: " + author.getNameAuthor() + " " + author.getSurnameAuthor());

        separator();

        Book titleBook2 = new Book("Harry Potter and the Chamber of Secrets", 1998);
        Author author2 = new Author("Joanne K.", "Rowling");

        System.out.println(titleBook2.getNameBook() + ". " + titleBook2.getPublicationDate() + ". " + author2.getNameAuthor() + " " + author2.getSurnameAuthor());


    }

    public static void separator() {
        System.out.println("=================================================================");
    }

}