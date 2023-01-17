/*
Menu


You are making a digital Menu App.
The menu choices are stored in an array called menu.

You need to take a number as input, which indicates the choice index, and output the corresponding item from the menu.
In case the index is not valid, your app should output "Invalid choice".
The input indicates the index of the array, meaning 0 corresponds to the first item.

Sample Input:
2

Sample Output:
Cake

*/

package main
import "fmt"

func main() {
  menu := [6]string{"Water", "Burger", "Cake", "Soup", "Soda", "Fries"}
  
  //your code goes here
  var input int
  fmt.Scanln(&input)
  if input < 6 {
    fmt.Println(menu[input])
  } else {
    fmt.Println("Invalid choice")
  }
}
