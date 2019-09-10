/*Create an application which will prompt the user to enter the name of their favorite Movie. Add the Movie to an
array list.  Use a loop to continue adding movies to the array until the user presses q or Q.

Once the user presses Q then print the list of movies before exiting the program.

HINT: You can use the .toLowerCase() method of the String class to convert the 'Q' to 'q'. So if your response is
stored in a variable called userAnswer then userAnswer.toLowerCase() will evaluate to a 'q'.
Alternatively, you can use the userAnswer.equalsIgnoreCase("q") method.

BONUS: Print out the list of movies sorted in alphabetical order.
BONUS x2: Suggest a movie to the user to watch by randomly selecting a movie from the list of movies entered.*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        ArrayList movies = new ArrayList<String>();
        String answer = "";

        System.out.println("\nWelcome to the movies list\n");

        while (!answer.equalsIgnoreCase("q")){
            System.out.println("Enter the name of a movie or \'q\' to quit: ");
            answer = kb.nextLine();

            if (!answer.equalsIgnoreCase("q"))
                movies.add(answer.toLowerCase());
        }

        System.out.println("List of movies\n" + movies);

        Collections.sort(movies);
        System.out.println("List of movies in alphabetical order\n" + movies);
    }
}