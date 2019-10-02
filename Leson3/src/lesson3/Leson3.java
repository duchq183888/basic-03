/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leson3;

import sun.security.util.Length;

/**
 *
 * @author LaptopAZ.vn
 */
public class Leson3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a[] = new int[100];
        String[] name = {"qwe"};
        System.out.println("");
        int[] mangA = {1, 2, 3, 4};

        int[] mangB = new int[mangA.length];
        for (int i = 0; i <= mangA.length - 1; i++) {
            mangB[i] = mangA[mangA.length - 1 - i];
            System.out.println(mangB[i]);
        }
        String sample = "ducd";
        System.out.println("sample: " + sample);
        System.out.println("length: " + sample.length());
        for (int j = 0; j < sample.length(); j++) {
            System.out.println("index: " + j);
        }
        boolean k = true;
        int sum = 0;
        int dem = 0;
        for (int b = 0; b <= mangA.length - 1; b++) {
            if (mangA[b] == 4) {
                System.out.println(b);
                k = false;
            }
            for (int i = 0; i <= mangA.length - 1; i++) {
                sum = sum + mangA[i];
                if (mangA[i] % 5 == 1) {
                    System.out.println(mangA[i]);
                }

            }
           

        }
         System.out.println("sum= " + sum);
        if (k == true) {
            System.out.println("ko tim thay");
        }
        for (int b = 0; b <= sample.length() - 1; b++) {
            if (sample.charAt(b) == 'd') {
                System.out.println(b);
            }
        }
    }

}

// TODO code application logic here

