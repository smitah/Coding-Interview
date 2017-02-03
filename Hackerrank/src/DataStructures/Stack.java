/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructures;

/**
 *
 * @author smitahirve
 */

public class Stack {
    
    public Node top =null;
    public void push(int d)
    {
        Node n = new Node(d);
           
        if(top==null)
        {
            top = n;
            
        }
        else
        {
           //Node n = new Node(d);
           n.next = top;
           top = n; 
        }
        
    }
    public int pop()
    {   
        
            Node n = top; 
            top = top.next;
            return n.data;
        
    }
    public int peek()
    {
        return top.data;
    }
    
    
        public static void main(String args[])
        {
            Stack s = new Stack();
            s.push(4);
            s.push(5);
            s.push(7);
            s.push(8);
            s.push(1);
            s.push(6);
            s.pop();
            s.pop();
            System.out.println(s.peek());
                
            
        }
    
    
}
