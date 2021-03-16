/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.btjava.java2;

/**
 *
 * @author Admin
 */
public class bai21_25 {
    public static void main(String[] args) {
        
        System.out.println("\n\n Bai 21:");
        double diemchuan = 15.5,d1 = 4.5, d2 = 3.4, d3 =3.6;
        int doituong = 1;
        String khuvuc = "B";
        if(d1 * d2 * d3 > 0){
            double d = d1 + d2 + d3;
            switch (khuvuc){
                case "A": d += 2; break;
                case "B": d += 1; break;
                case "C": d += 0.5;
            }
            switch (doituong){
                case 1: d += 2.5; break;
                case 2: d += 1.5; break;
                case 3: d += 1;
            }
            if(d > diemchuan)
                System.out.println("Dau voi "+d+" diem");
            else
                System.out.println("Rot voi "+d+" diem");
        }
        else
            System.out.println("rot vi co mon 0 diem");
        
        
        //------------------------------------------------------------------------//
        
        
        System.out.println("\n\n Bai 22:");
        int n = 1966;
        int i ,count, sum;
        System.out.println("Cac uoc so:");
        for( count = sum = 0, i = 1; i <=n; ++i )
            if( n % i == 0) 
            {
                System.out.println(i);
                count++;
                sum += i;
            }
        System.out.println("co "+count+" uoc so, tong la: "+sum);
        
        
        //------------------------------------------------------------------------//
        
        
        System.out.println("\n\n Bai 23:");
        n = 10000;
        int j;
        System.out.println("Cac so hoan hao nho hon "+n);
        for( i = 1; i < n; ++i ) {
            for( sum = 0, j = 1; sum <= i && j < i; ++j )
                if( i % j == 0) 
                    sum += j;
            if( sum == i ) 
                System.out.println(i);
        }
        

        //------------------------------------------------------------------------//
        
        
        System.out.println("\n\n Bai 24:");
        n = 43210;
        sum = 0;
        count = 0;
        int u, t = n;
        do {            
            u = t % 10;
            count++;
            sum += u;
            t = t/10;
        } while (t > 0 );
        System.out.println(n+" co "+count+" chu so");
        System.out.println("Chu so cuoi cung la: "+ n % 10);
        System.out.println("Chu so dau tien la: "+ u);
        System.out.println("Tong cac chu so la: "+ sum);
        System.out.print("So dao nguoc la: ");
        while( n % 10 == 0) 
            n /= 10;
        do{
            System.out.print(n%10);
            n = n/10;
        } 
        while( n > 0) ;
        System.out.println("");
        
        //------------------------------------------------------------------------//
        
        System.out.println("\n\n Bai 25:");
        int so1= 12, so2= 8,gcd, lcm;
        gcd = so1;
        while( so1% gcd != 0 || so2% gcd != 0) 
            gcd--;
        System.out.println("USCLN (a, b):"+gcd);
        lcm = so1;
        while( lcm % so1!= 0|| lcm % so2!= 0) 
            lcm++;
        System.out.println("BSCNN (a, b):"+ lcm);
    
    }
}
