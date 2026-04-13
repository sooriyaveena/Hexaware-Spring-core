import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);

        Member m1 = new Member(1, "javin", "Java", LocalDate.of(2025, 3, 20), LocalDate.of(2025, 7, 30));
        Member m2 = new Member(2, "vinay", "Python", LocalDate.of(2025, 7, 18), LocalDate.of(2025, 12, 28));
        Member m3 = new Member(3, "magran", "DSA", LocalDate.of(2026, 4, 22), LocalDate.of(2026, 4, 1));

        List<Member> list=new ArrayList<>();

        List<Book> list2=new ArrayList<>();
        System.out.println("What ou want to Perfrom");
        int choice;
       
        do { 
            System.out.println("\n1.Create Member");
            System.out.println("2.Issue Book");
            System.out.println("3.Return Book");
            System.out.println("4.Add Book");
            System.out.println("5.Show All Books");
            System.out.println("6.Update Book");
            System.out.println("7.Remove Book");
            System.out.println("8.Remove Member");
            System.out.println("9.Exit");

            choice = s.nextInt();

            switch (choice) {
                case 1:
                    Member m4 = new Member(4, "Karthick", "Atomic Habits", LocalDate.of(2026, 4, 22), LocalDate.of(2026, 6, 1));
                    break;
                    
                case 2:
    System.out.print("Enter Member ID: ");
    int memberId = s.nextInt();

    System.out.print("Enter Book ID: ");
    int bookId = s.nextInt();

    Member foundMember = null;
    Book foundBook = null;

    for (Member m : list) {
        if (m.getMemberId() == memberId) {
            foundMember = m;
            break;
        }
    }

    for (Book b : list2) {
        if (b.getBookId() == bookId) {
            foundBook = b;
            break;
        }
    }

    if (foundMember == null) {
        System.out.println("Member not found");
    }
    else if (foundBook == null) {
        System.out.println("Book not found");
    }
    else if (foundBook.isIssued()) {
        System.out.println("Book already issued");
    }
    else if (foundMember.getIssuedBook() != null) {
        System.out.println("Member has the  book already");
    }
    else {
        foundMember.setIssuedBook(foundBook.getTitle());
        foundMember.setIssuedDate(LocalDate.now());
        foundMember.setDueDate(LocalDate.now().plusDays(7));

        foundBook.setIssued(true);

        System.out.println("book issued successfully");
    }
    break;

    case 3:
    System.out.print("Enter Member ID: ");
    int memId = s.nextInt();

    Member mem = null;

  
    for (Member m : list) {
        if (m.getMemberId() == memId) {
            mem = m;
            break;
        }
    }

    if (mem == null) {
        System.out.println("Member not found");
    }
    else if (mem.getIssuedBook() == null) {
        System.out.println("No book to return");
    }
    else {

        
        Book bookToReturn = null;

        for (Book b1 : list2) {
            if (b1.getTitle().equals(mem.getIssuedBook())) {
                bookToReturn = b1;
                break;
            }
        }

      
        LocalDate today = LocalDate.now();
        LocalDate due = mem.getDueDate();

        long lateDays = java.time.temporal.ChronoUnit.DAYS.between(due, today);

        if (lateDays > 0) {
            long fine = lateDays * 10;
            System.out.println("Late by " + lateDays + " days");
            System.out.println("Fine: ₹" + fine);
        } else {
            System.out.println("Returned on time. No fine.");
        }

        
        mem.setIssuedBook(null);
        mem.setIssuedDate(null);
        mem.setDueDate(null);

        
        if (bookToReturn != null) {
            bookToReturn.setIssued(false);
        }

        System.out.println("Book returned successfully");
    }
    break;
                case 4 :
                    Book b=new Book(123,"java","Bala");
                    b.setIssued(true);
                    break;
                case 5:
                         if (list2.isEmpty()) {
        System.out.println("No books available");
    } else {
        for (Book b1 : list2) {
            b1.display();
        }
    }
    case 6:
        System.out.print("Enter Book ID to update: ");
    int updateId = s.nextInt();
    s.nextLine(); 

    Book bookToUpdate = null;

    for (Book b4 : list2) {
        if (b4.getBookId() == updateId) {
            bookToUpdate = b4;
            break;
        }
    }

    if (bookToUpdate == null) {
        System.out.println("Book not found");
    }
    else if (bookToUpdate.isIssued()) {
        System.out.println("Cannot update. Book is currently issued");
    }
    else {
        System.out.print("Enter new title: ");
        String newTitle = s.nextLine();

        System.out.print("Enter new author: ");
        String newAuthor = s.nextLine();

        bookToUpdate.setTitle(newTitle);
        bookToUpdate.setAuthor(newAuthor);

        System.out.println("Book updated successfully");
    }

        break;

                case 7:
    System.out.print("Enter Book ID to remove: ");
    int removeId = s.nextInt();

    Book bookToRemove = null;

    for (Book b5 : list2) {
        if (b5.getBookId() == removeId) {
            bookToRemove = b5;
            break;
        }
    }

    if (bookToRemove == null) {
        System.out.println("Book not found");
    }
    else if (bookToRemove.isIssued()) {
        System.out.println("Cannot remove. Book is currently issued");
    }
    else {
        list2.remove(bookToRemove);
        System.out.println("Book removed successfully");
    }
    break;
    case 8:
        
    System.out.print("Enter Member ID to remove: ");
    int removeMemberId = s.nextInt();

    Member memberToRemove = null;

    for (Member m : list) {
        if (m.getMemberId() == removeMemberId) {
            memberToRemove = m;
            break;
        }
    }

    if (memberToRemove == null) {
        System.out.println("Member not found");
    }
    else if (memberToRemove.getIssuedBook() != null) {
        System.out.println("Cannot remove. Member has an issued book");
    }
    else {
        list.remove(memberToRemove);
        System.out.println("Member removed successfully");
    }
    break;
    case 9:
        System.out.println("Exiting.");
        break;
               
    
    
                    }
            
        } while (choice!=9);

        list.add(m1);
        list.add(m2);
        list.add(m3);

        list.stream()
        .forEach(System.out::println);

        list.stream()
    .filter(m -> m.getDueDate().isBefore(LocalDate.now()))
    .forEach(System.out::println);
    
    list.stream()
    .filter(m->m.getName().equals('A'))
    .forEach(System.out::println);

    
}
}
