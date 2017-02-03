/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
input 
anagram
margana

output 
Anagrams
 */
package hackerrank;
import java.io.*;
import java.util.*;

/**
 *
 * @author smitahirve
 */
public class Anagrams {
     static boolean isAnagram(String a, String b) {
        
        // Complete the function by writing your code here.
        String a3 = a.toLowerCase();
        String b2= b.toLowerCase();
        char[] input = a3.toCharArray();
        char[] output = b2.toCharArray();
        Arrays.sort(input);
        Arrays.sort(output);
        String a1 = new String(input);
        String a2 = new String(output);
       
        if(a1.equalsIgnoreCase(a2))
           {
            
            return true;
        }
        else
            {
            return false;
        }
       // return false;
       
    }
    
     public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
