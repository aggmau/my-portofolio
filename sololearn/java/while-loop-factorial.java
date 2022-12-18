/*
While Loops
For your math class you need a program to calculate the factorial of a number.
You're given a program which takes a number as input.

Task
Complete the program to calculate the factorial of the given number and output it.

Sample input
6
Sample output
720
Explanation
The factorial of a number is equal to the product of all numbers less than or equal to the given number.
The factorial of 6 will be 6*5*4*3*2*1 = 720.
*/

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
            int  number = scanner.nextInt();
            int fact = 1;
            //your code goes here
            while (number >= 1) {
                fact *= number;
                number--;
            }
            System.out.println(fact);
    }
}
