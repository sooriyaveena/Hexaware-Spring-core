import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;

public class WrapperClassPractice{ 
public static void main(String[] args) {
		
		
		
	  int a=10;
	  
	  Integer a1= Integer.valueOf(a);   
	  
	  System.out.println(a);
	  System.out.println(a1);
 
	  
	  
    int num =a1.intValue();   
    
    System.out.println(num);

   

        ArrayList<Integer> marks = new ArrayList<>();

        marks.add(85);  
        marks.add(90);
        marks.add(75);

        for (Integer m : marks) {
            System.out.println(m);
        }
        int sum=0;
        for (Integer m : marks) {
            sum += m;  // unboxing happens here
        }

        Calendar cal=Calendar.getInstance();
       System.out.println(cal.get(cal.YEAR));

       LocalDate d1= LocalDate.now();
       System.out.println(d1);


	 System.out.println(d1.getYear());        
 System.out.println(d1.getMonth());       
 System.out.println(d1.getMonthValue());  
 System.out.println(d1.getDayOfMonth());  
 System.out.println(d1.getDayOfWeek());
	} 
}
