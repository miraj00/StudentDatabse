import java.util.Scanner;

public class StudentDatabase {
	public static void main(String[] args) {
		String[] students = {"Maximilian", "Amanda", "Akhirah", "Miraj", "Andrew", "Austin",
				"Ford", "Cedric", "Chloe", "Sierra"};
		
		String[] hometowns = {"Detroit, MI", "Flint, MI", "Lansing, MI", "Owosso, MI", "Rochester Hills, MI",
				"Beverly Hills, MI", "Ferndale, MI", "Royal Oak, MI", "Auburn Hills, MI", "Troy, MI"};
		
		String[] favoriteFoods = new String[10];
		favoriteFoods[0] = "Detroit-Style Pizza";
		favoriteFoods[1] = "Coney Dogs";
		favoriteFoods[2] = "Mackinac Island Fudge";
		favoriteFoods[3] = "Vernors";
		favoriteFoods[4] = "Faygo";
		favoriteFoods[5] = "Biggby Coffee";
		favoriteFoods[6] = "Pasties";
		favoriteFoods[7] = "Poutine";
		favoriteFoods[8] = "Better Made Chips";
		favoriteFoods[9] = "Blake's Apple Cider";
		
		Scanner scan1 = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		Scanner scan3 = new Scanner(System.in);
		
		System.out.println("To our Java Class!");
		
		boolean askingUser = true;
		while (askingUser) {
			System.out.println();
			System.out.println("Which student would you like to know more about?");
			System.out.print("Enter a number 1 - 10: ");
			
			int requestedNum = 0;
			String foundStudent = "";
			int numIndex = -1;
			
			try {
	            	requestedNum = scan1.nextInt();
	            	numIndex = requestedNum -1;
	            	foundStudent = students[numIndex];
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println();
	            	System.out.println("Sorry, we don't have a student with that number.");
	            	System.out.println("Please enter a number between 1 and  10 & let's try again!");
			}  
			
			while (foundStudent != "") {
				System.out.println();
			      System.out.println("Student Number "+requestedNum+" is "+foundStudent+".");  	
			      System.out.println();
	        		System.out.println("What would you like to know about "+foundStudent+"?");
	        		System.out.println("You can choose Hometown or Favorite Food.");
	        		System.out.print("Your selection: ");
	        		String userChoice = scan2.nextLine();    
	        	
	        		if (userChoice.equalsIgnoreCase("hometown")) {
	        			System.out.println(findStudentHometown(hometowns, numIndex, foundStudent));
					foundStudent = "";
				}
	        		else if (userChoice.equalsIgnoreCase("favorite food")) {
	        			System.out.println(findStudentFaveFood(favoriteFoods, numIndex, foundStudent));
					foundStudent = "";
				}
	        		else {
	        			System.out.println("");
	        			System.out.println("Sorry, that was not a valid choice. Let's try again.");
	        	}
	        	       	
			boolean promptingToContinue = true;
			while (promptingToContinue) {
				System.out.println("");
				System.out.println("Would you like to know more about another Student?");
				System.out.println("Enter Yes to continue or No to Exit the Program.");
				System.out.print("Your selection: ");
				String userContinues = scan3.nextLine();
					
				if (userContinues.equalsIgnoreCase("yes")) {
					promptingToContinue = true;
					
					
					
				}
				else if (userContinues.equalsIgnoreCase("no")) {
					askingUser = false; 
					promptingToContinue = false;
				}
				else {
					System.out.println();
					System.out.println("Sorry, I didn't understand that response. Please try again.");
				}
			}
		}
			System.out.println();
			System.out.println("Thanks for checking out this program about our Java class!");
			System.out.println("Goodbye!");
		}
	}
	
	public static String findStudentFaveFood(String[] favoriteFoods, int numIndex, String foundStudent) {
		String foundStudentFaveFood = favoriteFoods[numIndex];
		System.out.println();
		String result = foundStudent+"'s favorite food is "+foundStudentFaveFood+".";
		return result;
	}
	
	public static String findStudentHometown(String[] hometowns, int numIndex, String foundStudent) {
		String foundStudentHometown = hometowns[numIndex];
		System.out.println();
		String result = foundStudent+"'s hometown is "+foundStudentHometown+".";
		return result;
	}
}


// ========================================================================================================================================


