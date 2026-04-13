public class Student {


    int sid;
    String name;
    int marks;

    public Student(int sid,String name,int marks) {
        this.sid=sid;
        this.name=name;
        this.marks=marks;
    }

     @Override
    public String toString() {
        return sid + " " + name + " " + marks;
    }



    

}
