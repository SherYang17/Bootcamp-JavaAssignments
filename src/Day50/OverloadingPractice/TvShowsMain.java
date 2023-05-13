package Day50.OverloadingPractice;

import java.util.ArrayList;
import java.util.Scanner;
public class TvShowsMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<TVShows> enterTVshows = new ArrayList<>();

        while(true) {
            System.out.println("Name of the show: ");
            String showName = scanner.nextLine();

            if(showName.isEmpty()) {
                break;
            }

            System.out.println("How many episodes? ");

            int numberOfEpisodes = Integer.valueOf(scanner.nextLine());
            // classic statement above works but using scanner.nextInt(), you have to call scanner.nextline() next.
            // int numberOfEpisodes = scanner.nextInt();
            // scanner.nextLine(); // https://stackoverflow.com/questions/13102045/scanner-is-skipping-nextline-after-using-next-or-nextfoo#:~:text=It's%20because%20when%20you%20enter,buffer%20from%20the%20first%20input.

            System.out.println("What is the genre? ");
            String genre = scanner.nextLine();

            enterTVshows.add(new TVShows(showName, numberOfEpisodes, genre));
            // Can do this but above line simplifies
            // TvShow tvShow = new TvShow(showName, numEpisodes, genre);
            // tvShows.add(tvShow);
        }

        for(TVShows omg : enterTVshows) {
            System.out.println(omg); // tvShows outputs 2 arrays in 1 row??
        }

    }
}
//