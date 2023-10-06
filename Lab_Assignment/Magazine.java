package Lab_Assignment;

public class Magazine extends LibraryItem {
    private int issueNumber;
    
    public Magazine(int issueNumber){
        setIssueNumber(issueNumber);
        
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }
    public Magazine(String title,String author ,int year ,int issueNumber){
        setAuthor(author);
        setIssueNumber(issueNumber);
        setTitle(title);
        setYear(year);
    }
}
