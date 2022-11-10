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