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
public class lesson4_bai4 {

    public static void main(String[] args) {
        int a[] = {1, 1, 1, 1};
        System.out.println(checksx(a));

    }

    static int checksx(int[] a) {
        int d = 0;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] > a[j]) {
                    d = d + 1;
                }
            }
        }
        if (d == 0 ) {
            return 1;
        }
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] < a[i + 1]) {
                return 0;
            }
        }
        return -1;

    }
}
