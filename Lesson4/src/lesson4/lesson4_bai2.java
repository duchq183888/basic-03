/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson4;

import java.util.Scanner;

/**
 *
 * @author LaptopAZ.vn
 */
public class lesson4_bai2 {

    public static void main(String[] args) {
        int a;
        Scanner e = new Scanner(System.in);
        a = e.nextInt();
        System.out.println(check(a));

    }

    static boolean check(int a) {
        int d = 0;
        for (int i = 1; i <= a / 2; i++) {
            if (a % i == 0) {
                d = d + 1;

            }
        }
        if (d > 1) {
            return false;
        }
        return true;
    }
}
