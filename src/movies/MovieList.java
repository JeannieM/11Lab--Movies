package movies;
/**
 * @author JeannieMcCarthy
 *
 */
import java.util.*;


public class MovieList {
	public static void main(String[] args) {
		//Declare vars
		final int MOVIE_NUMBER = 100;
		int userChoice;
		String genre;
		boolean goAgain = false;
		//Declaring movie List
		ArrayList<Movie> movies = new ArrayList<>();
		//Filling movie List with MovieIO inputs
		for (int i = 0; i < MOVIE_NUMBER; i++) {
			movies.add(MovieIO.getMovie(i+1));
		}
		//sort that shit
		movies.sort(null);
		//Trusty Scanner
		Scanner scnr = new Scanner(System.in);
		
		//greet user
		System.out.println("Welcome to the Movie List Application! Here are our available genres:\n");
		do {
		GenreMenu.printMenu();
		System.out.println();
		userChoice = Validator.getInt(scnr, "Please enter the genre number to see available movies of that genre: \n", 1, 6);
		//convert userChoice to string for comparison later
		genre = GenreMenu.getGenre(userChoice);
		//System.out.println(genre);
		
		for(Movie movie : movies) {
			//comparing string of user chosen genre to each movie in the list
			if (genre.equals(movie.getGenre())) {
				System.out.println(movie);
			}
		}
		//ask user if repeat desired
		System.out.println("Would you like to go again?");
		goAgain = Validator.goAgain(scnr);//REMEMBER THIS LINE OF CODE FOR REUSE IN FUTURE
		}while (goAgain);
		
		System.out.println("Enjoy the show! Goodbye.");
	}
}
