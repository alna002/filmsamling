import java.util.ArrayList;
import java.util.Scanner;

public class Userinterface {
    //public  static void main(String[] args) {}
    Controller movieController;
    Scanner scanner = new Scanner(System.in);

    public Userinterface() {
        movieController = new Controller();
    }

    boolean movieColour = false;
final int Sentinal = 6;

    public void startProgram() {
        int UserChoice = 0;

        while (UserChoice!=Sentinal){
            Menu();
            UserChoice = scanner.nextInt();
            scanner.nextLine();
            if (UserChoice == 1) {
                addMovie();

            }
           else if (UserChoice == 2) {
                MovieList();

            } else if (UserChoice == 3) {
                searchMovie();
                    /*System.out.println(" What is the tittle of the movie you are searching for?");
                    String tittle = scanner.nextLine(); // the user writes the tittle to search
                    movieController.searchMovie(tittle);*/
            } // the tittle will be searched in the movie list.
            else if (UserChoice == 4) {
                    /*System.out.println(" which movie tittle do you want to remove?");
                    String tittle = scanner.nextLine();
                    movieController.removeMovie(tittle);*/
                RemoveMovie();

            } else if (UserChoice == 5) {
                editMovie();


            } else if (UserChoice == 6) {
                System.out.println(" You are exiting the program");
            }
        }
        }

        private void Menu () {

            System.out.println(" Welcome to this cool movie collection");
            System.out.println("Type the following commands to add, search,remove & edit the collection");
            System.out.println(" 1: Add Movie");
            System.out.println("2: Movie Collection");
            System.out.println("3: Search for a movie within the collection");
            System.out.println("4: Remove movie from the collection ");
            System.out.println("5: Edit movie");
            System.out.println("6:Exit the program ");
            System.out.println(" Enter your choice");
            //UserChoice = scanner.nextInt();
            // scanner.nextLine(); //
        }

        private void addMovie () {

            //Scanner scanner = new Scanner(System.in);
            System.out.println("Give the information about the movie to creat your personal movie collection");

            System.out.println("movie tittle");
            String movieTittle = scanner.nextLine();
            /*scanner.nextLine();*/

            System.out.println("movie genre");
            String movieGenre = scanner.nextLine();

            System.out.println("movie director");
            String movieDirector = scanner.nextLine();

            System.out.println("year created");
            int yearCreated = scanner.nextInt();
            scanner.nextLine();
            System.out.println("movie length in minmutes");
            int movieLengthInMinutes = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Is the movie in colour or black&White? Answer Yes for colour or No for Black&White");
            String isinColour = scanner.nextLine().toLowerCase();

            String UserAnswer = scanner.nextLine();
            boolean moviecolour;
            if (UserAnswer.equals("yes")) {
                movieColour = true;

            } else {
            }

            Movie newMovie = new Movie(movieTittle, movieDirector, movieGenre, yearCreated, movieLengthInMinutes, movieColour);
            System.out.println(movieController.AddMovie(movieTittle, movieGenre, movieDirector, yearCreated, movieLengthInMinutes, movieColour));
        }

        private void searchMovie () {
            System.out.println("What is the tittle of the movie you are searching for? ");
            String movieTittle = scanner.nextLine();
            movieController.searchMovie(movieTittle);
        }
        String tittle;

        private void editMovie () {
            System.out.println(" type in  the movie tittle you want to edit ");

            String titleEdit = scanner.nextLine();
            movieController.searchMovie(titleEdit);
            ArrayList<String> editValues = new ArrayList<>();
            System.out.println( "you have to type information about the movie" );
            System.out.println("movie tittle");
            String newmovieTittle = scanner.nextLine();
            editValues.add(newmovieTittle);

            System.out.println("movie director");
            String newmovieDirector = scanner.nextLine();
            editValues.add(newmovieTittle);

            System.out.println("movie genre");
            String newmovieGenre = scanner.nextLine();
            editValues.add(newmovieTittle);

            System.out.println("year created");
            int newyearCreated = scanner.nextInt();
            editValues.add(newmovieTittle);
            scanner.nextLine();
            System.out.println("movie length in minmutes");
            int newmovieLengthInMinutes = scanner.nextInt();
            editValues.add(newmovieTittle);
            scanner.nextLine();

            System.out.println("Is the movie in colour or black&White? Answer Yes for colour or No for Black&White");
            String newmovieColour = scanner.nextLine().toLowerCase();
            editValues.add(newmovieTittle);
            System.out.println(" Movie information has been successfully changed ");


        }

