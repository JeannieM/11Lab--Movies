package movies;
/**
 * @author JeannieMcCarthy
 *
 */
public class Movie implements Comparable<Movie> {
	//Declaring 
	private String title = "untitled";
	private String genre = "uncategorized";

	
	//constructor
	public Movie(String title, String genre) {
		this.title = title;
		this.genre = genre;
	}
	
	//Override inherited toString method
	@Override
	public String toString() {
		return String.format("%35s |   %5s\n", title, genre);
	}
	
	public String getGenre() {
		return genre;
	}
	public String getTitle() {
		return title;
	}

	@Override
	public int compareTo(Movie movie2) {
		int comparisonVal;
		comparisonVal = title.compareTo(movie2.getTitle());
		return comparisonVal;
	}
	
}
