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
public class B34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int c1 = input.nextInt();
        int c2 = input.nextInt();
        int c3 = input.nextInt();
        int c4 = input.nextInt();
        int c5 = input.nextInt();
        if ((c1 + c2 + c3 + c4 + c5) % 5 == 0){
            if ((c1 + c2 + c3 + c4 + c5)/5 != 0){
                System.out.println((c1 + c2 + c3 + c4 + c5)/5);
            }
            else {
                System.out.println("-1");
            }
        }
        else{
            System.out.println("-1");
        }
    }
}
