/*
Scale Factor


You are building a program that needs to scale numbers by the given factor.
The number and scale factor should be provided as input and passed to a function called scale(), which should then scale the number.
The scale() function needs to scale the number in-place using a pointer.

Sample Input:
4
1.5

Sample Output:
6

The code in main() already takes the required inputs and calls the function.
Note, that the scale factor is a float.
*/

package main
import "fmt"

func main() {
    var num float32
     var factor float32

    fmt.Scanln(&num)
    fmt.Scanln(&factor)

    scale(&num, factor)
    fmt.Println(num)
}

func scale(ptr *float32, factor float32) {
    *ptr *= factor 
}
