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
public class bai_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bai 6:");
        System.out.println("Hãy nhập vào 3 so nguyen a b c: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int t;
        if( a < b ) 
            { t = a; a = b; b = t; }
        
        if( a < c ) 
            { t = a; a = c; c = t; }
        if( b < c ) 
            { t = b; b = c; c = t; }
        System.out.println("Tang dan:  "+ c +" "+b+" "+a);
    }
}
