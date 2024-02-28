

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public  static void main (String[] args){
      Userinterface ui = new Userinterface();
      ui.startProgram();

  }

}
/*
public void Menu()/
        Scanner scanner = new Scanner(System.in);

        Controller Moviecontroller = new Controller();
        int UserChoice = 0;

        // \n is an escape sequence that represents a newline character. It is used to insert a line break or start a new line in strings or output.
        // When the \n escape sequence is encountered in a string literal or a character literal, it is replaced by the actual newline character
        ;

        while (UserChoice != 5) { //menuen
            System.out.println(" Welcome to this cool movie collection");
            System.out.println("Type the following commands to add, search,remove & edit the collection");
            System.out.println(" 1: Add Movie");
            System.out.println("2: Movie Collection");
            System.out.println("3: Search for a movie within the collection");
            System.out.println("4: Remove movie from the collection ");
            System.out.println("5:Exit the program ");
            System.out.println(" Enter your choice");
            UserChoice = scanner.nextInt();

            scanner.nextLine(); // user answers here




            boolean movieColour = false;
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

String UserAnswer= scanner.nextLine();
                boolean moviecolour;
                if (UserAnswer.equals("yes")) {
                  movieColour= true;

                }

                Movie movie = new Movie(movieTittle,movieGenre, movieDirector, yearCreated,movieLengthInMinutes , movieColour);

                System.out.println("Tittle:" + " " + movie.getMovieTittle());
                System.out.println("Genre:" + " " + movie.getMovieGenre());
                System.out.println("Director: " + " " + movie.getDirectorName());
                System.out.println("Year created:" + " " + movie.getYearCreated());
                System.out.println("Movie Duration:" +" " + movie.getMovieLengthInMinutes());
                System.out.println("Movie in colour:" +" " + movie.getmovieColour());
                System.out.println("Movie successfully added to the collection ");

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

    }

}
*/

//Eksempel på hvordan man laver et valg om film er i fave eller ik, med if statement.
         /*    String isInColour;
               isInColour= scanner.next();
                Moviecolour= Boolean.parseBoolean(isInColour.toLowerCase());
                if(isInColour.equals("ja")){
                    isInColour= String.valueOf(true);
                }*/