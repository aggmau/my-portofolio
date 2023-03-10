/*
Increment & Decrement
Tom and Bob are playing a board game, in which both players start with the same number of points. 
Tom won the first game and got 1 point, while Bob lost the game, and therefore lost 1 point.
You are given a program that is intended to take the initial score and increase Tom's score by 1 and decrease Bob's score by 1.
But something is wrong: the program outputs the scores without the change.

Task
Fix the program to result in the expected outputs.
Sample Input
5
Sample Output
Round 1 results:
6
4
Explanation
Both players had 5 points at the start of the game. 
After the first game, Tom gained 1 point (6, the first outputted number), and Bob lost 1 point (4, the second outputted number).
*/

import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       //taking initial score
       int initScore = scanner.nextInt();
       int scoreTom = initScore;
       int scoreBob = initScore;
       
       System.out.println("Round 1 results:");
       //fix
       System.out.println(++scoreTom);
       System.out.println(--scoreBob);
   }
}
