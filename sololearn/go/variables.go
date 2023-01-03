/*
Contact Card


Your friend created a program that declares a number of variables to hold contact data and then outputs them.
However, the data types are wrong so the program does not work.
Fix the code by changing the data types of the variables to work with their given values.
*/
package main

import "fmt"

func main() {
    var city string = "New York"
    var country string = "USA" 
    var age int = 24
    var height float32 = 1.91
    
    fmt.Println("COUNTRY:")
    fmt.Println(country)
    fmt.Println("CITY:")
    fmt.Println(city)
    fmt.Println("AGE:")
    fmt.Println(age)
    fmt.Println("HEIGHT")
    fmt.Println(height)
}
