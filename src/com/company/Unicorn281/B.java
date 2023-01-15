package com.company.Unicorn281;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // get a integer
        String s = sc.nextLine();

        if(s.length() < 8){
            System.out.println("No");
        }else
        if(!(s.charAt(0) >= 'A' &&  s.charAt(0) <='Z') || !(s.charAt(s.length()-1) >= 'A' &&  s.charAt(s.length()-1) <='Z')){
            System.out.println("No");
        }else{
            String sb = s.substring(1,s.length()-1);
//            System.out.println(sb);
            try{
                Long ll = Long.parseLong(sb);
                if(sb.length() > 6){
                    System.out.println("No");
                }        else
                if(100000 <= ll && ll <= 999999 ){
                    System.out.println("Yes");
                }else System.out.println("No");
            }catch (Exception e){
                System.out.println("No");

            }


        }

    }
}
