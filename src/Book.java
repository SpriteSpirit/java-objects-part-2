public class Book {
    private final String nameBook;
    private int publicationDate;

    public Book(String nameBook, int publicationDate) {
        this.nameBook = nameBook;
        this.publicationDate = publicationDate;

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
