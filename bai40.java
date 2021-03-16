/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap;

/**
 *
 * @author ADMIN
 */
public class bai40 {
    public static void main(String[] args) {
        {
            int d, n, g;
            System.out.println("Dung - Nam - Gia:");
            for (d = 1; d < 100/5; ++d)
            {
                for (n = 1; n < 100/3; ++n)
                {
                    g = 100 - d - n;
                    if (15*d + 9*n + g == 300)
                    {
                        System.out.println("( "+ d +", "+ n + ", " + g +" )");
                    }
                }
            }
        }
    }
}
