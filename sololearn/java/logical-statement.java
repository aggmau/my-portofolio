/*
Logical Statements

You're a tour manager and need a program that will identify small countries.
A country is considered small if its population is under 10000 and its area is under 10000 hectares.
The given program takes population and area as input.

Task
Complete the program to output "small country" if both conditions are met. 
Don't output anything otherwise.
Sample Input
9955
7522
Sample Output
small country
*/

import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
       Scanner read = new Scanner(System.in);
       int population = read.nextInt();
       int area = read.nextInt();
        //Complete the code
        if (population < 10000 && area < 10000) {
           System.out.println("small country");
        }
   }
}
