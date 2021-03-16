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
public class Bai18 {
    //Hàm kiểu tra giá trị đầu vào
    public int check() {
        int number = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("input number: ");
                number = Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception e) {
            }
        }
        return number;
    }
    public static void main(String[] args) {
        Bai18 bt= new Bai18();
        int soGioNhap=bt.check();
        int soTuan=soGioNhap/168;
        int soNgay=(soGioNhap % 168)/24;
        int soGio=((soGioNhap % 168)%24);
        System.out.println(soGioNhap+" giờ có giá trị tương ứng là: "+soTuan+" tuần, "+soNgay+" ngày, "+soGio+" giờ");
    }
}
