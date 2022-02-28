package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sk = new Scanner(System.in);
        int n = sk.nextInt();
        int[] tab = new int[n];

        for (int i = 0; i < tab.length; i++) {
                tab[i] = i+1;
        }
        System.out.println(algorytm(1,5,
                10, new int[]{3,4,6,8,9}));
        System.out.println(algorytm(1,5,
                10, new int[]{15,16,18,22,24}));
        System.out.println(algorytm(1,5,
                10, new int[]{2,10,16,22,24}));
        System.out.println(algorytm(1,5,
                10, new int[]{1,3,10,10,18}));

    }

    private static int algorytm(int p,int k,int e,int[] tab){
        if (k==p){
            if (tab[p] > e){
                return p;
            }
            else
                return p+1;
        }else{
            int s = (p+k)/2;
            if (tab[s]>e){
                return algorytm(p,s,e,tab);
            }else
                return algorytm(s+1,k,e,tab);
        }
    }
}
