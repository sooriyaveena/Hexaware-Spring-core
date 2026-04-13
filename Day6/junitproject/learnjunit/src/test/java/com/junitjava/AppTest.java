package com.junitjava;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    @Test
      public void testAdd()
    {
    	App cal = new App();
    	int r=cal.getAdd(5, 5);
        assertEquals(10, r);

}
}
