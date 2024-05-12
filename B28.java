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
public class B28 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int u1 = input.nextInt();
        int d = input.nextInt();
        long un = (long)u1 + (long)(n - 1)*d;
        long sum = (long)n*(u1 + un)/2;
        System.out.println(sum);

    }
}
