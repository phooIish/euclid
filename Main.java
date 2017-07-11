package com.company;
/**
 * Inspired by Netflix
 * Find the greatest common divisor of a rectangle or square.
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int l, w, gcd, min, max;
        Scanner sides = new Scanner(System.in);
        System.out.printf("Enter the length = ");
        l = sides.nextInt();
        System.out.printf("Enter the width = ");
        w = sides.nextInt();

        if(l == w){ //The greatest common divisor for a square is half the size of one side.
            gcd = l / 2;
            System.out.println("The greatest common divisor is " + gcd);
        }
        else{ //In case the user switches the order of length and width.
            if(l > w){
                min = w;
                gcd = l % w;
            }
            else{
                min = l;
                gcd = w % l;
            }
            //If the gcd is found before the while loop
            if(gcd == 0){
                gcd = min;
                System.out.println("The greatest common divisor is " + gcd);
            }
            else{
                while(true){ //Finds remainder of each instance until the first divisor(greatest) is found. [Euclid's Algorithm]
                    max = min;
                    min = gcd;
                    gcd = max % min;
                    if(gcd == 0){
                        gcd = min;
                        break;
                    }
                }
                System.out.println("The greatest common divisor is " + gcd);
            }
        }
    }
}
