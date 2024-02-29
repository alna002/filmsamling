import java.util.ArrayList;
// Denne class skal ikka har et main metode
public class Controller {

    MovieCollection movieCollection; // Classen movie collection bliver indkaldt her.

    //contructor  // her er contructoren fra class movieCollection.
    public Controller() {
        movieCollection = new MovieCollection();
    }

    //metode: // i den method har jeg indtastet atributerne fra movieCollection.

    public String AddMovie(String movieTittle, String movieGenre, String directorName, int yearCreated,
                                         int movieLengthInMinutes, boolean movieColour) {
        return movieCollection.AddMovie(movieTittle, movieGenre, directorName, yearCreated, movieLengthInMinutes, movieColour);

    }

    //getters.
    public void getList() {

        movieCollection.MovieList();
    }

    public String searchMovie(String title) {
       // System.out.println("from controller" + title);
        movieCollection.SearchMovie(title);
        return title;

    }

    public String removeMovie(String title) {
        return movieCollection.removeMoviefromList(title);
    }


    public String editMovie(String title, ArrayList<String> editValues) {
        return movieCollection.editMovie(title, editValues);
    }

}
/*String title;
    /*public boolean Editmovie(String tittle, Movie updatedMovie) {
   Movie movieToEdit = searchMovie (String tittle);
        if (movieToEdit != null) {
            movieToEdit.setTitle(updatedMovie.getTittle());
            movieToEdit.setGenre(updatedMovie.getMovieGenre());
            movieToEdit.setDirector(updatedMovie.getDirectorName());
            movieToEdit.setLengthInMinutes(updatedMovie.getMovieLengthInMinutes());
            movieToEdit.setYearCreated(updatedMovie.getYearCreated());
            movieToEdit.setmovieColour(updatedMovie.getmovieColour());
            boolean b = true;
            return b;
        }


        return false;
        public void EditMovie(String tittle){
 *
        movieCollection1.editMovie(tittle);
    }
    }*/


        /*  } //Arrylist
        Controller<Movie> moviesArryList = new Controller<Movie>();
*/



