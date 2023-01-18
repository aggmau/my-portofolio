/*
Shopping Cart


You are building a Shopping Cart.
It is represented by a Cart struct, which holds the item prices in an array called prices.

Your program needs to take the number of items as input, followed by the prices of the items.
Initialize a Cart of that size, and add the prices to the Cart's array.
After that, call the Cart's show() method.
The show() method should output the total cost of the cart.

The given code includes comments as instructions.
Use a normal loop to take the inputs, and a range loop to calculate the sum of all prices.
Also, note that the prices are floats.
*/

package main
import "fmt"

type Cart struct {
    prices []float32
}
func (x Cart) show() {
    var sum float32 = 0.0
    //calculate the sum of all prices in the Cart
    for _, p := range x.prices {
      sum += p
    }
    fmt.Println(sum)
}

func main() {
  c := Cart{}
  var n int
  fmt.Scanln(&n)
  
  // take n inputs and add them to the Cart
  var item float32
  for i:=0;i<n;i++ {
    fmt.Scanln(&item)
    c.prices = append(c.prices, item)
  }
  //call the show() method of the Cart
  c.show()
}
