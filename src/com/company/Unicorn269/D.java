package com.company.Unicorn269;

import java.util.*;

public class D {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        ArrayList<int[] > nodes = new ArrayList<>();
        nodes.add(new int[]{-1,-1});
        nodes.add(new int[]{0,1});
        nodes.add(new int[]{0,2});
        nodes.add(new int[]{1,0});
        nodes.add(new int[]{1,2});
        nodes.add(new int[]{2,0});
        HashSet<int[]> first = new HashSet<>();
        HashSet<int[]> second = new HashSet<>();
        for(int[] x : nodes){

                first.add(x);

        }
        System.out.println(nodes.contains(new int[]{2,0}));



    }
}
