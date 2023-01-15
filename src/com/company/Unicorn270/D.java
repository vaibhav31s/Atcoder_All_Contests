package com.company.Unicorn270;

import java.util.Scanner;
import java.util.Stack;

public class D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // get a integer
        String s = sc.next();

        int[] arr= new int[26];
        if(isGood(arr, s)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

    private static boolean isGood(int[] arr, String s) {

        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == '('){
                stack.push(')');
            }else if(ch == ')'){
                while(!stack.isEmpty()){
                    if(stack.peek() == ')') {
                        stack.pop();
                        break;
                    }else {
                        stack.pop();
                    }
                }
            }else{
                if(stack.contains(ch) ) return false;
                stack.push(ch);
            }
        }

        return stack.isEmpty();

    }

}
