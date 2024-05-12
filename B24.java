/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ifelse;
import static java.lang.Character.isDigit;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class B24 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int d1 = input.nextInt();
        int d2 = input.nextInt();
        int d3 = input.nextInt();
        long min1 = d1 + d2 + d3;
        long min2 = 2*d1 + 2*d2;
        long min3 = 2*(d1 + d3);
        long min4 = 2*(d2 + d3);
        long min = min1;
        if (min > min2){
            min = min2;
        }
        if (min > min3){
            min = min3;
        }
        if (min > min4){
            min = min4;
        }
        System.out.println(min);
    }
}
