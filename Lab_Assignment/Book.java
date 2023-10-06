package Lab_Assignment;

public class Book extends LibraryItem{
    private int pageCount;
    
    
    
    
    public Book(int pageCount){
        setPageCount(pageCount);
    }




    public int getPageCount() {
        return pageCount;
    }




    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    } 

    public Book(String title,String author ,int year ,int pageCount){
        setAuthor(author);
        setPageCount(pageCount);
        setTitle(title);
        setYear(year);
    }
}
