
/*
Assignment – Write an example, which shows the usage of
java.util.HashSet.iterator().
 */

import java.util.HashSet;
import java.util.Iterator;


public class Session_8_Assignment_2 {
public static void main(String args[]) {
   // create hash set
   HashSet <String> set = new HashSet <String>();
                  
   // populate hash set
   set.add("1"); 
   set.add("2");
   set.add("3");  
      
   // create an iterator
   Iterator iterator = set.iterator(); 
      
   // check values
   while (iterator.hasNext()){
       
          System.out.println("Value: "+iterator.next() + " ");  
   }
   }    
}
/*
Output :
Value: 1 
Value: 2 
Value: 3 
*/