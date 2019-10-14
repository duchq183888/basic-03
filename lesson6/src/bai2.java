
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
public class bai2 {
    public static void main(String[] args) {
        int n;
        Scanner x=new Scanner(System.in);
        System.out.println("nhap n: ");
        n=x.nextInt();
        int a=n;int d=0;
        while(true){
            d=d+a%10;
            a=a/10;
            if(a<1){
                break;
            }
            
        }
        if(n%d==0){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
        
        
    }
    
}
