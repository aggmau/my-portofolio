/*
Match Results


You are making a program to analyze sport match results and calculate the points of the given team.
The match results are stored in an array called results.
Each match has one of the following results:
"w" - won
"l" - lost
"d" - draw

A win adds three points, a draw adds one point, and a lost match does not add any points.

Your program needs to take the last match result as input and append it to the results array.
After that, calculate and output the total points the team gained from the results.
*/

package main
import "fmt"

func main() {
    results := []string{"w", "l", "w", "d", "w", "l", "l", "l", "d", "d", "w", "l", "w", "d"}
    lastMatch := ""
    totalScore := 0

    fmt.Scanln(&lastMatch)
    results = append(results, lastMatch)

    for _, score := range results {
        if score == "w" {
            totalScore += 3
        } else if score == "d" {
            totalScore += 1
        } else {
            totalScore += 0
        }
    }
    fmt.Println(totalScore)
    
}
