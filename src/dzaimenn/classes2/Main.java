package dzaimenn.classes2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Movie movie1 = new Movie("Inception", 2010, "Christopher Nolan", List.of("Leonardo DiCaprio", "Joseph Gordon-Levitt"));
        Movie movie2 = new Movie("Interstellar", 2014, "Christopher Nolan", List.of("Matthew McConaughey", "Anne Hathaway"));
        Movie movie3 = new Movie("The Dark Knight", 2008, "Christopher Nolan", List.of("Christian Bale", "Heath Ledger"));

        MovieCollection collection = new MovieCollection();
        collection.addMovie(movie1);
        collection.addMovie(movie2);
        collection.addMovie(movie3);

        collection.listMovies();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to add more movies? (yes/no)");
        String answer = scanner.nextLine().trim().toLowerCase();
        while (answer.equals("yes")) {
            System.out.print("Enter the movie title: ");
            String title = scanner.nextLine();
            System.out.print("Enter the release year: ");
            int year = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter the director: ");
            String director = scanner.nextLine();
            System.out.print("Enter the number of actors: ");
            int numActors = Integer.parseInt(scanner.nextLine());
            List<String> actors = new ArrayList<>();
            for (int i = 0; i < numActors; i++) {
                System.out.print("Enter actor " + (i + 1) + ": ");
                actors.add(scanner.nextLine());
            }
            Movie newMovie = new Movie(title, year, director, actors);
            collection.addMovie(newMovie);
            System.out.println("Movie added successfully!");
            System.out.println("Do you want to add more movies? (yes/no)");
            answer = scanner.nextLine().trim().toLowerCase();
        }
    }

}