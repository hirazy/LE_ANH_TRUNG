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
public class DSA3 {

    /**
     * @param base
     * @param args the command line arguments
     */
    public static int GCD(int m, int n) {
        int i = n;
        while(i>1){
            if(m%i==0&&n%i==0){
                return i;
            }
            i--;
        }
        return 1;
        // Big-Oh O(n)
    }

    public static int GCD1(int m, int n) {
        do{
            int tmp = n%m;
            n = m;
            m = tmp;
        }while(m!=0);
        return n;
        // Big-Oh O(log(m*n))
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Input m: ");
        int m = sc.nextInt();
        System.out.println("Input n: ");
        int n = sc.nextInt();
        System.out.println("Greatest common divisor of m and n: "+GCD(m, n));
        System.out.println("Greatest common divisor of m and n: "+GCD1(m, n));
        
    }
}
