/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.windowmaster;

import java.util.Scanner;

/**
 *
 * @author ilyagotfryd
 */
public class WindowMaster {
    
    public static void main (String[] args)
    {
        System.out.println("Welcome to window master.");
        Scanner sc = new Scanner(System.in);
        double width = 0;
        double height = 0;
        String strWidth = "";
        String strHeight = "";
        
        double trimPrice = 3.50;
        double glassPrice = 2.50;
        double totalTrimPrice = 0;
        double totalGlassPrice = 0;
        
        System.out.println("Pease enter a width of a custom window:");
        strWidth = sc.nextLine();
        width = Double.parseDouble(strWidth);
        
        System.out.println("Please Enter a hight of a custom window:");
        strHeight = sc.nextLine();
        height = Double.parseDouble(strHeight);
        
        totalTrimPrice = 2*(width+height)*trimPrice;
        totalGlassPrice = width*height*glassPrice;
        double totalCost = totalTrimPrice+ totalGlassPrice;
        
        System.out.println("The trim price is: "+ totalTrimPrice);
        System.out.println("Total glass price: " + totalGlassPrice);
        System.out.println("Total window price: " + totalCost);
    }
    
}
