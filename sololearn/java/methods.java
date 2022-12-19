/*
Methods

You are creating a robot, "Welcomer 2000", that never fails to greet a single person it encounters. 
You provide the number of people that will enter the room, and the robot will shout "Welcome" that number of times.
The program you are given already takes a number as input and calls the method according provided count. 
The issue is that the method is incomplete. Fix it.

Sample Input
2

Sample Output
Welcome!
Welcome!
*/

import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
       Scanner read = new Scanner(System.in);
       int numberOfPeople = read.nextInt();
       
       for (int i = 0; i < numberOfPeople; i++) {
           welcome();
       }
   }
   public static void welcome() {
       //complete the method
       System.out.println("Welcome!");
       
   }
}