        public void MovieList () {
            movieController.getList();
        }

        public void RemoveMovie () {
            System.out.println(" which movie tittle do you want to remove?");
            String removetittle = scanner.nextLine();
            movieController.removeMovie(tittle);
            movieController.searchMovie(removetittle);
        }

    }


               /* System.out.println("Tittle:" + " " + movie.getMovieTittle());
                System.out.println("Genre:" + " " + movie.getMovieGenre());
                System.out.println("Director: " + " " + movie.getDirectorName());
                System.out.println("Year created:" + " " + movie.getYearCreated());
                System.out.println("Movie Duration:" + " " + movie.getMovieLengthInMinutes());
                System.out.println("Movie in colour:" + " " + movie.getmovieColour());
                System.out.println("Movie successfully added to the collection ");*/











/*
// \n is an escape sequence that represents a newline character. It is used to insert a line break or start a new line in strings or output.
        // When the \n escape sequence is encountered in a string literal or a character literal, it is replaced by the actual newline character


       public void MovieMenu() {
            boolean movieColour = false;
            while (UserChoice != 5) {
                System.out.println(" Welcome to this cool movie collection");
                System.out.println("Type the following commands to add, search,remove & edit the collection");
                System.out.println(" 1: Add Movie");
                System.out.println("2: Movie Collection");
                System.out.println("3: Search for a movie within the collection");
                System.out.println("4: Remove movie from the collection ");
                System.out.println("5:Exit the program ");
                System.out.println(" Enter your choice");
                UserChoice = scanner.nextInt();
            }

            if (UserChoice == 1) {
                System.out.println("Give the information about the movie to creat your personal movie collection");

                System.out.println("movie tittle");
                String movieTittle = scanner.nextLine();

                System.out.println("movie director");
                String movieDirector = scanner.nextLine();

                System.out.println("movie genre");
                String movieGenre = scanner.nextLine();

                System.out.println("year created");
                int yearCreated = scanner.nextInt();
                scanner.nextLine();
                System.out.println("movie length in minmutes");
                int movieLengthInMinutes = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Is the movie in colour or black&White? Answer Yes for colour or No for Black&White");
                String isinColour = scanner.nextLine().toLowerCase();

                String UserAnswer = scanner.nextLine();
                boolean moviecolour;
                if (UserAnswer.equals("yes")) {
                    movieColour = true;

                }

            }
            if (UserChoice == 2) {
                Moviecontroller.getList();

            } else if (UserChoice == 3) {
                System.out.println(" What is the tittle of the movie you are searching for?");
                String tittle = scanner.nextLine(); // the user writes the tittle to search
                Moviecontroller.searchMovie(tittle);
            } // the tittle will be searched in the movie list.
            else if (UserChoice == 4) {
                System.out.println(" which movie tittle do you want to remove?");
                String tittle = scanner.nextLine();
                Moviecontroller.removeMovie(tittle);
            } else if (UserChoice == 5) {
                System.out.println(" Exit");
            }
        }

public void AddMovie() {

                Movie movie = new Movie(movieTittle, String movieGenre, String directorName, int yearCreated,int movieLengthInMinutes,boolean movieColour);

                System.out.println("Tittle:" + " " + movie.getMovieTittle());
                System.out.println("Genre:" + " " + movie.getMovieGenre());
                System.out.println("Director: " + " " + movie.getDirectorName());
                System.out.println("Year created:" + " " + movie.getYearCreated());
                System.out.println("Movie Duration:" + " " + movie.getMovieLengthInMinutes());
                System.out.println("Movie in colour:" + " " + movie.getmovieColour());




                System.out.println("Movie successfully added to the collection ");

            }


public void MovieList(){
                Moviecontroller.getList();
            }

            public void RemoveMovie(){
                    System.out.println(" which movie tittle do you want to remove?");
                    String tittle = scanner.nextLine();
                    Moviecontroller.removeMovie(tittle);

                }*/


