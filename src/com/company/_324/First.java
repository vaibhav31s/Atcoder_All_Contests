package com.company._324;

import java.util.HashSet;
import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        HashSet<Integer> set=  new HashSet<>();
        for(int i = 0; i < n; i++) {
            set.add(sc.nextInt());
        }
        if(set.size() == 1) {
            System.out.println("Yes");
        }else System.out.println("No");
    }


}

