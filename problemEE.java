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
public class problemEE {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt(), b = input.nextInt(), c = input.nextInt();
        if (a == 0){
            if (b == 0){
                if (c == 0){
                    System.out.println("VO SO NGHIEM");
                }
                else{
                    System.out.printf("VO NGHIEM");
                }
            }
            else{
                System.out.printf("%.2f",(-c*1.00)/b*1.00);
            }
        }
        else{
            float delta = b * b - 4 * a * c;
            if (delta < 0){
                System.out.println("VO NGHIEM");
            }
            else if (delta == 0){
                System.out.printf("%.2f",(-b*1.00) / 2 * a * 1.00);
            }
            else{
                float candelta = (float)Math.sqrt(delta);
                float x1 = (float) ((-b - candelta) / (2 * a * 1.00));
                float x2 = (float) ((-b + candelta) / (2 * a * 1.00));
                System.out.printf("%.2f %.2f", x1 , x2 );
            }
        }
    }
}
