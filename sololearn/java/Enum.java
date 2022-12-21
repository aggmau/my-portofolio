/*
Enums

Our shooter video game has 3 difficulty options - EASY, MEDIUM, HARD.
For each difficulty level, the player has a corresponding number of bullets.
The program you are given defines Player class and Difficulty Enum, and creates 3 Player objects with different difficulties as parameters for the constructor.
Complete the Player constructor, which takes the Enum as a parameter to check number of bullets for each difficulty option and output the corresponding message:
EASY => "You have 3000 bullets"
MEDIUM => "You have 2000 bullets"
HARD => "You have 1000 bullets"
*/
class Main {

    public static void main(String[] args) {
        
        Player player1 = new Player(Difficulty.EASY);
        Player player2 = new Player(Difficulty.MEDIUM);
        Player player3 = new Player(Difficulty.HARD);
   }
}
enum Difficulty {
    EASY,
    MEDIUM,
    HARD
}

public class Player{
    Player(Difficulty diff){
        //your code goes here
        switch(diff){
            case EASY: 
                System.out.println("You have 3000 bullets");
                break;
            case MEDIUM:
                System.out.println("You have 2000 bullets");
                break;
            case HARD:
                System.out.println("You have 1000 bullets");
        }
    }
}
