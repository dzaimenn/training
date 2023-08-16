package dzaimenn.classes2;

class MovieCollection {
    private Movie[] movies;
    private int size;

    public MovieCollection(int capacity) {
        movies = new Movie[capacity];
        size = 0;
    }

    public void addMovie(Movie movie) {
        if (size < movies.length) {
            movies[size++] = movie;
        }
    }

    public void listMovies() {
        System.out.println("List of Movies:");
        for (int i = 0; i < size; i++) {
            System.out.println(movies[i].getTitle() + " (" + movies[i].getYear() + ")");
        }
    }

}