public class Movie {
    private String movieTittle;
    private String directorName;
    private int yearCreated = 0;
    private int movieLengthInMinutes =0;
    private boolean movieColour;
    private String movieGenre;

    //contructor

    public Movie(String movieTittle, String directorName, int yearCreated, int movieLengthInMinutes,boolean movieColour, String movieGenre){
        this.movieTittle = movieTittle;
        this.movieGenre = movieGenre;
        this.directorName = directorName;
        this.movieLengthInMinutes = movieLengthInMinutes;
        this.yearCreated = yearCreated;
        this.movieColour = movieColour;
    }

    public int getMovieLengthInMinutes() {
        return movieLengthInMinutes;
    }

    public boolean isMovieColour() {
        return movieColour;
    }

    public int getYearCreated() {
        return yearCreated;
    }

    public String getMovieGenre() {
        return movieGenre;
    }

    public String getDirectorName() {
        return directorName;
    }

    public String getMovieTittle() {
        return movieTittle;
    }
}
