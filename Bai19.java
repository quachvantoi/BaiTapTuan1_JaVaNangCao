/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.baiTapJaVaNangCao.Tuan1;

import java.util.Scanner;

/**
 *
 * @author PhongVu
 */
public class Bai19 {
    public static void main(String[] args) {
        int g1,p1,s1,g2,p2,s2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Giờ 1:");
        System.out.print("Nhập số giờ: ");
        g1=sc.nextInt();
        System.out.print("Nhập số phút: ");
        p1=sc.nextInt();
        System.out.print("Nhập số giây: ");
        s1=sc.nextInt();
        System.out.println("-----------------");
        System.out.println("Giờ 2:");
        System.out.print("Nhập số giờ: ");
        g2=sc.nextInt();
        System.out.print("Nhập số phút: ");
        p2=sc.nextInt();
        System.out.print("Nhập số giây: ");
        s2=sc.nextInt();
        int hieu=(3600*(g2-g1))+(60*(p2-p1))+(s2-s1);
        int g_kq,p_kq,s_kq;
        g_kq=hieu/(3600);
        p_kq=(hieu%3600)/60;
        s_kq=(hieu%3600)%60;
        System.out.println("Hiệu hai giờ là: "+g_kq+" giờ "+p_kq+" phút "+s_kq+" giây");
        
    }
}
