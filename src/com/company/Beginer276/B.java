package com.company.Beginer276;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // get a integer
        int  n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<PriorityQueue<Integer>> list = new ArrayList<>(n+1);
        for(int i = 0; i <= n; i++){
          list.add(i, new PriorityQueue<>())    ;
        }
        for(int i = 0; i < m; i++){
            int a = sc.nextInt();
            int b  = sc.nextInt();
            list.get(a).add(b);
            list.get(b).add(a);

        }
        int i = 0;
        for(PriorityQueue<Integer> q :  list){
            if(i++ == 0) continue;
            System.out.print(q.size() + " ");

            while(!q.isEmpty()){
                System.out.print(q.poll() + " ");
            }
            System.out.println();
        }


    }
}
