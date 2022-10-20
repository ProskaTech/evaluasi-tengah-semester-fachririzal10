/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

/**
 *
 * @author Fachri 
 */
public class uts1 {
    public static void main(String[]args)
    { 
       for(int i=1; i<=2; i++)
       {
           for(int k=1; k<=2-i; k++)
           {
               System.out.print(" ");
           } 
           for(int j=1; j<=2*i; j++)
           {
               System.out.print(j+1);
           } 
           for(int k=1; k<=2*(2-i+1)-1; k++)
           {
               System.out.print(" ");
           } 
           for(int j=1; j<=2*i; j++)
           {
               System.out.print(j+3);
           } 
           System.out.println();
       }
       

       for(int i=1; i<=5; i++)
       {
           for(int k=1; k<=i-1; k++)
           {
               System.out.print(" ");
           } 
           for(int j=1; j<=2*(5-i+1)-1; j++)
           {
               System.out.print(j);
           } 
           System.out.println();
  }


    
        
    
    
}
} 