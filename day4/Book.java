class Book {
    private int bookId;
    private String title;
    private String author;
    private boolean isIssued;

    public Book(){}

    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isIssued = false; 
    }

   
    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isIssued() {
        return isIssued;
    }

   
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIssued(boolean issued) {
        this.isIssued = issued;
    }


    public void display() {
            System.out.println("ID: " + bookId );
            System.out.println( " Title: " + title);
            System.out.println("Author: " + author );
            System.out.println(" Status: " + (isIssued ? "Issued" : "Available"));
    }
}