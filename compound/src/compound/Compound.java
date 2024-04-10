/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package compound;

import java.util.Scanner;
public class Compound {
    
public static void main(String[] args) {
Scanner thakhani=new Scanner(System.in);

double A,P,I,N;
System.out.println("Enter the principal amount:");

P=thakhani.nextDouble();

System.out.println("Enter the annual interest rate:");

I=thakhani.nextDouble();

System.out.println("Enter the period:");

N=thakhani.nextDouble();

  A=P*Math.pow(1+I,N);
  
  System.out.println("The final answer is " +A);



















    }
    
}
