package com.company.Unicorn271;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // get a integer
        String s= sc.next();
        int answer =0;

        for(char ch : s.toCharArray()){
            if(ch == 'v') answer++;
            else answer += 2;
        }


        System.out.println(answer);
    }
}
