import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

     Controller myMovies = new Controller();


        while (true) {
            System.out.println("Welcome movie collection. ");
            System.out.println("Do you want to add a movie to the collection? ");
            System.out.println(" press 1 to add movie or 2 to end program");
            int menuChoice = imput.nextInt();

            if (menuChoice == 1) {

                System.out.println(" Give the information about the movie to creat your personal movie collection");

                System.out.println(" movie tittle");
                String tittle = imput.nextLine();
imput.nextLine();
                System.out.println(" movie genre");
                String genre = imput.nextLine();

                System.out.println(" movie length in minmutes");
                int movieLength = imput.nextInt();

                imput.nextLine();
                System.out.println(" movie director");
                String director = imput.nextLine();

                System.out.println(" year created");
                int yearCreated = imput.nextInt();

                System.out.println(" Is the movie in colour or black&White? Answer Yes for colour or No for Black&White");

              String movieColourstring = imput.next();
              boolean movieColour;
                if (movieColourstring.equalsIgnoreCase("yes")){
                    movieColour = true;
                }else{
                    movieColour =false;
                }

                myMovies.addnewMovietoMovieList(tittle,genre,movieLength, yearCreated, movieColour, director);
                System.out.println(tittle + " " + genre + " " + movieLength + " " + director + " " + yearCreated + " " + movieColour);
                System.out.println("Movie successfully added to the collection ");


            } else if (menuChoice==2) {
                System.out.println("Sad to see you go");
                break;

            }

        }
        }
    }



//Eksempel på hvordan man laver et valg om film er i fave eller ik, med if statement.
         /*    String isInColour;
               isInColour= scanner.next();
                Moviecolour= Boolean.parseBoolean(isInColour.toLowerCase());
                if(isInColour.equals("ja")){
                    isInColour= String.valueOf(true);
                }*/