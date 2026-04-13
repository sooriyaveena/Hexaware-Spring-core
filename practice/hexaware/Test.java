
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Test {
    public static void main(String[] args) {
 /* 
        String[] fruits = {
            "Apple", "Banana", "Mango", "Apple", "Orange",
            "Banana", "Grapes", "Mango", "Apple", "Pineapple",
            "Orange", "Banana", "Apple", "Mango", "Grapes",
            "Banana", "Apple", "Orange", "Mango", "Banana"
        };
 
        
        HashMap<String,Integer>  hm=new HashMap<>();

        for (String i: fruits) {
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }
        System.out.println(hm);

  


        Stack<Integer> st = new Stack<>();
        String str = "23+";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {
                st.push(ch - '0'); 
            } else {
                int b = st.pop();
                int a = st.pop();

                switch (ch) {
                    case '+':
                         st.push(a + b); break;
                    case '-': 
                    st.push(a - b); break;
                    case '*': 
                    st.push(a * b); break;
                    case '/': 
                    st.push(a / b); break;
                }
            }
        }

        System.out.println(st.pop());

        Queue<Integer> q=new LinkedList<>();

        int [] a={1,2,3,4,5};
            
         q.add(a[a.length - 1]);
         for (int i = 0; i < a.length - 1; i++) {
             q.add(a[i]);
         }
         while(q.size()>0) {
             System.out.print(q.poll());
         }
             */
            PriorityQueue<Integer > pq= new PriorityQueue<>();
   int[] a2={1,2,4,6,3,7};
   int k=5;
   for(int i=0;i<a2.length;i++){
    pq.add(a2[i]);
}

    while(pq.size()>k)
        pq.poll();

   


 
 System.out.println(pq.peek());
 
   
   
 
   
   
      // show n min number
   
     //
   
   
   
   
   //int a[]= {5,7,8,2,4,5,6,7,12,5}
   //k=3
   
   // k-1


   List balance=new ArrayList();

balance.add(23000);

balance.add(56895.86);

double b2=(double)balance.get(1);

System.out.println(b2);
    }
}        

        
        
    

