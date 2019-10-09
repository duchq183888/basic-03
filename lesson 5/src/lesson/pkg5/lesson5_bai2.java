/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson.pkg5;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author LaptopAZ.vn
 */
public class lesson5_bai2 {

    public static void main(String[] args) {
        int c;
        Scanner x = new Scanner(System.in);
        System.out.println("nhap so: ");
        c = x.nextInt();
        NumberFormat y = NumberFormat.getInstance(Locale.ENGLISH);
        String s = y.format(c);
        System.out.println(s + "vnđ");

    }

}
