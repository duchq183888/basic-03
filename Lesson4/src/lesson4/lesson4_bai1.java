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
public class lesson4_bai1 {

    public static void main(String[] args) {
        boolean k = false;
        int[] a = {1, 2, 3, 4, 1};
        System.out.println(check(a));

    }

    static boolean check(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] != a[a.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

}
