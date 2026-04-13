import java.util.*;

class Student implements Comparable {
    int marks;
    String name;

    Student(int marks, String name) {
        this.marks = marks;
        this.name = name;
    }
    /* 
    @Override
    public int compare(Object o1, Object o2) {
        Student s1=(Student)o1;
        Student s2=(Student)o2;
        if(s1.marks>s2.marks)
        return 1;
    else if (s1.marks<s2.marks)
        return -1;
    else return 0;

}
    */
   @Override
   public int compareTo(Object o) {
       Student s=(Student)o;
       if(this.marks>s.marks){
        return  1;
       }
       else if(this.marks<s.marks)
       return -1;
    else return 0;
   }

    
}

public class Main1 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        list.add(new Student(90, "A"));
        list.add(new Student(70, "B"));
        list.add(new Student(80, "C"));

        
        

        for (Student s : list) {
            System.out.println(s.marks + " " + s.name);
        }
    }
  
}