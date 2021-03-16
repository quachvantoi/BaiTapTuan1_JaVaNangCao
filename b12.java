/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap;

import java.util.Scanner;

/**
 *
 * @author manhd
 */
public class b12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1, b1, c1, a2, b2, c2;
        float  dx, dy, d,x,y;
        System.out.println("Nhập a1,b1,c1: ");
        a1 = sc.nextInt();
        b1 = sc.nextInt();
        c1 = sc.nextInt();
        System.out.println("Nhập a2,b2,c2: ");
        a2 = sc.nextInt();
        b2 = sc.nextInt();
        c2 = sc.nextInt();
        d= (a1*b2 - a2*b1);
        dx=(c1*b2-c2*b1);
        dy=(a1*c2-a2*c1);
        if (d==0){
            if(dx+dy==0)
                System.out.println("vô số nghiệm");
            else 
                System.out.println("vô nghiệm");
        }
        else{
        x = dy / d;
        y =dx / d;
            System.out.println("pt có 2 nghiệm x= "+x +"y="+y );}
        }

}
