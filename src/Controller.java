public class Controller {

      private  MovieCollection movieList;

        //contructor
       public Controller() {
           movieList = new MovieCollection();

        }


        //metode

        public void addnewMovietoMovieList (String movieTittle, String directorName,int yearCreated,
        int movieLengthInMinutes, boolean movieColour, String movieGenre ){
            movieList.AddMovie(movieTittle, directorName, yearCreated, movieLengthInMinutes, movieColour, movieGenre);

        }



        /* //Arrylist
        Controller<Movie> moviesArryList = new Controller<Movie>();
*/

    }

