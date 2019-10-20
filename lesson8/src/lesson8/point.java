/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson8;

/**
 *
 * @author LaptopAZ.vn
 */
public class point {
    int hd,td,cd;
    point(){
        hd=1;
        td=2;
        cd=3;
        
    }
    point(int x,int y,int z){
        hd=x;td=y;cd=z;
    }
    
    void hienthitoado(){
        System.out.println(hd+","+td+","+cd);
    }
}
