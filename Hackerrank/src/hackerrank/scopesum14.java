/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
input 
3
1 2 5
output 
4
 */
package hackerrank;

/**
 *
 * @author smitahirve
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;
         
    Difference(int[] a)
        {
        elements = new int[a.length];
        int len = a.length;
        for(int j = 0 ; j<len; j++)
            {
            elements[j] = a[j];
        }
    }

          

public int computeDifference()
    {
   
    int curr = 0;
   for(int i =0; i<elements.length;i++)
       {
       for(int j = 1; j<elements.length;j++)
           {
       
       curr = Math.abs(elements[i] - elements[j]);
       if(curr>maximumDifference)
           {
           maximumDifference = curr;
       }
          
           
   }
   }
    return maximumDifference;
}
}

public class scopesum14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
    
}
