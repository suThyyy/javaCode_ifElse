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
public class B37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            int h = input.nextInt();
            int m = input.nextInt();
            int k = input.nextInt();
            int h1 = (k/28)%28;
            int m1 = k%28;
            if((m + m1) > 27){
                m = m + m1 - 28;
                h++;
            }
            else{
                m += m1;
            }
            if ((h + h1) > 27 ){
                h = h + h1 - 28;
            }
            else{
                h += h1;
            }
            System.out.printf("%02dh:%02dm",h,m);
    }
}
