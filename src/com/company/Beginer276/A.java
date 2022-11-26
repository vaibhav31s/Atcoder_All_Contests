package com.company.Beginer276;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // get a integer
        String s = sc.next();
       int last = -1;
       for(int i= 0; i < s.length(); i++){
           if(s.charAt(i) == 'a'){
               last = i;
           }
       }

        System.out.println(last+1);
    }
}
