package com.company.Unicorn281;

import java.util.Arrays;
import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int     n = sc.nextInt();
        long     t = sc.nextLong();
        long[] arr = new long[(int) n];
        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
        long[] song = Arrays.copyOf(arr,n);
//outer:
//        while(t  >= 0){
//            for(int i = 0; i < n; i++){
//                long dif = t -  arr[i];
//                if(dif  < 0 ){
//                    System.out.print(i + 1);
//                    System.out.println(" " +t);  t -= arr[i];
//                    break outer ;
//                }
//                t -= arr[i];
//            }
//        }
//
        for(int i = 1;i < n; i++){
            arr[i] = arr[i -  1] + arr[i ];
//            System.out.println(arr[i]);
        }

//        System.out.println(l);
        long mod  = t % arr[arr.length-  1] ;
//        System.out.println(mod);
        int x =  Arrays.binarySearch(arr, mod);




        System.out.print(Math.abs(x) );
        long val = arr[(Math.abs(x) - 1)] - t;
        if(mod == t)
        System.out.print(" " +( song[Math.abs(x) - 1] - val));
        else    System.out.print(" " +(mod));
    }
}
