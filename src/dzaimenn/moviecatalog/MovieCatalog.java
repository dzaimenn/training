package dzaimenn.moviecatalog;

import java.util.Arrays;
import java.util.List;

public class MovieCatalog {
    public static void main(String[] args) {
        System.out.println("Welcome to the Movie Catalog!");

        List<String> movies = Arrays.asList("The Shawshank Redemption", "The Godfather", "The Dark Knight", "Inception");
        displayMovies(movies);

        String searchMovie = "Inception";
        boolean found = movies.stream().anyMatch(movie -> movie.equalsIgnoreCase(searchMovie));
        if (found) {
            System.out.println("The movie '" + searchMovie + "' is in the catalog.");
        } else {
            System.out.println("The movie '" + searchMovie + "' is not in the catalog.");
        }
    }

    private static void displayMovies(List<String> movies) {
        System.out.println("Movies in the catalog:");
        movies.forEach(System.out::println);
    }
    
}