/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson7;

import java.util.Scanner;

/**
 *
 * @author LaptopAZ.vn
 */
public class lesson7_bai1 {

    public static void main(String[] args) {
        int h, m, s, t;
        Scanner x = new Scanner(System.in);
        h = x.nextInt();
        m = x.nextInt();
        s = x.nextInt();
        System.out.println("nhap chuoi: ");
        String k = x.next();
        System.out.println("thời gian ban đầu là: " + h + "h" + m + "m" + s + "s " + k);
        System.out.println("nhap thoi gian thay doi: ");
        t = x.nextInt();
        int a = t / 3600 + h;
        int b = (t % 3600) / 60 + m;
        int c = t % 3600 % 60 + s;
        if (c >= 60) {
            c = c % 60;
            b = b + 1;

        }
        if (b >= 60) {

            b = b % 60;
            a = a + 1;
        }
        if (a >= 12) {
            int d = (a / 12) % 2;

            if (d != 0) {
                if (k == "AM") {
                    k = "PM";
                } else {
                    k = "AM";
                }
                System.out.println((a % 12) + "h" + b + "m" + c + "s" + k);
            } else {
                System.out.println((a%12) + "h" + b + "m" + c + "s" + k);

            }

        } else {
            System.out.println(a + "h" + b + "m" + c + "s" + k);

        }

    }

}
