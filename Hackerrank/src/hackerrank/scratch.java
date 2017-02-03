/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.*;
import java.text.SimpleDateFormat;

import java.io.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author smitahirve
 */


public class scratch {
    public  static boolean isValid(String s)
    {
            String p = "\\d{3}-\\d{3}-\\d{4}";
    
        return s.matches(p);
    }
    
    public static void main(String[] args)
    {
        System.out.println(isValid("123-456-1232"));
        System.out.println(isValid("(rgf-234-3534"));
    
}
    
}
