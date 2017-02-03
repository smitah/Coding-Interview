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
 * @author smitahirve
 * left and right rotation of array
 * sample input 
 5 4
 1 2 3 4 5
* sample output
5 1 2 3 4 (left rotation)
 */
public class arrayrotation {
    public static int[] arrayLeftRotation(int[] a, int n, int k) {
        int[] outputarray = new int[n];
        k = a.length - k;          //comment this line to perform right rotation
        int temp = 0; 
        for(int i = 0; i<a.length;i++)
            {
            temp = i + k;
            if(temp>=a.length)
                {
                temp = temp - a.length;
                outputarray[temp] = a[i];
            }
            else
                {
                outputarray[temp] = a[i];
            }
          
        }
     return outputarray;
      
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
      
        int[] output = new int[n];
        output = arrayLeftRotation(a, n, k);
        for(int i = 0; i < n; i++)
            System.out.print(output[i] + " ");
      
        System.out.println();
      
    }
}
