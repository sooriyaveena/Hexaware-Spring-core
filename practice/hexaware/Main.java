import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
public class Main {
    public static void main(String[] args) {

        List<Book> books = Arrays.asList(
            new Book(1, "Java Basics", "James", 500, "Programming"),
            new Book(2, "Spring Boot", "Rod", 800, "Programming"),
            new Book(3, "Python Guide", "Guido", 600, "Programming"),
            new Book(4, "History India", "Ram", 300, "History"),
            new Book(5, "Maths 101", "Shyam", 200, "Education"),
            new Book(6, "Data Structures", "Mark", 700, "Programming"),
            new Book(7, "English Grammar", "John", 250, "Education"),
            new Book(8, "AI Basics", "Andrew", 900, "Technology"),
            new Book(9, "Machine Learning", "Andrew", 1200, "Technology"),
            new Book(10, "World War", "Alex", 400, "History")
        );

 
      
        books.stream()
             .map(Book::getTitle)
             .forEach(System.out::println);

       
        
        books.stream()
             .filter(b -> b.getPrice() > 500)
             .forEach(System.out::println);

       
        System.out.println( books.size());
       
        
        
        books.stream()
             .max(Comparator.comparing(Book::getPrice))
             .ifPresent(System.out::println);

             

        books.stream()
             .min(Comparator.comparing(Book::getPrice))
             .ifPresent(System.out::println);


        books.stream()
             .sorted(Comparator.comparing(Book::getPrice))
             .forEach(System.out::println);

        books.stream().sorted(Comparator.comparing(Book::getTitle))
        .forEach(System.out::println);
System.out.println("title by programming");
       

        books.stream()
     .filter(i -> i.getCategory().equals("Programming"))
     .forEach(System.out::println);

     System.out.println(books.stream().collect(Collectors.groupingBy(i->i.getCategory())));

         System.out.println(books.stream().collect(Collectors.groupingBy(i->i.getCategory(),Collectors.counting())));

     books.stream().filter(i->i.getAuthor().equals("Andrew")).forEach(System.out::println);

     

     

  }

}