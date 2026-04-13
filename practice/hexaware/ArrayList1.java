
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayList1 {
    public static void main(String[] args) {
        double[] arr={123,90,345.98,2345.98,-47865.90,-45.09,-9765.90};

        List<Double> list1=new ArrayList<>();

        List<Double> list2=new ArrayList<>();

        for(double i:arr){
            if(i<0){
                list1.add(i);
            }
            else
                list2.add(i);
        }
        
        System.out.println(list1);
        System.out.println(list2);

        int[] arr2={1,2,3,2,4,5,5,6};

        List<Integer> list3=new ArrayList<>();

       
        List<Integer> duplicate=new ArrayList<>();
        for(int i:arr2){
            if(list3.contains(i)){
                System.out.println(i);
                
            }
            list3.add(i);
        }

     

   


   

    Set<Integer> set = new HashSet<>();
        Set<Integer> dup = new HashSet<>();

        for (int num : arr2) {
            if (!set.add(num)) {
                dup.add(num);
            }
        }

        System.out.println(dup);

        
        
		
	}
 
}
        

        
            
        
        
        
    

