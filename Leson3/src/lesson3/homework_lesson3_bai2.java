/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leson3;

import java.util.Scanner;

/**
 *
 * @author LaptopAZ.vn
 */
public class homework_lesson3_bai2 {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);

        int a[] = new int[10];
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            System.out.printf("a[%d] = ", i);
            a[i] = k.nextInt();

        }
        System.out.print("cac so chia het cho 2 trong day la: ");
        for (int i = 0; i < 10; i++) {
            if (a[i] % 2 == 0) {
                System.out.print(a[i] + " ");
                sum = sum + a[i];
            }

        }
        System.out.println("");
        System.out.println("tong cac so chan la: " + sum);
        System.out.print("cac so o vi tri chan: ");
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.print(a[i] + " ");
            }
        }
        System.out.println("");
        System.out.print("cac so chia cho 5 du 1: ");
        for (int i = 0; i < 10; i++) {
            if (a[i] % 5 == 1) {
                System.out.print(a[i] + " ");
            }
        }
        System.out.println("");
    }
}
