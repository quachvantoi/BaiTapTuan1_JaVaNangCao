/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class bai23 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
            int n, i, j, sum; ;
            System.out.println("Nhap n: ");
            n = scanner.nextInt();
            System.out.println("Cac so hoan hao nho hon: " + n);
            for (i = 1; i < n; ++i)
            {
                sum = 0;
                for (j = 1; sum <= i && j < i; ++j)
                {
                    if (i % j == 0)
                    {
                        sum += j;
                    }
                }
                if (sum == i)
                {
                    System.out.println(" " + i);
                }
            }
        }
}