/*
import java.io.*;
import java.util.Scanner;

public class StudentDatabase {
	
	public static void main(String[] args) {
		
		String[] name = new String[10];
		String[] hometown = new String[10];
		String[] favoriteFood = new String[10];
				
		name[0] = "Miraj";
		name[1] = "Yomesh";
		name[2] = "Raj";
		name[3] = "Parth";
		name[4] = "Jayesh";
		name[5] = "Popat";
		name[6] = "Varun";
		name[7] = "Sunil";
		name[8] = "Sonia";
		name[9] = "Vibhur";

		hometown[0] = "piscataway";
		hometown[1] = "Edison";
		hometown[2] = "Metuchen";
		hometown[3] = "Hillsborough";
		hometown[4] = "Parsipany";
		hometown[5] = "Philipsburg";
		hometown[6] = "Elizabeth";
		hometown[7] = "Newark";
		hometown[8] = "Rahway";
		hometown[9] = "New Brunswick";
		
		favoriteFood [0]="Guava";
		favoriteFood [1]="Papaya";
		favoriteFood [2]="Apple";
		favoriteFood [3]="Banana";
		favoriteFood [4]="Grapes";
		favoriteFood [5]="Pineapple";
		favoriteFood [6]="Berries";
		favoriteFood [7]="Cherry";
		favoriteFood [8]="Jamboo";
		favoriteFood [9]="Sitafal";
					
	System.out.println("Welcome to our Java class. Which student would you like to learn more about? (enter a number 1-10): " );	
		
	Scanner scan = new Scanner(System.in);
	int num = scan.nextInt();
	
    int i = num-1; 
	
	try {
		
		if (i>0 && i<=10) {
		
		  System.out.println("Student " + num + " is " + name[i] + ".");				
		  System.out.println("What would you like to know about " + name[i] +"? (enter 'hometown' or 'favorite food':)");
	    }
		
	}
	catch (IndexOutOfBoundsException e){
		System.out.println("That student does not exist. Please try again.(enter a number 1-10): ");	
	main(null);
	} 
	  

	
	Scanner question2 = new Scanner(System.in);
	String answer = question2.nextLine();

	String town = "hometown";
	String favFood = "favorite food";
		
	
	
		if (town.equalsIgnoreCase(answer)) {
			System.out.println(name[i] + " is from " + hometown[i]);
			System.out.println("Would you like to know more ?( enter 'yes' or 'no'): ");
			
			Scanner sc = new Scanner(System.in);
			String yes = sc.nextLine();
			
			String y = "yes";
			if (y.equalsIgnoreCase(yes)) {
				System.out.println(name[i] + "'s favorite food is " + favoriteFood[i]);
			} else {
				System.out.println("Thanks !");
				main(null);
			}
			
			
		} else if (favFood.equalsIgnoreCase(answer)) {
			System.out.println(name[i] + "'s favorite food is " + favoriteFood[i]);
			System.out.println("Would you like to know more ?( enter 'yes' or 'no'): ");
	
			Scanner sc = new Scanner(System.in);
			String yess = sc.nextLine();
			
			String ya = "yes";
			if (ya.equalsIgnoreCase(yess)) {
				System.out.println(name[i] + " is from " + hometown[i]);
			} else {
				System.out.println("Thanks !");
				main(null);
			}
	
	
		} else {
			System.out.println("That data does not exist.  Please try again. (enter or 'hometown' or 'favorite food'): ");
		}
	
	}

}

*/




//  ================================================== Requirements  =============================================================================




/*
STUDENT DATABASE
Arrays, Input Validation
Task:  Write a program that will recognize invalid inputs when the user requests information about students in a class.    

What will the application do?
Provide information about students in a class of at least 10 people
Prompt the user to ask about a particular student 
Give proper responses according to user-submitted information 
Ask if the user would like to learn about another student
Validate user choices and ask again if they provide an invalid number or information type.

Build Specifications
Store the information about students in three "parallel" arrays: one for name, one for hometown, and one for favorite food
Account for invalid user input with exceptions 
Try to incorporate IndexOutOfBoundsException

Hints:
Make it easy for the user – tell them what information is available
ZyBook Chapter 13
Use parallel arrays to hold the student data

Extended Challenges:
Create other exceptions and catch those too!


Console Preview: 

Welcome to our Java class.  Which student would you like to learn more about? (enter a number 1-10): 100

That student does not exist.  Please try again. (enter a number 1-10): 10

Student 10 is Kim Driscoll.  What would you like to know about Kim? (enter or “hometown” or “favorite food”): age

That data does not exist.  Please try again. (enter or “hometown” or “favorite food”): hometown

Kim is from Detroit, MI.  Would you like to know more? (enter “yes” or “no): no

Thanks! 


Grading Criteria:
There are ten possible points:
Three "parallel" arrays containing information about students: one for name, one for hometown, and one for favorite food
Prompt to select a specific student and returns the specified student
Prompt includes validation of input for a valid student upon selection
Prompt will continue to ask for valid student selection in a loop until valid input is provided
Prompt that will select specified hometown or favorite food for specified student
Prompt includes validation of input for hometown or favorite food prompt
Prompt will continue to ask for valid hometown or favorite food in a loop until valid input is provided
Incorporates IndexoutOfBoundsException in an appropriate way
Asks if user would like to know more, and behaves appropriately upon input
Prompt includes validation of input for prompt to know more information


*/