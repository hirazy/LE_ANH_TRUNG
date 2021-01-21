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
public class DSA1 {

    /**
     * @param args the command line arguments
     */
    public static int PolyEvaluate(int[] C, int n, int x) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int p = 1;
            for (int j = 1; j <= i; j++) {
                p *= x;
            }
            sum += (C[i] * p);
        }
        return sum;
        // Big-Oh O(n*n)
    }

    public static int solve(int[] C, int n, int x) {
        int sum = 0;
        int p = 1;
        for (int i = 0; i < n; i++) {
            sum += (C[i] * p);
            p *= x;
        }
        return sum;
        //Big-Oh O(n)
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Input size: ");
        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Input element " + i + ": ");
            A[i] = sc.nextInt();
        }
        System.out.println("Input target: ");
        int x = sc.nextInt();
        // Ex2: PolyEvaluate
        System.out.println("PolyEvaluate: "+PolyEvaluate(A, A.length, x));
        System.out.println("PolyEvaluate: "+solve(A, A.length, x));
    }

}
