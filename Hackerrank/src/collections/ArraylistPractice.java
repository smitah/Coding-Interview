/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;
import java.util.*;
/**
 *
 * @author smitahirve
 */
public class ArraylistPractice {
    
    public static void main(String[] args)
    {
        ArrayList<String> arrlist = new ArrayList<String>();
        arrlist.add("Smita");
        arrlist.add("");
        arrlist.add("Hirve");
          arrlist.add("Chirag");
        arrlist.add("Shrivastava");
        arrlist.add("Kappor");
         System.out.println(arrlist);
       
        Collections.sort(arrlist);
         System.out.println(arrlist);
       
      // List list = Collections.synchronizedList(arrlist)
                
    }
    
}
