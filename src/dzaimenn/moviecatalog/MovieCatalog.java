package dzaimenn.moviecatalog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MovieCatalog {

    public static void main(String[] args) {
        System.out.println("Welcome to the Movie Catalog!");

        MovieLibrary library = new MovieLibrary();
        library.addMovies(Arrays.asList("The Shawshank Redemption", "The Godfather", "The Dark Knight", "Inception"));
        library.displayMovies();

        String searchMovie = "Inception";
        boolean found = library.searchMovie(searchMovie);
        if (found) {
            System.out.println("The movie '" + searchMovie + "' is in the catalog.");
        } else {
            System.out.println("The movie '" + searchMovie + "' is not in the catalog.");
        }
    }
}

class MovieLibrary {
    private List<String> movies;

    public MovieLibrary() {
        movies = new ArrayList<>();
    }

    public void addMovie(String movie) {
        movies.add(movie);
    }

    public void addMovies(List<String> movieList) {
        movies.addAll(movieList);
    }

    public void displayMovies() {
        System.out.println("Movies in the catalog:");
        movies.forEach(System.out::println);
    }

    public boolean searchMovie(String searchMovie) {
        Predicate<String> moviePredicate = movie -> movie.equalsIgnoreCase(searchMovie);
        List<String> foundMovies = movies.stream().filter(moviePredicate).collect(Collectors.toList());
        return !foundMovies.isEmpty();
    }
    
}