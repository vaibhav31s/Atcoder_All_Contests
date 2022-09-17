package com.company.Unicorn269;

import java.util.Arrays;
import java.util.Scanner;

 class B {
    public static void main(String[] args) {
        int  k = 0;
        int[] answer = new int[4];
        Scanner sc = new Scanner(System.in);
        char[][] arr = new char[10][10];
        for(int i = 0; i < 10; i++){
            arr[i] = sc.nextLine().toCharArray();
        }

        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                    if(arr[i][j] == '#'){
                        answer[0] = i+1;
                        answer[1] = j+1;
                        break;
                    }
            }
        }
        for(int i = 9; i >=0 ; i--){
            for(int j = 9 ; j >= 0; j--){
                if(arr[i][j] == '#'){
                    answer[2] = i+1;
                    answer[3] = j+1;
                    break;
                }
            }
        }
        System.out.println(answer[2] + " " + answer[0]);
        System.out.println(answer[1] + " " + answer[3]);
    }


 }
