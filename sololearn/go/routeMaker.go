/*
Route Maker => learning about variadic function


You are making a program for a navigation system.
Your program needs to take a number N as input, followed by N strings, which represent city names.
Store the city names in a slice.
Declare a variadic function route(), which takes its arguments from the slice.
The route() function should output the route, which combines the city names using an arrow. Check the sample input/output for reference:

Sample Input:
3
Boston
Chicago
Washington

Sample Output:
Boston->Chicago->Washington->
*/

package main
import "fmt"

//create the route() function
func route(cities ...string) {
	result := ""
	for _, c := range cities {
		result = result + c + "->"
	}
	fmt.Println(result)
}

func main() {
    var n int
    fmt.Scanln(&n)

    var cities []string
    var ct string
    //take n strings as input and append them to the slice
    for i:=0; i < n;i++ {
    	fmt.Scanln(&ct)
    	cities = append(cities, ct)
    }
  
    //
    route(cities...)
}
