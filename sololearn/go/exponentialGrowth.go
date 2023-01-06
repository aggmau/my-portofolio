/*
Exponential Growth


The population of rabbits at a lab doubles every year.

The lab was started initially with 7 rabbits. Your program needs to calculate the number of rabbits you will have after the number of years provided as input.

Sample Input:
4

Sample Output:
112

Use a loop to calculate the number of rabbits after each year.
*/

package main

import "fmt"

func main() {
    var years int
    fmt.Scanln(&years)
    //your code goes here
    num := 7
    for i:=1; i <= years; i++{
        num *= 2
    }
    fmt.Println(num)
}
