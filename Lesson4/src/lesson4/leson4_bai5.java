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
public class leson4_bai5 {

    public static void main(String[] args) {
        String a = "hellllllllllo";
        String b = "hellllllllalo";
        System.out.println(check(a, b));

    }

    static int check(String a, String b) {
        if (a.compareTo(b) > 0) {
            return 1;
        } else {
            if (a.compareTo(b) == 0) {
                return 0;
            } else {
                return -1;
            }
        }
    }

}
