public class Main {
    public static void main(String[] args) {
        separator();
        Author rowling = new Author("Joanne", "Rowling");
        Book harryPotter = new Book("Harry Potter and the Philosopher's Stone", 1998, rowling.getNameAuthor() + " " + rowling.getSurnameAuthor());
        harryPotter.setPublicationDate(1997);

        System.out.println("Title of the Book: " + harryPotter.getNameBook());
        System.out.println("Date of publication of the Book: " + harryPotter.getPublicationDate());
        System.out.println("Author: " + harryPotter.getAuthor());

        separator();
        Author tolkien = new Author("John", "Tolkien");
        Book lordOfTheRing = new Book("The Lord of the Rings. ", 1954, tolkien.getNameAuthor() + " " + tolkien.getSurnameAuthor());

        System.out.println(lordOfTheRing.getNameBook() + lordOfTheRing.getPublicationDate() + ". " + lordOfTheRing.getAuthor());


    }

    public static void separator() {
        System.out.println("=================================================================");
    }

}