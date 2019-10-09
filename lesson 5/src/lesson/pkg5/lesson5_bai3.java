/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson.pkg5;

/**
 *
 * @author LaptopAZ.vn
 */
public class lesson5_bai3 {

    public static void main(String[] args) {
        String s = "233-44";
        char[] c = s.toCharArray();
        int k = s.indexOf('-');
        String s1 = s.substring(0, k);
        int a = Integer.valueOf(s1);
        String s2 = s.substring(k + 1);
        int b = Integer.valueOf(s2);
        System.out.println(s1 + "-" + s2 + "=" + (a - b));

    }

}
