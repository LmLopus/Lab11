import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scnr = new Scanner(System.in);
		ArrayList<String> list = new ArrayList(Arrays.asList("Star Wars", "2001 Space Odyssey", "E.T.", "Halloween", "Hard Candy", "The Lord of the Rings", "The Godfather", "Les Misérables", "Princess and the Frog", "Pokemon"));
		
		
		boolean flag = true;
	do {	
		System.out.println("Welcome to the Movie List Application\r\n");
		System.out.println("There are 10 movies in the list.");
		System.out.println("What category are you interested in?");
		System.out.println("Science Fiction, Drama, Horror, Animated.");
		String categoryChosen = scnr.nextLine();
		
		
	
		try {
			if (categoryChosen.contentEquals("Science Fiction")) {
				 ArrayList<String> scifi = new ArrayList<String>(list.subList(0, 3));
			     System.out.println(scifi.toString());
			}
			else if (categoryChosen.contentEquals("Drama")) {
				 ArrayList<String> drama = new ArrayList<String>(list.subList(6, 8));
			     System.out.println(drama.toString());
			}
			else if (categoryChosen.contentEquals("Horror")) {
				 ArrayList<String> scifi = new ArrayList<String>(list.subList(3, 5));
			     System.out.println(scifi.toString());
			}
			else if (categoryChosen.contentEquals("Animated")) {
				 ArrayList<String> scifi = new ArrayList<String>(list.subList(8, 10));
			     System.out.println(scifi.toString());
			     
			}
			else {
				throw new InputMismatchException("That was not a valid input");
			}
			
			System.out.println("Would you like to continue? yes or no");
			
	
			String yesOrNo = scnr.nextLine();
			if(yesOrNo.equals("yes")){
				
			}
			else if (yesOrNo.equals("no")){
				System.out.println("Goodbye");
				flag = false;
			}
			else {
				throw new InputMismatchException("That was not a valid input)");
		}
		}catch (InputMismatchException e){
			throw new InputMismatchException("That was not a valid input");
		}
		} while (flag);
		}

}
