/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.btjava.java2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class bai_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bai 8:");
        System.out.println("Hãy nhập vào a, b va c: ");
        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        float c = scanner.nextFloat();
        if( a == 0)
            if( b == 0)
                if( c == 0)
                    System.out.println("Phuong trinh co vo so ngiem");
                else
                    System.out.println("Phuong trinh vo ngiem");
            else
                System.out.println("x = "+ -c/b );
        else
        {
            float d = b*b -4*a*c;
            if( d > 0)
                System.out.println( "x1 = "+ ( -b + Math.sqrt( d ) ) / ( 2 * a ) +" x2 =  "+( -b -Math.sqrt( d ) ) / ( 2 * a));
            else
                if( d == 0 ) 
                    System.out.println("x1 = x2 = "+ -b/( 2*a ));
                else
                    System.out.println("Vo nghiem");
        }
            
        
    }
    
}
