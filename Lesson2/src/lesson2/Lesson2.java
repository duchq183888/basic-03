/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson2;

import java.util.Scanner;

/**
 *
 * @author LaptopAZ.vn
 */
public class Lesson2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int k;
        int j = 0;
        Scanner x = new Scanner(System.in);
        k = x.nextInt();
        for (int i = 1; i <= k; i++) {
            if (k % i == 0) {
                System.out.println("cac uoc cua k la: " + i);
                j = j + 1;
            }

            // TODO code application logic here
        }
        if (j > 2) {
            System.out.println("ko phai");
        } else {
            System.out.println("phai");
        }

    }
}
