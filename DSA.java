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
public class DSA {

    /**
     * @param args the command line arguments
     */
    public static int simpleSearch(int[] A, int n, int m) {
        boolean check = false;
        for (int i = 0; i < n; i++) {
            if (A[i] == m) {
                return i;
            }
        }
        return -1;
        // Big-Oh O(n)
    }

    public static int binarySearch(int[] A, int n, int m, int l, int r) {
        int mid = (l + r) / 2;
        if (A[mid] == m) {
            return mid;
        }
        if (l >= r) {
            return -1;
        }
        if (A[mid] > m) {
            return binarySearch(A, n, m, l, mid - 1);
        } else {
            return binarySearch(A, n, n, mid + 1, r);
        }
        //Big-Oh O(log2(n))
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Input size: ");
        int n = sc.nextInt();
        int[] A = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Input element "+i+": ");
            A[i]=sc.nextInt();
        }
        System.out.println("Input target: ");
        int m = sc.nextInt();
        // Ex1:
        if(simpleSearch(A, A.length, m)==-1){
            System.out.println("Not found element");
        }
        else{
            System.out.println("Found element at "+simpleSearch(A, A.length, m));
        }
        //DSA 1
        if(binarySearch(A, A.length, m, 0 , A.length-1)==-1){
            System.out.println("Not found element");
        }
        else{
            System.out.println("Found element at "+simpleSearch(A, A.length, m));
        }
    }

}
