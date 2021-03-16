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
public class Bai20 {
     //Hàm kiểu tra giá trị đầu vào
    public int check() {
        int number = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Nhập số kW điện: ");
                number = Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception e) {
            }
        }
        return number;
    }
    public static void main(String[] args) {
        Bai20 bt= new Bai20();
        int soDien;
        soDien=bt.check();
        if (soDien>350) {
            int tienDien=((100*500)+(150*800)+(100*1000)+(1500*(soDien-350)));
            System.out.println("Số tiền điện là: "+tienDien);
        }
        else{
            if (soDien>250) {
                int tienDien=((100*500)+(150*800)+(1000*(soDien-250)));
                System.out.println("Số tiền điện là: "+tienDien);
            }
            else{
                if (soDien>100) {
                    int tienDien=((100*500)+(800*(soDien-100)));
                    System.out.println("Số tiền điện là: "+tienDien);
                }
            }
        }
    }
    
}
