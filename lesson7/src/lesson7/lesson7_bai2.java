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
public class lesson7_bai2 {

    static Scanner x = new Scanner(System.in);
    static int n;

    public static void main(String[] args) {
        int b = 0,c = 0;
        System.out.println("nhap n: ");
        n=x.nextInt();
        int[] a = new int[n];
        System.out.printf("nhập dãy: ");
        for (int i = 0; i < a.length; i++) {
            System.out.printf("a[%d]=", i);
            a[i] = x.nextInt();

        }
        doicho(a, b, c);
        System.out.printf("dãy sau khi di chuyển là: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");

        }

    }

     static void doicho(int a[], int b, int c) {
        //vị trí b tới vị trí c

        System.out.println("chuyển từ vị trí: ");
        b = x.nextInt();
        System.out.println("tới vị trí: ");
        c = x.nextInt();
        if (b > c) {
            for (int i = b - 1; i > c - 1; i--) {
                int d = a[i];
                a[i] = a[i - 1];
                a[i - 1] = d;

            }
        }
        if (b < c) {
            for (int i = b - 1; i < c - 1; i++) {

                int d = a[i];
                a[i] = a[i + 1];
                a[i + 1] = d;

            }
        }
    }

}
