/*
ArrayList

The program you are given declares an even nums ArrayList.
Write a program to take numbers as input and add them an ArrayList while the size of the ArrayList isn't equal to 3.
Then calculate and output the average of all values in integers.

Sample Input
5
2
4


Sample Output
3
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[ ] args) {
	    Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> evennums = new ArrayList<Integer>();
        
        while(evennums.size()<3){
            int num = scanner.nextInt();
            //your code goes here
            evennums.add(num);
        }
        
        int val = 0;
        //calculate and output the average integer value
        for (int i=0; i < evennums.size(); i++){
             val += evennums.get(i);
        }
        System.out.println(val/evennums.size());
    }
}
