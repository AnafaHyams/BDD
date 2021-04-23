package java_basic_course.day_20_04_2021.task3;

import javax.swing.*;
import java.util.Random;

public class GuessRandomNumberGame {

    public static void main(String[] args) {
        Random random = new Random();
        int randomIntToGuess = random.nextInt(100);
        int userChoice;

        System.out.println("Random number: " + randomIntToGuess);

        do {
            userChoice = Integer.parseInt(JOptionPane.showInputDialog("Insert your guess (number between 0 to 100)"));

            if(userChoice < randomIntToGuess) {
                System.out.println("Your guess (" + userChoice + ") is lower than our number. Please try again.");
            } else if (userChoice > randomIntToGuess) {
                System.out.println("Your guess (" + userChoice + ") is higher than our number. Please try again.");
            }

            //System.out.println(userChoice);
        } while (userChoice != randomIntToGuess);

        System.out.println("Congratulations!");
        System.out.println("You succeeded to guess the random number!");
    }
}
