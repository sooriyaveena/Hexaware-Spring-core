import java.util.HashMap;
import java.util.Scanner;

public class HashMAp {
    public static void main(String[] args) {

        HashMap<Integer, String> login = new HashMap<>();

        login.put(1, "1@us");
        login.put(2, "2@us");
        login.put(3, "3@us");
        login.put(4, "4@us");
        login.put(5, "5@us");

        Scanner s = new Scanner(System.in);

        int userid = s.nextInt();
        String pwd = s.next();

         
            if (login.get(userid).equals(pwd)) {
                System.out.println("Vaild");
            } else {
                System.out.println("Invalid Password");
            }

    }
    
}