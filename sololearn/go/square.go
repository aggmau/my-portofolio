/*
Square


You need to create a function which takes a number as its argument and returns its square.

Your program needs to take the number from input and pass it to the function, which should return the result.

*/

package main
import "fmt"

func main() {
    var x int
    fmt.Scanln(&x)

    res := square(x)
   fmt.Println(res)
}

func square(x int) int {
    return x*x
}
