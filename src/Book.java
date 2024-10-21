public class Book {
    private final String nameBook;
    private int publicationDate;

    private final String author;



    public Book(String nameBook, int publicationDate, String author) {
        this.nameBook = nameBook;
        this.publicationDate = publicationDate;
        this.author = author;
    }
    public String getAuthor() {
        return this.author;

    }

    public String getNameBook() {
        return this.nameBook;

    }

    public int getPublicationDate() {
        return this.publicationDate;
    }

    public void setPublicationDate(int publicationDate) {
        this.publicationDate = publicationDate;
    }
/*
    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }
*/

}
