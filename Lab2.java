import java.util.Scanner;//This imports libary file 
public class Lab2 {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		//Scanner input is looking for a key to press on keyboard
		int x;
		// x will hold a value 
		int	y;
		// will hold a value
		int z;
		//the sum
		System.out.println("This program reads two numbers, and finds the sum\nfollowed by displaying the answer.");
		System.out.print("Enter the first number: ");
		x = Input.nextInt();
		// Whatever you input the x value
		System.out.print("Enter second number: ");
		y = Input.nextInt();
		// Looking for a second value
		z = x + y ;
		//this caluclates the sum
		System.out.println("The sum of "+x+" and "+y+" is " + z);
		// Adds them together, the + gives the int space in between "+x+" and "+y+"
		
		}

}


