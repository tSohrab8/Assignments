import java.util.Scanner;

public class Assignments {
	public static void main(String[]args){
		//mathTwo 
		int mynumber = 2;
		double myothernumber = 1.7938;
		
		System.out.println("mynumber = " + mynumber + " myothernumber = " + myothernumber);
		
		//change program
		 int x;
		 double y,z;
		 
		 x = 5;
		 y = 9.5;
		 
		 z = x * y;

		 System.out.println("The product is " + z);
		 
		 
		 //Getting and Storing user input
		 Scanner keyboard = new Scanner(System.in);
		 
		 String firstInitial = keyboard.next();
		 String lastName = keyboard.next();
		 int houseNumber = keyboard.nextInt();
		 String streetName = keyboard.next();
		 String streetType = keyboard.next();
		 String city = keyboard.next();
		 
		 
		 System.out.print(firstInitial + " " + lastName + " " + houseNumber + " "); 
		 System.out.println(streetName + " " + streetType + " " + city);
		 
		 
		 
	}

}
