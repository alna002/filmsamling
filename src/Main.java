import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        MovieCollection myMovies = new MovieCollection();
        System.out.println( " Give the information about the movie to creat your personal movie collection");

        System.out.println( " movie tittle");
        String tittle = imput.nextLine();

        System.out.println( " movie genre");
        String  genre = imput.nextLine();

        System.out.println( " movie director");
        String director = imput.nextLine();

        System.out.println( " movie length in minmutes");
      int movieLength = imput.nextInt();

        System.out.println( " year created");
       int yearCreated = imput.nextInt();

        System.out.println( " whats is the s colour?" + " type true or false");
     boolean moviesColour = imput.nextBoolean();

        myMovies.newMovie(moviesColour, movieLength, director, yearCreated, genre, tittle);

        System.out.println("Movie successfully added ");
        }
    }
