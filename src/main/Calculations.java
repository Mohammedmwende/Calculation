/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import operations.Calculator;
import java.util.Scanner;
import operations.*;
/**
 *
 * @author user
 */
public class Calculations {
    
    public static void main(String[] args){
        
        Scanner scanner = new Scanner (System.in);
        int f,s;
        System.out.println("Input f number");
        f=scanner.nextInt();
        System.out.println("Enter s number");
        s=scanner.nextInt();
        
        
        Arithmetic arithmetic = new Arithmetic(f,s);
        Calculator calculator = new Calculator();
        int result = calculator.difference();
    }
    
}
