/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson.pkg6;

/**
 *
 * @author LaptopAZ.vn
 */
public class Lesson6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 234;
        int n = a;

        int d = 0;
        while (true) {
            d = d + a % 10;
            a = a / 10;
            if (a == 0) {
                break;
            }
        }

        if (d % 10 == 9) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }
}
