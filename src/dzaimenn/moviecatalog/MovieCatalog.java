package dzaimenn.moviecatalog;

import java.util.ArrayList;
import java.util.List;

public class MovieCatalog {

    public static void main(String[] args) {
        System.out.println("Welcome to the Movie Catalog!");

        List<String> movies = initializeMovies();
        displayMovies(movies);

        String searchMovie = "Inception";
        boolean found = searchMovie(movies, searchMovie);
        if (found) {
            System.out.println("The movie '" + searchMovie + "' is in the catalog.");
        } else {
            System.out.println("The movie '" + searchMovie + "' is not in the catalog.");
        }
    }

    private static List<String> initializeMovies() {
        List<String> movies = new ArrayList<>();
        movies.add("The Shawshank Redemption");
        movies.add("The Godfather");
        movies.add("The Dark Knight");
        movies.add("Inception");
        return movies;
    }

    private static void displayMovies(List<String> movies) {
        System.out.println("Movies in the catalog:");
        for (String movie : movies) {
            System.out.println(movie);
        }
    }

    private static boolean searchMovie(List<String> movies, String searchMovie) {
        for (String movie : movies) {
            if (movie.equalsIgnoreCase(searchMovie)) {
                return true;
            }
        }
        return false;
    }

}