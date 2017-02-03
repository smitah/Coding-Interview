/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
input 
madam

output 
Yes
 */
package hackerrank;
import java.io.*;
import java.util.*;

/**
 *
 * @author smitahirve
 */
public class Palindrome {
      public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        char[] input = A.toCharArray();
        char[] output = new char[input.length];
        for(int i = 0; i<input.length; i++)
        {
            output[output.length-1-i] = input[i];
           
            
        }
        String input1 = new String(input);
        String output1 = new String(output);
        System.out.println(input1.equals(output1)?"Yes":"No");
        
    }
    
}
