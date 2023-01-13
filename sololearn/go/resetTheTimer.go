/*
Reset the Timer


The given code declares a Timer struct, which is initialized in main().
You need to add a reset functionality to the program.

The reset() function needs to take a pointer to the struct as its argument and reset the seconds value to 0.
Do not change the code in main(). Add the reset() function, so that the code you are given works as expected.
*/

package main
import "fmt"

type Timer struct {
  id string
  seconds int
}

func main() {
    var x int
    fmt.Scanln(&x)
    t := Timer{"ABC", x}
    
    reset(&t)
    fmt.Println(t)
}

func reset(t *Timer){
  t.seconds = 0
}
