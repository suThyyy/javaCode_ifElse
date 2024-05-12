/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ifelse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class B38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        String chuoi = input.nextLine();
        int countC = 0;
        int countPlus = 0;
        for (int i = 0; i < chuoi.length(); i++){
            char kitu = chuoi.charAt(i);
            if (kitu == 'C'){
                countC++;
            }
            else if (kitu == '+'){
                countPlus++;
            }
        }
        if (countC >= 1 && countPlus >= 2){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
