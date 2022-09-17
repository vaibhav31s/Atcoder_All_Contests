package com.company.Unicorn269;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class C {
    public static PriorityQueue<Long> answer = new PriorityQueue<>();
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        // get a integer
//        int a = sc.nextInt();
//        // get two integers separated with half-width break
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        // get a string
//        String s = sc.next();
//        // output
//        System.out.println((a+b+c) + " " + s);
        Long n = sc.nextLong();
        char[] bits = Long.toString(n,2).toCharArray();
        backtrack(bits, bits.length-1);

        while(!answer.isEmpty()){
            System.out.println(answer.poll());
        }
        System.out.println(n);


    }

    private static void backtrack(char[] bits, int last) {

        for(int i = last ; i >=0;  i--){
            if(bits[i] == '1'){
                bits[i] = '0';
                String numb = String.valueOf(bits);
                answer.add(Long.parseLong(numb,2));

                backtrack(bits,i);
                bits[i] = '1';
            }
        }
    }
}
