/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework2;

import java.util.Scanner;

/**
 *
 * @author LaptopAZ.vn
 */
public class Homework2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("EXERCISE 1 : ");
        int k;
        int a;
        Scanner x = new Scanner(System.in);
        k = x.nextInt();
        int i = k - 1;
        System.out.println("cac so nguyen to be hon k la: ");
        while (i > 1) {
            int j = 0;
            for (a = 2; a < i; a++) {
                if ((i % a) == 0) {
                    j = j + 1;
                }

            }
            if (j == 0) {
                System.out.print(i + " ");

            }
            i = i - 1;

        }
        System.out.println("");
        System.out.println(" EXERCISE 2 : ");
        int A, B, C, D, E;

        Scanner l = new Scanner(System.in);
        A = l.nextInt();
        Scanner m = new Scanner(System.in);
        B = m.nextInt();
        C = B % 10;//chu so hang don vi
        D = (B % 100) / 10;//hang chuc
        E = B / 100;//hang tram
        System.out.println("mo phong phep tinh tay 2 so " + A + " va " + B);
        System.out.println(" " + A);
        System.out.println("x" + B);
        System.out.println("__________");
        System.out.println("  " + C * A);
        System.out.println(" " + D * A);
        System.out.println(E * A);
        System.out.println("__________");
        System.out.println(A * B);
        System.out.println("");
        System.out.println(" EXERCISE 3 : ");
        int a1, a2, a3, a4, a5;
        Scanner y = new Scanner(System.in);
        a1 = y.nextInt();
        Scanner z = new Scanner(System.in);
        a2 = z.nextInt();
        Scanner f = new Scanner(System.in);
        a3 = f.nextInt();
        Scanner e = new Scanner(System.in);
        a4 = e.nextInt();
        Scanner p = new Scanner(System.in);
        a5 = p.nextInt();
        System.out.println("cho day: " + a1 + ";" + a2 + ";" + a3 + ";" + a4 + ";" + a5);
        if (a1 > a2) {
            a1 = a1 + a2;
            a2 = a1 - a2;
            a1 = a1 - a2;
        }
        if (a1 > a3) {
            a1 = a1 + a3;
            a3 = a1 - a3;
            a1 = a1 - a3;
        }
        if (a1 > a4) {
            a1 = a1 + a4;
            a4 = a1 - a4;
            a1 = a1 - a4;
        }
        if (a1 > a5) {
            a1 = a1 + a5;
            a5 = a1 - a5;
            a1 = a1 - a5;
        }
        if (a2 > a3) {
            a2 = a2 + a3;
            a3 = a2 - a3;
            a2 = a2 - a3;
        }
        if (a2 > a4) {
            a2 = a2 + a4;
            a4 = a2 - a4;
            a2 = a2 - a4;
        }
        if (a2 > a5) {
            a2 = a2 + a5;
            a5 = a2 - a5;
            a2 = a2 - a5;
        }
        if (a3 > a5) {
            a3 = a3 + a5;
            a5 = a3 - a5;
            a3 = a3 - a5;
        }
        if (a3 > a4) {
            a3 = a3 + a4;
            a4 = a3 - a4;
            a3 = a3 - a4;
        }
        if (a4 > a5) {
            a4 = a4 + a5;
            a5 = a4 - a5;
            a4 = a4 - a5;
        }

        System.out.println("sap xep day tang dan: " + a1 + ";" + a2 + ";" + a3 + ";" + a4 + ";" + a5);
        System.out.println(" EXERCISE 4 : ");

    }

}
