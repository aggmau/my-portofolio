/*
Summing Elements in Arrays

You are given a program that takes the length of the array as the first input, 
creates it, and then takes the next inputs as elements of the array.
Complete the program to go through the array and calculate the sum of the numbers that are multiples of 4.

Sample Input
5
4
9
16
2
7

Sample Output
20
*/

import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int length = scanner.nextInt();
       int[] array =  new int[length];
       for (int i = 0; i < length; i++) {
           array[i] = scanner.nextInt();
       }
       //your code goes here
       int sum=0;
       for (int j = 0; j < length; j++) {
           if (array[j]%4 == 0) {
               sum += array[j];
           }
       }
       System.out.println(sum);
   }
}
