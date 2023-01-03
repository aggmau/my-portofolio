/*Packaging


You work at a packaging company and need to create a program to calculate 
how many items will be packaged in the last box of a shipment.
A box fits 7 items. You have 1081 items to package for the shipment.

Your program needs to calculate 
and output how many items will remain the last box
after you package them in boxes of 7 items.
*/

package main
import "fmt"

func main() {
    items := 1081
    items %= 7
    fmt.Println(items)
}
