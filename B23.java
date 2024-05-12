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
public class B23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int min = (n + 1)/2;
        int max = n;
        int res = (int)Math.ceil(min * 1.00 / m) * m;
        if (res <= max){
            System.out.println(res);
        } else {
            System.out.println("-1");
        }
    }
}
