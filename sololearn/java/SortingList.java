/*
Sorting Lists

The program you are given declares ArrayList of integers.
Complete the program to take numbers as input and add them to ArrayList until its size isn't equal to 5. 
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[ ] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        
        Scanner scanner = new Scanner(System.in);
        
        while(nums.size()<5){
            int num = scanner.nextInt();
            //your code goes here
            nums.add(num);
        }
        
        //your code goes here
        System.out.println(Collections.max(nums));
        System.out.println(Collections.min(nums));
    }
}Then output its maximum and minimum values.

Sample Input
4
12
3
88
96

Sample Output
96
3
*/

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[ ] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        
        Scanner scanner = new Scanner(System.in);
        
        while(nums.size()<5){
            int num = scanner.nextInt();
            //your code goes here
            nums.add(num);
        }
        
        //your code goes here
        System.out.println(Collections.max(nums));
        System.out.println(Collections.min(nums));
    }
}
