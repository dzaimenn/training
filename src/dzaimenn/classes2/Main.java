package dzaimenn.classes2;

public class Main {

    public static void main(String[] args) {
        Movie movie1 = new Movie("Inception", 2010);
        Movie movie2 = new Movie("Interstellar", 2014);

        MovieCollection collection = new MovieCollection(10);
        collection.addMovie(movie1);
        collection.addMovie(movie2);

        collection.listMovies();
    }
    
}