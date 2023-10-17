package dzaimenn.moviecatalog;

import java.util.ArrayList;
import java.util.Arrays;
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
        List<String> initialMovies = Arrays.asList("The Shawshank Redemption", "The Godfather", "The Dark Knight", "Inception");
        List<String> movies = new ArrayList<>();
        for (String movie : initialMovies) {
            movies.add(movie);
        }
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