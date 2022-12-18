/*
You are given code which outputs the properties of a vehicle, but something is wrong.
Fix the code to print the properties.

Output
Name: Toyota
Engine: 4.7
Year: 2019
*/

public class Program
{
    public static void main(String[] args) {
        //fix the variable types 
        String name = "Toyota";
        double engine = 4.7;
        int year = 2019;
       
        System.out.println("Name: " + name);
        System.out.println("Engine: " + engine);
        System.out.println("Year: " + year);
	}
}
