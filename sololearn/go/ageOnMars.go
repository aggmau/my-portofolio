/*
Age on Mars


How old would you be on Mars?
A year on Earth has 365 days, while a year on Mars has 687 days.

Create a program that takes your age in Earth years as input, and outputs the corresponding age on Mars.

The given program takes an integer as input and passes it to the mars_age() function as argument.
Complete the function to calculate and return the corresponding Mars age.

Sample Input:
42

Sample Output:
22
Note that the output is an integer.
Calculate the Earth days corresponding to the given age and divide it by the number of days in a year on Mars to get the result.
*/

package main
import "fmt"

func main() {
    var age int
    fmt.Scanln(&age)

    mars := mars_age(age)
    fmt.Println(mars)
}

func mars_age(age int) int {
    return (age*365/687)
}
