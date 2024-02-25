public class Controller {
// Denne class skal ikka har et main metode
       MovieCollection movieCollection1; // Classen movie collection bliver indkaldt her.

        //contructor  // her er contructoren fra class movieCollection.
       public Controller() {
movieCollection1 = new MovieCollection();
        }

        //metode: // i den method har jeg indtastet atributerne fra movieCollection.

        public String addnewMovietoMovieList (String movieTittle,String movieGenre , String directorName,int yearCreated,
        int movieLengthInMinutes, boolean movieColour){
         return   movieCollection1.AddMovie(movieTittle,movieGenre, directorName,yearCreated, movieLengthInMinutes, movieColour);

        }
//getters.
    public void getList() {
        movieCollection1.MovieList();
    }

    public void searchMovie(String title) {
        movieCollection1.SearchMovie(title);
    }

    public String removeMovie(String title) {
        return movieCollection1.removeMoviefromList(title);
    }


        /* //Arrylist
        Controller<Movie> moviesArryList = new Controller<Movie>();
*/

    }

