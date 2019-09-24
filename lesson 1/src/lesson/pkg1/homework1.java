/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson.pkg1;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/**
 *
 * @author LaptopAZ.vn
 */
public class homework1 {

    public static void main(String[] args) {
        //  exercise 1
        System.out.println("exercise 1:  ");
        float x = 6, y = 0;
        System.out.println("x= " + x);
        System.out.println("y= " + y);
        float tong = x + y;
        float hieu = x - y;
        float tich = x * y;
        float thuong = x / y;
        float luythua = (float) pow(x, y);
        System.out.println("tong= " + tong);
        System.out.println("hieu= " + hieu);
        System.out.println("tich= " + tich);
        if (y == 0) {
            System.out.println("thuong khong xac dinh");
        } else {
            System.out.println("thuong= " + thuong);
        }
        // exercise 2
        System.out.println("exercise 2:  ");
        float a = 1, b = -4, c = 3, x1 = 0, x2 = 0, x0 = 0;
        if (a == 0) {
            if (b == 0) {

                if (c == 0) {
                    System.out.println("pt vo so nghiem");

                } else {
                    System.out.println("pt vo nghiem");
                }
            } else {
                System.out.println("pt co nghiem duy nhat: " + -c / b);

            }

        } else {
            float k = b * b - 4 * a * c;
            if (k > 0) {
                System.out.println("pt co 2 nghiem phan biet: ");
                x1 = (float) ((-b - sqrt(k)) / (2 * a));
                x2 = (float) ((-b + sqrt(k)) / (2 * a));
                System.out.println("x1= " + x1);
                System.out.println("x2= " + x2);

            } else {
                if (k == 0) {
                    x0 = -b / 2 * a;

                    System.out.println("pt co nghiem duy nhat:");
                    System.out.println("x0= " + x0);
                } else {
                    System.out.println("pt vo nghiem");

                }
            }
        }
    }
}
