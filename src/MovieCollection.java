public class MovieCollection {
    private Movie[] movieList;
    int antalFilm = 0;

    public MovieCollection() {
        this.movieList = new Movie[5];
    }

    //parameter

    public void tilføjeFilm(String movieTittle, String directorName, int yearCreated, int movieLengthInMinutes, boolean movieColour, String movieGenre) {
        movieList[antalFilm++] = new Movie(movieTittle, directorName, yearCreated, movieLengthInMinutes, movieColour, movieGenre);
    }

    String newMovie;

    public void newMovie(boolean movieTittle, int directorName, String yearCreated, int movieLengthInMinutes, String movieColour, String movieGenre) {
/*
        for (Movie movie : newMovie) {
            String Movie = null;
            newMovie = Movie;
        }
        return;
        int length = movieList.length;
*/
    }
}
