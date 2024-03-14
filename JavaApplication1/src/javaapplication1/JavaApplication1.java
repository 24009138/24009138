/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author user
 */
import java.util.Scanner;
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner thakhani=new Scanner(System.in);
        System.out.println("Enter the first number");
        int Num1=thakhani.nextInt();
        
        System.out.println("Enter the second number");
        int Num2=thakhani.nextInt();
        
        int answer=Num1-Num2;
        
      System.out.println("The total is "+answer);   
    }
    
}
