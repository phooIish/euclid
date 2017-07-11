package com.company;

/**
 * Divide longest side by shortest side
 * Repeat using the remainder until the shortest side divides the longest fully.
 */
public class euclid {
    public static void main(String[] args) {
        System.out.println("gcd = " + gcd(345,150));
    }
    static int gcd(int max, int min){
        int gcd = max % min;
        while(true){
            max = min;
            min = gcd;
            gcd = max % min;
            if(gcd == 0){
                break;
            }
        }
        return min;
    }
}
