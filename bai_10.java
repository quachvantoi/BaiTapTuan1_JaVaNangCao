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
public class bai_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bai 10:");
        int sum,pos,t,sin = 193456787;
        
        while( true) 
        {
            System.out.println("SIN (0 de thoat): ");
            sin = scanner.nextInt();
            if( sin == 0 ) 
                break;
            sum = sin % 10;
            sin = sin / 10;
            for( pos = 0; pos < 8 & sin > 0; sin = sin / 10, ++pos )
            {
                t = sin % 10;
                if( pos % 2 != 0) 
                    sum += t;
                else
                    sum += ( 2* t ) / 10 + ( 2* t )% 10;
            }
            if( pos < 8 | sin > 0 | sum % 10 == 0)
                System.out.println("SIN hop le!");
            else
                System.out.println("SIN khong hop le!");
        }
            
            
    }
    
}
