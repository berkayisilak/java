package Collection.BookSorter;

public class Book implements Comparable<Book>{
    private String bookName;
    private String authorName;
    private int pageNumber;
    private String publishDate;

    public Book(String bookName, String authorName, int pageNumber, String publishDate) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.pageNumber = pageNumber;
        this.publishDate = publishDate;
    }

    public String getBookName() {
        return this.bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    @Override
    public int compareTo(Book o) {
        return this.bookName.toUpperCase().compareTo(o.getBookName());
    }
}
