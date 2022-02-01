/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primenumber;

import java.util.Scanner;

/**
 *
 * @author Black Widow
 */
public class PrimeNumber {

    /**
     * @param args the command line arguments
     */
  public static void  primenum()
    {
        int n;
        Scanner in = new Scanner (System.in);
        System.out.println("Give number to check ");
        n=in.nextInt();
       int i,count=0;
       for(i=2;i<n;i++)
       {
          if(n%i==0)
          {
             count++;
             break;
          }
          
       }
       if(count==0)
       {
           System.out.println("Prime ");
       }
       else
       {
           System.out.println("Not Prime ");
       }
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        primenum();
    }
    
}
