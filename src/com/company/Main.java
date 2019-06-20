package com.company;

import java.util.Scanner;

/*
Consecutive Prime Sum
Some prime numbers can be expressed as a sum of other consecutive prime numbers.
For example 5 = 2 + 3, 17 = 2 + 3 + 5 + 7, 41 = 2 + 3 + 5 + 7 + 11 + 13. Your task is to find out how many prime numbers
which satisfy this property are present in the range 3 to N subject to a constraint that summation should always start
with number 2.

Write code to find out the number of prime numbers that satisfy the above-mentioned property in a given range.

Input Format: First line contains a number N

Output Format: Print the total number of all such prime numbers which are less than or equal to N.

Constraints: 2<N<=12,000,000,000
*/

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        for (int i =2; i<=n; i++){
            if (isPrime(i)){
                sum = sum +i;
                if (sum>3 && isPrime(sum) && sum<n){
                    System.out.println(sum);
                }
            }
        }
    }


    private static boolean isPrime(int a) {
        if (a <= 1) {
            return false;
        } else {
            for (int i = 2; i < a; i++) {
                if (a % i == 0)
                    return false;
            }
        }
        return true;
    }
}
