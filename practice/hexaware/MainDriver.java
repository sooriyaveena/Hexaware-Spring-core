public class MainDriver {
    public static void main(String[] args) {
        Phone artel=(rate)->System.out.println("the message Rate is "+rate);
        Phone idea=(rate)->System.out.println("the message Rate is "+rate);
        Phone jio=(rate)->System.out.println("the message Rate is "+rate);
        

        artel.calling(500);
        artel.message();

        idea.calling(50);
        idea.message();

        jio.calling(5000);
        jio.message();


        Balance<Integer> b1=new Balance();
        b1.setBalance(23000);
        System.out.println(b1.getBalance());
        Balance<Long> b2=new Balance();
        b2.setBalance(2309876L);
        System.out.println(b2.getBalance());









    }
    
}
