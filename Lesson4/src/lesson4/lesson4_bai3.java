/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson4;

/**
 *
 * @author LaptopAZ.vn
 */
public class lesson4_bai3 {

    public static void main(String[] args) {
        String a[] = {"a", "e", "d", "f", "c"};
        for (int i = 0; i < a.length; i++) {
            System.out.println(dasapxep(a)[i]);

        }
    }

    static String[] dasapxep(String[] a) {

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i].compareTo(a[j]) > 0) {
                    String temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }

            }

        }
        return a;

    }

}
