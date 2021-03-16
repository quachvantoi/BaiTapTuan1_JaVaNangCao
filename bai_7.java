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
public class bai_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bai 7:");
        System.out.println("Hãy nhập vào a va b: ");
        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        if (a == 0)
            if(b == 0)
                System.out.println("Phuong trinh vo so nghiem");
            else
                System.out.println("Phuong trinh vo nghiem");
        else
            System.out.println("X = "+ -b/a);
    }
}
