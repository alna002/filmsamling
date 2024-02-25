import java.util.ArrayList;

public class MovieCollection {

    private ArrayList<Movie> movieCollection1;// er er contructoren fra class Movie indhentet.

    //Contructor: Det er den ny contructor der skal indholde information fra class Movie. Den skal bagefter over i den næste classe som er en Controller.

// My movielist

    public  MovieCollection() {
        movieCollection1 = new ArrayList<>();
        movieCollection1.add(new Movie(" WHO TF DID I MARRY", " ReesaTeesa", "Drama/Horror", 2024, 120, true));
        movieCollection1.add(new Movie("WHO TF DID I MARRY", "RessaTeesa", "Drama/Horror", 2024, 120, true));
        movieCollection1.add(new Movie("Surviving Legion", "Reesa Teesa", "Drama/Horror", 2026, 45, true));
    }

    public String AddMovie(String movieTittle, String movieGenre, String directorName, int yearCreated, int movieLengthInMinutes, boolean movieColour) {
        Movie newMovie = new Movie(movieTittle, directorName, movieGenre, yearCreated, movieLengthInMinutes, movieColour);
        return movieTittle + " is added to the collection";
    }

    //As a movie enthusiast I want to see a list of all movies so that I can get an overview of my collection.
    public void MovieList() {
        System.out.println("List of movies");
        for (Movie m : movieCollection1) {
            System.out.println(m.toString());
        }


    }

    // removing the movie from the list
    public String removeMoviefromList(String title) {
        for (int i = 0; i <= movieCollection1.size(); i++) {
            Movie m = movieCollection1.get(i);
            if (m.getMovieTittle().equalsIgnoreCase(title)) {
                String removedMovieTitle = movieCollection1.get(i).getMovieTittle();
                movieCollection1.remove(i);
                return removedMovieTitle + " has been removed!";
            }
        }
        return " The movie you seached is not in the list";
    }

    //As a movie enthusiast I want to search for a specific movie so that I can see details about it.
//method
    public void SearchMovie(String tittle) {
        boolean hasfound = false;
        System.out.println("Search results can be seen below.");
        for (Movie m : movieCollection1) {
            if (m.getMovieTittle().toLowerCase().contains(tittle.toLowerCase())) ;
            System.out.println(m);
            hasfound = true;

        }
        if (!hasfound) {
            System.out.println(" The requested movie is not part of the collection");
        }

    }
}







// movie list med normal Arry.
  /*  private Movie[] movieList;
    int antalFilm = 0;

    public MovieCollection() {
        this.movieList = new Movie[5];
    }

    //parameter

    public void tilføjeFilm(String movieTittle, String directorName, int yearCreated, int movieLengthInMinutes, boolean movieColour, String movieGenre) {
        movieList[antalFilm++] = new Movie(movieTittle, directorName, yearCreated, movieLengthInMinutes, movieColour, movieGenre);
    }

    String newMovie;

    public void newMovie(String movieTittle, int directorName, String yearCreated, int movieLengthInMinutes, String movieColour, String movieGenre) {
/*
        for (Movie movie : newMovie) {
            String Movie = null;
            newMovie = Movie;
        }
        return;
        int length = movieList.length;
*/




