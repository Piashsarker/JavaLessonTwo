/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalessontwo;

import java.util.Scanner;

/**
 *
 * @author Propc
 */
public class ExcerciseSolution {
    Scanner input = new Scanner(System.in); 
    
    public void computeAreaOfACircle(){
        System.out.println("Area Of A Circle");
       
        System.out.println("Enter Radius: ");
        double radius = input.nextDouble();
       
        double area = 3.1416*radius*radius; 
        System.out.println("Area Is : "+area);
    }
    public void computeAverage(){
        System.out.println("Compute Average: ");
        System.out.println("Enter Three Number:");
        double a = input.nextInt(); 
        double b = input.nextInt(); 
        double c = input.nextInt(); 
        
       double average = (a+b+c)/3; 
        System.out.println("Average Is : "+average);
        
    }
    
    public void displaySecondInMinute(){
        System.out.println("Display Second In Minute....");
        
        System.out.println("Enter Second : ");
        int second = input.nextInt(); 
        int minute = second/60; 
        int remainingSecond = second%60; 
        
        System.out.println(second+" Second Is "+minute+" Min and "+remainingSecond+" Second");
    }

    
}
