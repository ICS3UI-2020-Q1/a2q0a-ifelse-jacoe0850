import java.util.Scanner;
/**
 *
 * @author 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a Scanner for user input
    Scanner input = new Scanner(System.in);
        // store how old you must be to get your license
        final int LICENSE_AGE = 16;
    // get the user's age and store it for later
    System.out.println("Please enter your age:");
    int age = input.nextInt();
      // check to see if they are old enough to get a license
if (age >= 16){
   System.out.println("You can get your driver's license!");
  }else{System.out.println("Sorry, you are not old enough to drive.");
    }
}
}
