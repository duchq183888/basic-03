/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson3;

import java.util.Scanner;

/**
 *
 * @author LaptopAZ.vn
 */
public class x_matrix {

    public static void main(String[] args) {
        int x = 3, y = 2, z = 2, s = 0;
        Scanner k = new Scanner(System.in);
        Scanner m = new Scanner(System.in);
        // TODO code application logic here
        int[][] a = new int[x][y];
        int[][] b = new int[y][z];

        System.out.println("nhap ma tran a: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < y; j++) {

                System.out.printf("a[%d][%d]= ", i, j);
                a[i][j] = k.nextInt();
            }
        }
        System.out.println("Ma trận a: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(a[i][j] + "  ");
            }
            System.out.println("");
        }
        System.out.println("nhap ma tran b: ");
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < z; j++) {

                System.out.printf("b[%d][%d]= ", i, j);
                b[i][j] = m.nextInt();
            }
        }
        System.out.println("Ma trận b: ");
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < z; j++) {
                System.out.printf(b[i][j] + "  ");
            }
            System.out.println("");
        }
        int[][] c = new int[x][z];
        System.out.println("tich 2 ma tran: ");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < z; j++) {
                for (int f = 0; f < y; f++) {
                    c[i][j] += a[i][f] * b[f][j];

                }
            }
        }
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < z; j++) {
                System.out.print(c[i][j] + "  ");
            }
            System.out.println("");
        }

    }

}
