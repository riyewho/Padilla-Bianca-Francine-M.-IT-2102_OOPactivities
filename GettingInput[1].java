import java.util.Scanner;
public class GettingInput{
  public static void main (String[] args){
    Scanner scanner = new Scanner (System.in);
    System.out.print("Enter the year: ");
    int year = scanner.nextInt();
    String what = scanner.nextLine();
    System.out.print("Enter the genre: ");
    String genre = scanner.nextLine();
    System.out.print("Enter the album: ");
    String album = scanner.nextLine();
    System.out.print("Enter the song title: ");
    String song = scanner.nextLine();
    System.out.print("Enter the artist: ");
    String artist = scanner.nextLine();


    System.out.println("---------------------");
    System.out.println("SONG DETAILS");
    System.out.println("---------------------");

    System.out.println("Year Released: " + year);
    System.out.println("Genre: " + genre);
    System.out.println("Album: " + album);
    System.out.println("Title: " + song);
    System.out.println("Artist: " + artist);
    scanner.close();

  }

}