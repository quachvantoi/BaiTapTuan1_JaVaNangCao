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
public class bai_9 {
    public static void main(String[] args) {
        final float PI = 3.14159265358979f;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bai 9:");
        System.out.println("Nhap so do x cua goc (phut): ");
        double angle = scanner.nextDouble();
        angle /=60;
        System.out.println("x thuoc goc vuong thu "+ ( int)Math.ceil(( angle / 90)) % 4);
        System.out.println("cos(x) = "+ Math.cos( (angle * PI / 180)) );
       
    
    }
    
}
