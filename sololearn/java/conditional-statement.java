/*
Conditional Statements

You have $12,000 to buy a car.
You're given a program which takes the price of car as an input.

Task
Output "yes" if the price is lower than or equal to 12,000.

Sample Input
11000

Sample Output
yes
*/

import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int price = scanner.nextInt();
       //complete the code
       if (price <= 12000){
       	System.out.println("yes");
       }
   }
}
