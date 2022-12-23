/*
Iterators

The program you are given declares a LinkedList of integers, takes 5 numbers from user, and add them to it.
Write a program to calculate and output the sum of them elements.

Sample Input
4
3
50
3
8

Sample Output
68
*/
import java.util.Scanner;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[ ] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> nums = new LinkedList<Integer>();
        while(nums.size()<5){
            int num = scanner.nextInt();
            nums.add(num);
        }
      
        int sum = 0;
        //your code goes here
        Iterator<Integer> it = nums.iterator();
        while (it.hasNext()){
            sum += it.next();
        }
        System.out.println(sum);
    }
}
