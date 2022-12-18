/*
For Loops
You are given code that takes the number of students who enter the university as input.
Let's greet them!

Task
Complete the program to output "Welcome" for each student.
Sample Input
2
Sample Output
Welcome
Welcome
*/

import java.util.Scanner;
public class Program
{
    public static void main(String[] args) {
	   Scanner scanner = new Scanner(System.in);
       int n = scanner.nextInt();
       for (int i=1; i<=n; i++){
           System.out.println("Welcome");
       }
	}
}
