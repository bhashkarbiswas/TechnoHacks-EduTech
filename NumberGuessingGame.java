import java.util.Random;
import java.util.Scanner;

class Game{
    int computer;
    public Game(){
        Random rand = new Random();
        computer = rand.nextInt(100);
        System.out.println("Guess the Number From  1 to 100");
    }
    public int computerNo(){
        return computer;
    }
}
public class NumberGuessingGame {
    static int takeUserInput(){
        int user;
        System.out.println("Enter ");
        Scanner sc= new Scanner(System.in);
        user=sc.nextInt();
        return user;
    }

    static void isCorrectNumber(int i, int j){
        if(i==j){
            System.out.println("Correct Number Guessed!");
        }
        else if(i>j){
            System.out.println("Your No. is Bigger than Actual No.");
        }
        else {
            System.out.println("Your No. is Smaller than Actual No.");
        }
    }
    public static void main(String[] args) {
        int user=0,computer=0,itteration=0;
        Game g = new Game();
        do {
            user = takeUserInput();
            computer = g.computerNo();
//            System.out.println(user);
//            System.out.println(computer);
            isCorrectNumber(user, computer);
            itteration++;
        }while (user!=computer);
        System.out.println("YOU GUESSED THE NO. IN "+ itteration+" ITTERATIONS");

//        Create a class Game, which allows a user to play "Guess the Number" game once.
//
//        Game should have the following methods:
//        Constructor to generate the random number
//        takeUserInput() to take a user input of number
//        isCorrectNumber() to detect whether the number entered by the user is true
//        getter and setter for noOfGuesses
//        Use properties such as noOfGuesses(int), etc to get this task done!
    }
}