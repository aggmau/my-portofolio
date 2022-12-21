/*
Exception Handling

An online electronics store has 5 product categories - PCs, Notebooks, Tablets, Phones, and Аccessories.
The program you are given declares an array and stores that types into it.
Write a program to take N number as input and output the element of the array with N index. 
If the index is out of range, program should output "Wrong Option".

Sample Input
5

Sample Output
Wrong Option
*/

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner scanner = new Scanner(System.in);
	    int choice = scanner.nextInt();
	    
	    String[] categories = {"PCs", "Notebooks", "Tablets", "Phones", "Аccessories"};
	    
	    //complete the code
	    try {
	        System.out.println(categories[choice]);
	    } catch(Exception e) {
	        System.out.println("Wrong Option");
	    }
	}
}
