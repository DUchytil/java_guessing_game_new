

import java.lang.constant.Constable;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;



public class Main {
    public static void main(String[] args) {

        boolean stillPlaying = true;
        int guess = 0;

        //Creating an instance of Scanner class to collect input from the user
        Scanner readLine = new Scanner(System.in);

        //Creating instance of Game class to track game data
        Game currentGame = new Game();

        //Creating an array to store game stats in
        ArrayList<Game> gamesList = new ArrayList<>();

        //Loop to continue until user quits
        while(stillPlaying){

            //Game initialization logic
            if (currentGame.numOfGuesses == 0){

                System.out.println("Starting a new game...\n");

//                //Instantiating a new game object
//                Game currentGame = new Game();

                //Collecting user's name
                System.out.print("Please enter your name: ");
                currentGame.nameOfPlayer = readLine.nextLine();
                System.out.println(" ");

                //Initializing a random number and assigning value to
                currentGame.numToGuess = getRandomNumber();
                System.out.println(currentGame.numToGuess);
            }

            //Gathering guess
            guess = getGuess(readLine);

            //Quitting game if user enters 0
            if (guess == 0){
                break;
            }

            //Checking if player's guess was too high or too low
            if (guess > currentGame.numToGuess){
                System.out.println("Too high! Try again\n");
            }
            else if (guess < currentGame.numToGuess){
                System.out.println("Too low! Keep trying\n");
            }
            else {
                System.out.println("You guessed it! Great job!\n");
                break;
            }

            //Incrementing number of guesses
            currentGame.numOfGuesses++;

            //Adding game stats to a list
            gamesList.add(currentGame);

            //Writing game stats to a json file


        }

        System.out.println("Thanks for playing. Your number of guesses was " + (currentGame.numOfGuesses + 1));

        //Closing Scanner class object to release system resources
        readLine.close();



    }


    /*
    Function to gather user input
    * Parameter: none
    * Return: int entered by user
     */
    private static int getGuess(Scanner readInput){

        //Instantiating new Scanner object called "line"
//        Scanner readLine = new Scanner(System.in);

        //Printing prompt
        System.out.println("What's your guess? ");
        System.out.print("Guess: ");

        //Gathering and returning guess from user
        int guess = readInput.nextInt();

        //Returning ing guess
        return guess;
    }


    /*
    Function to return random number
    * Parameter: none
    * Return: random number
     */
    private static int getRandomNumber(){

        //Creating instance of Random class
        Random rand = new Random();

        //Calling nextInt method and setting result equal to randomNumber variable
        int randomNumber  = rand.nextInt(1, 101); //Generating a number between 1 and 100 (inclusive)

        return randomNumber;

    }




}

