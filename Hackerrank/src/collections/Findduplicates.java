/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
To find duplicate characters in a string
 */
package collections;
import java.util.*;
/**
 *
 * @author smitahirve
 */
public class Findduplicates {
    
    public static void finddup(String s)
    {
        char[] inputarr = s.toCharArray();
        HashMap<Character,Integer> hmap = new HashMap<Character,Integer>();
        for(char c:inputarr)
        {
            if(hmap.containsKey(c))
            {
                hmap.put(c,hmap.get(c)+1);
            }
            else
            {
                hmap.put(c,1);
            }
        }
        
        
                
        Set<Character> keys = hmap.keySet();
        for(char c:keys)
        {
            if(hmap.get(c)>1)
            {
                System.out.println("Char " + c + " : " + hmap.get(c));
            }
        }
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        finddup(input);
             
    }
    
}
