import java.util.Scanner;
public class GettingGreater{
  public static void main (String[] args){

    System.out.println("Getting the Greater Value");
    Scanner scanner = new Scanner (System.in);
    System.out.print("Enter first character: ");
    char ch1 = scanner.next().charAt(0);
    System.out.print("Enter second character: ");
    char ch2 = scanner.next().charAt(0);
    int max = Math.max (ch1,ch2);
    char maxchar = (char) max;

    System.out.println("---------------------");
    System.out.println("The character with grater value is: " + maxchar);
    System.out.println("---------------------");

    System.out.println("Showing ASCII Codes");
    System.out.println(ch1 + ":" + (int)ch1);
    System.out.println(ch2 + ":" + (int)ch2);
  }
}