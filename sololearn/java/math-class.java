/*
The Math Class
Write a program to take numbers as input and return the first number raised to the power of the second number.

Sample Input
2
4

Sample Output
16.0
*/

import java.util.Scanner;

class Main {
   public static void main(String[] args) {
       Scanner read = new Scanner(System.in);
       int num1 = read.nextInt();
       int num2 = read.nextInt();

       //your code goes here
       double num3 = Math.pow(num1, num2);
       System.out.println(num3);
       
   }
}
