/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.btjava.java2;

import java.util.Scanner;
import jdk.nashorn.internal.runtime.JSType;

/**
 *
 * @author Admin
 */
public class BT_1_5 {
    public static double area(double xa,double ya,double xb,double yb,double xc,double yc){
        return 0.5 * Math.abs(xa*yb -xb*ya + xb*yc -xc*yb + xc*ya -xa*yc);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bai 1:");
        final float PI = 3.14f;
        System.out.println("Hãy nhập vào Dien tich Hình tròn: ");
        float S = scanner.nextFloat();
        double tt = 4*PI*Math.pow(Math.sqrt(S/(4*PI)), 3)/3;
        System.out.println("Chu vi Hình tròn: " + tt);
        
        
        //------------------------------------------------------------------------//
        
        
        System.out.println("\n\n Bai 2:");
        System.out.println("Hãy nhập vào toa do diem A xA yA: ");
        float xa = scanner.nextFloat();
        float ya = scanner.nextFloat();
        System.out.println("Hãy nhập vào toa do diem B xB yB: ");
        float xb = scanner.nextFloat();
        float yb = scanner.nextFloat();
        double khoangcach = Math.sqrt(Math.pow(xb - xa, 2) + Math.pow(yb - ya, 2));
        System.out.println("khoang cach 2 diem A("+xa+","+ya+") den diem B("+xb+","+yb+") la:"+ khoangcach);
          
        
        //------------------------------------------------------------------------//
        
        
        System.out.println("\n\n Bai 3:");
        System.out.println("Hãy nhập vào toa do diem C xC yC: ");
        float xc = scanner.nextFloat();
        float yc = scanner.nextFloat();
        System.out.println("Hay nhap ban kinh");
        float R = scanner.nextFloat();
        System.out.println("Hãy nhập vào toa do diem M xM yM: ");
        float xm = scanner.nextFloat();
        float ym = scanner.nextFloat();
        double d = R - Math.sqrt(Math.pow(xm - xc, 2) + Math.pow(ym - yc, 2));
        if (d < 0) {
            System.out.println("M nam ngoai hinh tron C");
        }else{
            System.out.println("M nam trong hinh tron C");
        }
         
        
        //------------------------------------------------------------------------//
        
        
        System.out.println("\n\n Bai 4:");
        System.out.println("Hãy nhập vào 3 canh tam giac: ");
            float a = scanner.nextFloat();
            float b = scanner.nextFloat();
            float c = scanner.nextFloat();
        while(JSType.isNumber(a) == false || JSType.isNumber(b) == false || JSType.isNumber(c) == false)
            {
                System.out.println("phai nhap so \nHãy nhập vào 3 canh tam giac: ");
                a = scanner.nextFloat();
                b = scanner.nextFloat();
                c = scanner.nextFloat();
            }
        int f = 0;
        if(a==b && b==c && a==c)
            f+=1;
        if(a==b || b==c || a==c)
            f+=1;
        if(c==Math.sqrt(a*a + b*b) || a==Math.sqrt(b*b + c*c) || b==Math.sqrt(a*a + c*c))
            f+=3;
        switch(f){
            case 0: System.out.println("Tam giac thuong");break;
            case 1: System.out.println("Tam giac can");break;
            case 2: System.out.println("Tam giac deu");break;
            case 3: System.out.println("Tam giac vuong");break;
            case 4: System.out.println("Tam giac vuong can");
        }
        double p = (a + b +c) / 2;
        double dientich = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println("dien tich tam giac:"+ dientich);
         
        
        //------------------------------------------------------------------------//
        
        
        System.out.println("\n\n Bai 5:");
        double xA = 0 ,yA = 5 ,xB=3 ,yB=0 ,xC=4 ,yC=7 ,xM=2 ,yM=6 ;
        double D = area( xM, yM, xA, yA, xB, yB ) + area( xM, yM, xA, yA, xC, yC )+ area( xM, yM, xB, yB, xC, yC ) - area( xA, yA, xB, yB, xC, yC );
        if(D > 0)
            System.out.println("M nam ngoai tam giac ABC");
        else if (area( xM, yM, xA, yA, xB, yB ) == 0||area( xM, yM, xA, yA, xC, yC ) == 0||area( xM, yM, xB, yB, xC, yC ) == 0) {
            System.out.println("M nam tren canh tam giac ABC");
        }else
            System.out.println("M nam trong tam giac ABC");
        
        
        
    }
    
}

