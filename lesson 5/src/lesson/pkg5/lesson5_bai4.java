/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson.pkg5;

import java.util.Scanner;

/**
 *
 * @author LaptopAZ.vn
 */
public class lesson5_bai4 {

    public static void main(String[] args) {
        int d=0,m=0;
        boolean k = false;
        Scanner x = new Scanner(System.in);
        int a[][] = new int[3][3];
        System.out.println("nhap mang: ");
        int[] c = new int[9];
        int e = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("a[%d][%d]= ", i, j);
                a[i][j] = x.nextInt();
                c[e++] = a[i][j];
            }

        }
        for (int i = 0; i < e - 1; i++) {
            for (int j = 1; j < e; j++) {

                if (c[i] == c[j]) {
                    m=m+1;
                }
            }
        }
        for (int i = 0; i < e; i++) {
            if (c[i] >= 1 && c[i] <= 9) {
                d=d+1;
            }
        }
        if(d==9&&m==0){
            k=true;
        }

        System.out.println(k);
    }
}
