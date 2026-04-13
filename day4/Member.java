import java.time.LocalDate;
import java.util.Comparator;

public class Member implements Comparator {
    private int memberId;
    private String name;
    private String issuedBook;
    private LocalDate issuedDate;
    private LocalDate dueDate;

    public Member() {}

    public Member(int memberId, String name, String issuedBook,
                  LocalDate issuedDate, LocalDate dueDate) {
        this.memberId = memberId;
        this.name = name;
        this.issuedBook = issuedBook;
        this.issuedDate = issuedDate;
        this.dueDate = dueDate;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIssuedBook() {
        return issuedBook;
    }

    public void setIssuedBook(String issuedBook) {
        this.issuedBook = issuedBook;
    }

    public LocalDate getIssuedDate() {
        return issuedDate;
    }

    public void setIssuedDate(LocalDate issuedDate) {
        this.issuedDate = issuedDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        if (issuedDate != null && dueDate.isBefore(issuedDate)) {
            System.out.println("The Date should not be before the issued Date");
        }
        this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        return memberId + " " + name + " " + issuedBook + " " + issuedDate + " " + dueDate;
    }

    @Override
    public int compare(Object o1, Object o2) {
        Member m1=(Member)o1;
        Member m2=(Member)o2;
       
       return m1.getDueDate().compareTo(m2.getDueDate());

    }
  


    

    
 
}