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
public class homework_lesson3_bai1 {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);

        int a[] = new int[10];
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            System.out.printf("a[%d] = ", i);
            a[i] = k.nextInt();
            sum = sum + a[i];

        }
        System.out.println("tong cac phan tu trong mang= " + sum);

    }
}
