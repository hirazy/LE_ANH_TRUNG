/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class DSA2 {

    /**
     * @param base
     * @param args the command line arguments
     */
    public static int pow(int base, int exp) {
        int sum = 1;
        for (int i = 1; i <= exp; i++) {
            sum *= base;
        }
        
        return sum;
        // Big-Oh O(n)
    }

    public static int power(int base, int exp) {

        if (exp == 0) {
            return 1;
        }
        int temp = power(base, exp / 2);
        if (exp % 2 == 0) {
            return temp * temp;
        } else {
            return base * temp * temp;
        }
        // Big-Oh O(log2(n))
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Input base: ");
        int base = sc.nextInt();
        System.out.println("Input exp: ");
        int exp = sc.nextInt();
        System.out.println("Power value of base and exp: "+pow(base, exp));
        System.out.println("Power value of base and exp: "+power(base, exp));
        
    }
}
