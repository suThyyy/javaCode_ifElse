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
public class B31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a1 = input.nextInt();
        int a2 = input.nextInt();
        int a3 = input.nextInt();
        int b1 = input.nextInt();
        int b2 = input.nextInt();
        int b3 = input.nextInt();
        int n = input.nextInt();
        int totalsCup = a1 + a2 + a3;
        int totalsMedal = b1 + b2 + b3;
        double n1 = Math.ceil((double)totalsCup/5);
        double n2 = Math.ceil((double)totalsMedal/10);
        if ((int)(n1+n2) <= n){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
