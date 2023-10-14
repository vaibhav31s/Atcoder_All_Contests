package com.company._324;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        long n = sc.nextLong();

        int x = 0;
        long nn = n;
        while(nn > 0 && nn % 2 == 0) {
            x++;
            nn/=2;
        }

        int y = 0;
         nn = n;
        while(nn > 0 && nn % 3 == 0) {
            y++;
            nn/=3;
        }

//        System.out.println(x + " " + y);

        long answer= (long) (Math.pow(2, x)* Math.pow(3, y));
        if(answer == n) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }


    }
    private static boolean isPrime(long n) {
            if (n < 2) return false;
            if (n == 2 || n == 3) return true;
            if (n % 2 == 0 || n % 3 == 0) return false;
            long sqrtN = (long) Math.sqrt(n) + 1;
            for (long i = 6L; i <= sqrtN; i += 6) {
                if (n % (i - 1) == 0 || n % (i + 1) == 0) return false;
            }
            return true;
        }

}

