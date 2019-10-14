
import static java.lang.Math.log;
import static java.lang.Math.pow;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author LaptopAZ.vn
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a, b;
        Scanner x = new Scanner(System.in);
        a = x.nextInt();

        b = x.nextInt();
        int d = 0, e = 0;
        int k=b/a;
        while(k>=1){
            d=d+1;
            k=k/2;
        }
        System.out.println(d-1);
        
        
    }
}
