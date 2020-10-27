import java.util.Scanner;
public class rockPaperScissors {
//global variables


static Scanner sc = new Scanner(System.in);
static final int ROCK = 1, PAPER = 2, SCISSORS = 3; 
static int wins = 0, losses = 0, ties = 0;
static int humanChoice, computerChoice;
public static void main(String[] args) {
//variables
        printIntro();
do { 
            getHumanChoice();
            getComputerChoice();
            printChoices();
            calculateWinner();
        } while (wantToPlayAgain());
        printStats();
    }
public static void printIntro() {
int x;
//intro text


System.out.println("Rock, Paper, Scissors");
System.out.println("----------------------");
System.out.println("Good luck, human ...");   
    }
public static void getHumanChoice() {
//user input 
System.out.print("\nWhat do you throw? [1] Rock, [2] Paper, [3] Scissors ");
        humanChoice = sc.nextInt();
    }
    
public static void getComputerChoice() {
//computer answer (random)
        computerChoice = (int) (Math.random() * 3 + 1);
    }
public static void printChoices() {
//records throws 

if (humanChoice == ROCK) 
System.out.print("You threw Rock! ");
else if (humanChoice == PAPER) 
System.out.print("You threw Paper! ");
else if (humanChoice == SCISSORS) 
System.out.print("You threw Scissors! ");
if (computerChoice == ROCK)     
System.out.println("I threw Rock!");
else if (computerChoice == PAPER) 
System.out.println("I threw Paper!");
else if (computerChoice == SCISSORS) 
System.out.println("I threw Scissors!");
    }
public static void calculateWinner() {
if (humanChoice == computerChoice) {
System.out.println("Wow, a tie!?");
            ties++;
        } else if (humanChoice == ROCK && computerChoice == SCISSORS || humanChoice == PAPER && computerChoice == ROCK || humanChoice == SCISSORS && computerChoice == PAPER) {
System.out.println("Nooo!  I lost?  But how?");
            wins++;
        } else {
System.out.println("Haha, I win!");
            losses++;
        }
    }
public static boolean wantToPlayAgain() {
//asks play again  

//returns true or false- y/n
System.out.print("Do you want to play again? [y,n]: ");
String answer = sc.next();
return answer.equals("Y") || answer.equals("y");
         }
    
public static void printStats() {
// stats at the end of the game.
System.out.println("\nGood game!");
System.out.println("****************************************");
System.out.println("Wins:   " + wins);
System.out.println("Losses: " + losses);
System.out.println("Ties:   " + ties);
    }
}