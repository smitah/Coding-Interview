/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/**
 *
 * sample input 
 * 2 
   4 
   1 2 3 4
   6
   2 -1 2 3 4 -5
   * sample output
   * 10 10
     10 11
 * 
 * @author smitahirve
 */
public class maxarray {
 
    
public static void main(String[] args) {
        Scanner scan  =  new Scanner(System.in);
        int total  =  scan.nextInt();
        while(total>0)
            {
              scan.nextLine();
            int l = scan.nextInt();
            int[] array1 = new int[l+1];
            scan.nextLine();
            
            for(int i = 0 ; i<l; i++)
            {
            
            array1[i] = scan.nextInt();
        }
            max_array(array1);
            total--;
        }
       
       
        
        
    }
  public static void max_array(int[] arr)
            {
          int sum1 = 0;
            int s = arr.length;
            for(int i = 0; i<s; i++)
                {
               
                if(arr[i]>0)
                    {
                    
                    sum1 = sum1 + arr[i];
                }
                
            }
           int max_ending_here = 0;
            int max_so_far  = 0;
            for(int i = 0; i<s-1; i++)
                {
                
                max_ending_here  = Math.max(0, max_ending_here + arr[i]);
                max_so_far = Math.max(max_so_far, max_ending_here);
                
            }
           
            System.out.print(sum1);
            System.out.print("  ");
            System.out.print(max_so_far);
            System.out.println(" ");
        }
        
    


            
}

