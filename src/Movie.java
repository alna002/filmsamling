public class Movie {

    //String Attributes
    private String movieTittle;
    private String directorName;
    private String movieGenre;

    //Interger Attributes
    private int yearCreated;
    private int movieLengthInMinutes;

    // Boolean Atributes
    private boolean movieColour;


    //contructor

    public Movie(String movieTittle, String directorName, String movieGenre, int yearCreated, int movieLengthInMinutes, boolean movieColour) {
        this.movieTittle = movieTittle;
        this.movieGenre = movieGenre;
        this.directorName = directorName;
        this.movieLengthInMinutes = movieLengthInMinutes;
        this.yearCreated = yearCreated;
        this.movieColour = movieColour;
    }

    //metoder. de skal bruges i den næste klasse for at inhente data herfra

    public String getMovieTittle() {
        return movieTittle;
    }

    public String getMovieGenre() {
        return movieGenre;
    }

    public String getDirectorName() {
        return directorName;
    }

    public int getMovieLengthInMinutes() {
        return movieLengthInMinutes;
    }

    public int getYearCreated() {
        return yearCreated;
    }

    public boolean getmovieColour() {
        return movieColour;
    }



    //I don’t want to see strange computer terms in the output, such as null or true/false.
    @Override
    public String toString() {
        String result = " ";result +="Title;´:" + " " + movieTittle + "/n" + "  Genre:" + " " +  movieGenre + "/n " + " Director:"+ " " + directorName +
        "/n " + " Year:"+  " " + yearCreated + " /n" + " Duration:  " + movieLengthInMinutes+ " min /n "+ " Is the movie in colour? "+ " " + movieColour;
        if (movieColour==true) {
result += " coloured ";
        } else {
result += " black&White";
        }//

 return movieTittle + directorName + movieGenre + yearCreated + movieLengthInMinutes + movieColour;

    }

}




//    @Override
//    public String toString() {
//        String UserChoice;
//        if (movieColour == true){
//            UserChoice="yes";
//        }else{
//            UserChoice="No";
//        }
//        return "Movie{" +
//                "movieTittle='" + movieTittle + '\'' +
//                ", directorName='" + directorName + '\'' +
//                ", yearCreated=" + yearCreated +
//                ", movieLengthInMinutes=" + movieLengthInMinutes +
//                ", movieColour=" + UserChoice +
//                ", movieGenre='" + movieGenre + '\'' +
//                '}';


/*String result = " ";result +="Title;´:" + " " + movieTittle + "/n" + "  Genre:" + " " +  movieGenre + "/n " + " Director:"+ " " + directorName +
        "/n " + " Year:"+  " " + yearCreated + " /n" + " Duration:  " + movieLengthInMinutes+ " min /n "+ " Is the movie in colour? "+ " " + movieColour;
        if (movieColour==true) {
result += " coloured ";
        } else {
result += " black&White";
        }//

//  return movieTittle + directorName + movieGenre + yearCreated + movieLengthInMinutes + movieColour;*/


/*public String toString() {
        String colourYesorNo= movieColour?"is movie in colour: yes ": " is movie in colour: No";
        return "Title;´:" + " " + movieTittle + "/n" + "  Genre:" + " " +  movieGenre + "/n " + " Director:"+ " " + directorName +
                "/n " + " Year:"+  " " + yearCreated + " /n" + " Duration:  " + movieLengthInMinutes+ " min /n "+ " Is the movie in colour? "+ " " + movieColour;

    }

}*/