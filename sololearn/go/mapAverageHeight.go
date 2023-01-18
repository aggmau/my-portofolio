/*
Average Height


The heights of a basketball team are stored in a map.
You need to calculate and output the average height of the team.

Use a for loop to iterate over the map and calculate the average height.
To find the average, you need to calculate the sum of all the heights and divide it by the number of players.
*/

package main
import "fmt"

func main() {
    team := map[string]float32{
        "P1": 1.98, 
        "P2": 2.05,
        "P3": 1.89,
        "P4": 2.0,
        "P5": 2.11}

    var sum float32 = 0.0
    for _, element := range team {
        sum += element
    }
    fmt.Println(sum/5)
}
