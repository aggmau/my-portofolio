/*
Employee Management


You are building an Employee Management system.
Each Employee has the following fields: name, age, position, and salary.

The given code creates an Employee with the provided values and generates output based on the data.
Complete the program by defining the Employee struct with the correct fields, so that the code in main() works as expected.
Make sure to use the correct data types for the struct fields.
*/

package main
import "fmt"


func main() {
    e1 := Employee{"James", 42, "Manager", 0}

    var x float32
    fmt.Scanln(&x)
    e1.salary = x
    
    fmt.Println("========")
    fmt.Println(e1.name + "(" + e1.position + ")")
    fmt.Println(e1.age)
    fmt.Println(e1.salary)
    fmt.Println("========")
}

type Employee struct {
    name string
    age int
    position string
    salary float32
}
