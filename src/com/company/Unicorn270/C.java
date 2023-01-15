package com.company.Unicorn270;

import java.util.Scanner;
import java.util.Stack;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // get a integer
        String s = sc.next();
        long answer= 0;
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == '0'){
                stack.push(ch);
            }else{
                int size = 0;


                if(!stack.isEmpty()){
                    int res = (stack.size()+2-1)/2;
                    if(stack.size()==1) {
//                        System.out.println(a);
                        answer++;
                    }
                    else
                    answer += res ;
                    stack.clear();
//                    System.out.println(a);
                }
                answer++;
            }
        }
        if(!stack.isEmpty()){
            int res = (stack.size()+2-1)/2;
            if(stack.size()==1) {
//                        System.out.println(a);
                answer++;
            }
            else
                answer += res ;
            stack.clear();
//                    System.out.println(a);
        }
        System.out.println(answer);
    }
}
