package com.company.Unicorn270;

import java.util.Arrays;
import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      long[] arr= new long[n+1];
      for(int i = 1; i <= n; i++) arr[i] = sc.nextLong();
      long t = sc.nextLong();
      sc.nextLine();
      while(t-- > 0){
          String[] s = sc.nextLine().split(" ");
          if(s.length == 2){
              System.out.println(arr[Integer.parseInt(s[1])]);
          }else {
              arr[Integer.parseInt(s[1])] = Integer.parseInt(s[2]);
          }
//          System.out.println(Arrays.toString(s));
      }
    }
}
