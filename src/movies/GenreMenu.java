package movies;

/**
 * 
 */
import java.util.*;
import java.util.TreeMap;

public class GenreMenu {

	public static TreeMap<Integer, String> getMenu() {
		// Declaring menu of movie genres
		TreeMap<Integer, String> genreMenu = new TreeMap<>(
				Map.of(1, "Animated", 2, "Comedy", 3, "Drama", 4, "Horror", 5, "Musical", 6, "SciFi"));
		return genreMenu;
	}

	public static void printMenu() {
		TreeMap<Integer, String> genreMenu = getMenu();
		// Display the menu
		// header row of the menu display
		System.out.printf("%-2s| %-13s|\n", "#", "Genre");
		System.out.println("_________________|");

		// loop to display items, using .get for the menu Map items.
		for (Integer genreNumber : genreMenu.keySet()) {
			System.out.printf("%-2d| %-13s|\n", genreNumber, genreMenu.get(genreNumber));
			System.out.println(".................|");
		}
	}

	public static String getGenre(int userChoice) {
		TreeMap<Integer, String> genreMenu = getMenu();
		return genreMenu.get(userChoice);
	}

}
