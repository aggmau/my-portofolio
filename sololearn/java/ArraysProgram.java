/*
Arrays :
Your calendar program should output all the days of week, but it has errors.
Change the code so that the program prints the days.
*/

public class ArraysProgram {
   public static void main(String[] args) {
       String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
       for (int i = 0; i < 7; i++) {
           System.out.println(days[i]);
       }
   }
}
