/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ifelse;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class B25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sumBill = 0;
        if (n >= 100){
            int bill100 = n/100;
            n = n - bill100*100;
            sumBill += bill100;
        }
        if ( n >= 20){
            int bill20 = n/20;
            n -= bill20*20;
            sumBill += bill20;
        }
        if (n >= 10){
            int bill10 = n/10;
            n -= bill10*10;
            sumBill += bill10;
        }
        if (n >= 5){
            int bill5 = n/5;
            n -= bill5*5;
            sumBill += bill5;
        }
        sumBill += n;
        System.out.println(sumBill);
    }
}
