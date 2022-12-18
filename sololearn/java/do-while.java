/*
Do While Loops

You're creating a bank security system.
The user must insert the correct password in order to access payments.
The password is 8819.

Task
Write a program that will continuously take a password as input and output Write password, until the client inserts the correct password.
Sample Input
3332
8819
Sample Output
Write password
Write password
*/
import java.util.Scanner;
public class Program
{
    public static void main(String[] args) {
	   Scanner read = new Scanner(System.in);
           int password;
        do {
            password = read.nextInt();
            System.out.println("Write password");
        } while(password != 8819);
          
	}
}
