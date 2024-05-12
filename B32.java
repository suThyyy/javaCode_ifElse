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
public class B32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k2 = input.nextInt();
        int k3 = input.nextInt();
        int k5 = input.nextInt();
        int k6 = input.nextInt();
        int k256 = Math.min(Math.min(k2, k5), k6);
        int k32 = Math.min(k3, k2 - k256);
        System.out.println(256*(long)k256 + 32*(long)k32);
    }
}
