public interface Phone {
    /* 
    Phone
 
    void calling(rate );
 
      default void MSG()
{
      sop(2 rs);
}
 
 
Airtel      calling  5 RS
 
 
voda phone   10 RS
 
 
jio   calling   12 RS
 
 */
void calling (int rate);
default void message(){
    System.out.println("the message costs 6 Rs ");
    
    } }