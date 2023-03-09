public class Book {
    private String nameBook;
    private int yearPrint;

    private Author author;

    public Book (String nameBook,Author author,int yearPrint) {
        this.nameBook = nameBook;
        this.yearPrint = yearPrint;
        this.author = author;
    }
    public Author getAuthor(){
        return author;
    }
    public String getNameBook(){
        return this.nameBook;
    }
    public int getYearPrint(){
        return this.yearPrint;
    }
    public void setYearPrint (int yearPrint){
        this.yearPrint=yearPrint;
    }



}




