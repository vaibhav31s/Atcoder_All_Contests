package com.company.Beginer276;

import java.util.HashSet;
import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // get a integer
        int a = sc.nextInt();

        int[] arr  = new int[a];
        for(int i  = 0;  i < a ; i++){
            arr[i] = sc.nextInt();

        }

        HashSet<Integer> set = new HashSet<>();
        for(int x  : arr) if(x % 2 != 0  && x % 3 != 0 && x != 1)  set.add(x);


        if(set.size()>0){
            System.out.println(-1);
        }else{

            set = new HashSet<>();

            int count =0;

                    for(int i = 0; i < a;i++){
                        int c = arr[i];
                        while(c %2 != 0 || c % 3 != 0) {
                            if (c % 3 == 0) {
                                c = (c / 3);
                                count++;
                            } else if (c % 2 == 0) {
                              c = (c / 2);
                                count++;
                            }else break;
                        }
                        set.add(c);

                    }
//            System.out.println(set);
            if(set.size()==1)
                        System.out.println(count);
else System.out.println(-1);





        }
    }
}
