public class Movie {

    //String Attributes
    private String Tittle;
    private String directorName;
    private String movieGenre;

    //Interger Attributes
    private int yearCreated;
    private int movieLengthInMinutes;

    // Boolean Atributes
    private boolean movieColour;


    //contructor

    public Movie(String movieTittle, String directorName, String movieGenre, int yearCreated, int movieLengthInMinutes, boolean movieColour) {
        this.Tittle = Tittle;
        this.movieGenre = movieGenre;
        this.directorName = directorName;
        this.movieLengthInMinutes = movieLengthInMinutes;
        this.yearCreated = yearCreated;
        this.movieColour = movieColour;
    }

    //metoder. de skal bruges i den næste klasse for at inhente data herfra

    public String getTittle() {
        return Tittle;
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


//if the user wants to edit the movie
public String setTitle(String title) {
    this.Tittle = title;
    return "Has been changed to: "+title;
}

    public String setDirector(String director) {
        this.directorName = director;
        return "Has been changed to: "+director;
    }

    public String setGenre(String genre) {
        this.movieGenre = genre;
        return "Has been changed to: "+ genre;
    }

    public String setYearCreated(int yearCreated) {
        this.yearCreated = yearCreated;
        return "Has been changed to: "+yearCreated;
    }

    public String setLengthInMinutes(int lengthInMinutes) {
        this.movieLengthInMinutes= lengthInMinutes;
        return "Has been changed to: "+lengthInMinutes;
    }

    public String setmovieColour(boolean inColor) {
        this.movieColour = inColor;
        return "Has been changed to: "+inColor;
    }


    @Override
    public String toString() {
        String result = " ";result +="Title;´:" + " " + Tittle + "/n" + "  Genre:" + " " +  movieGenre + "/n " + " Director:"+ " " + directorName +
        "/n " + " Year:"+  " " + yearCreated + " /n" + " Duration:  " + movieLengthInMinutes+ " min /n "+ " Is the movie in colour? "+ " " + movieColour;
        if (movieColour==true) {
result += " coloured ";
        } else {
result += " black&White";
        }//

 return Tittle + directorName + movieGenre + yearCreated + movieLengthInMinutes + movieColour;

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