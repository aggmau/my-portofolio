/*
Method Return Types

You are an assistant on a TV show where celebrities are dancing and 4 judges evaluate their performance and give them a score between 1 and 10.
The program you are given takes the scores as input.
Complete the method to take them as parameters, then calculate and return the average score.

Sample Input
6.0
4.0
5.0
3.0

Sample Output
4.5
*/

import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
       Scanner read = new Scanner(System.in);
       double score1 = read.nextDouble();
       double score2 = read.nextDouble();
       double score3 = read.nextDouble();
       double score4 = read.nextDouble();
       double avgScore = getAverageScore(score1, score2, score3, score4);
       System.out.println(avgScore);
   }
   //create your method here
   public static double getAverageScore(double score1, double score2, double score3, double score4) {
       double average = (score1+score2+score3+score4)/4;
return average;
   }
}
