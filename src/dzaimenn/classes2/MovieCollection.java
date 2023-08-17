package dzaimenn.classes2;

import java.util.ArrayList;
import java.util.List;

class MovieCollection {
    private List<Movie> movies;

    public MovieCollection() {
        movies = new ArrayList<>();
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public void listMovies() {
        System.out.println("List of Movies:");
        for (Movie movie : movies) {
            System.out.println("Title: " + movie.getTitle());
            System.out.println("Year: " + movie.getYear());
            System.out.println("Director: " + movie.getDirector());
            System.out.println("Actors: " + movie.getActors());
            System.out.println();
        }
    }

}