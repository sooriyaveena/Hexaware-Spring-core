

public class StringPractice {
    
 
	public static void main(String[] args) {
		
		/* 
      StringTokenizer st = new StringTokenizer("we,will,play,sports");
      
      while(st.hasMoreElements())
      {
    	  System.out.println(st.nextToken());
      }
      */
      String str="wee#will#plaay#sports";
		String list[]= str.split("#");
		
		for(String s : list)
		{
            
			System.out.println(s+" "+s.length());

            int count=0;
            for(char c:s.toLowerCase().toCharArray()){
                if(c=='a' ||c=='e'||c=='i'||c=='o'||c=='u'){
                    count++;
                   
                }
                
            }
             System.out.println(s+" "+count);
 
		
	}
	
	
    }	
}
 