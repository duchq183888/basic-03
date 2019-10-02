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
public class homework_lesson3_kho {

    public static void main(String[] args) {
        int n;
        Scanner k = new Scanner(System.in);
        System.out.println("nhap n: ");
        Scanner q = new Scanner(System.in);
        n = q.nextInt();
        int[][] A = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("A[%d][%d] = ", i, j);
                A[i][j] = k.nextInt();

            }
        }
        System.out.println("Ma trận A: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(A[i][j] + "  ");
            }
            System.out.println("");
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    sum = sum + A[i][j];
                }
            }
        }
        System.out.println("tong cac phan tu tren duong cheo chinh = " + sum);
        int c = 0;
        int det = 0;
        for (int a = 0; a < n - 1; a++) {
            int[][] B = new int[a][a];
            if (a % 2 == 0) {
                c = 1;
            } else {
                c = -1;
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == 0) {
                        A[i][j] = B[i - 1][j - 1];

                    } else {
                        A[i][j] = B[i][j - 1];
                    }
                    det = B[a][0] * B[i][j] * c;

                }
            }

        }
        System.out.println("dinh thuc ma tran A la: "+det);

    }

}
