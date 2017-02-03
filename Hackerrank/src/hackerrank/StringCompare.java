/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
input 
welcometojava
3

output 

ava
wel
 */
package hackerrank;

import java.util.*;


/**
 *
 * @author smitahirve
 */
public class StringCompare {
    
     public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc =  new Scanner(System.in);
        String input = sc.next();
        int num = sc.nextInt();
        String[] arr = new String[input.length()-num+1];
        for(int i=0; i<input.length()-num+1; i++)
            {
            
            arr[i] = input.substring(i,i+num);
            
        }
        String small = arr[0];
        String big = arr[0];
        
          for(int j = 0; j < arr.length; j++)
              {
              if(big.compareTo(arr[j])<0)
                  {
                  big = arr[j];
              }
              if(small.compareTo(arr[j])>0)
                  {
                  small = arr[j];
              }
             
          }
        
        System.out.println(small);
        System.out.println(big);
    }
    
}
