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
public class B40 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int bills = 1;
        if (n < 500){
            bills = n*3300;
        }
        if (n >= 500 && n < 800){
            bills = n*3700 + 800000;
        }
        if (n >= 800 && n < 1000){
            bills = n*3900 + 900000;
        }
        if (n >= 1000){
            bills = n*4500 + 1200000;
        }
        System.out.println(bills);
    }
}
