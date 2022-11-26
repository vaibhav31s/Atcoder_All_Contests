package com.company.Unicorn271;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // get a integer
        String s = sc.next();
        // get two integers separated with half-width break
        String t = sc.next();
        // get a string

        int win = t.length();
        boolean flag= false;
        for(int i = 0; i <= s.length()-win; i++){
//            System.out.println(s.substring(i,i+win));
            if(s.substring(i,i+win).equals(t)){
                flag= true;
                break;
            }
        }
        if(flag)
        System.out.println("Yes");
        else System.out.println("No");
    }
}
