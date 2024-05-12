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
public class B39 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int min, max, mid;
        min = Math.min(Math.min(a, b), c);
        max = Math.max(Math.max(a, b), c);
        mid = a + b + c - min - max;
        System.out.println(min + " " + mid + " " + max);
    }
}
