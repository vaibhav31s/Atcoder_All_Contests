package com.company.Unicorn271;

import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        pair[] s = new pair[m];
        pair[] t=  new pair[m];

        for(int i = 0; i < m; i++){
            String a = sc.next();
            s[i] = new pair();
            for(char ch : a.toCharArray()){
                if(ch == '.') s[i].dot+=1;
                else s[i].hash+=1;

            }

//            System.out.println(s[i]);
        }

        for(int i = 0; i < m; i++){
            t[i] = new pair();
            String a = sc.next();
            for(char ch : a.toCharArray()){
                if(ch == '.') t[i].dot++;
                if(ch == '#') t[i].hash++;

            }
        }
        boolean flag=  false;
        for(int i = 0; i < m; i++){


            if(s[i].dot == t[i].dot &&  s[i].hash == t[i].hash){

            }else{
                flag=  true;
                break;
            }
        }

        if(flag) System.out.println("No");
else System.out.println("Yes");

    }



}

class pair{
    public   int dot = 0;
     public int hash = 0;
}
