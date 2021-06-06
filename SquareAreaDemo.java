import java.util.Scanner;

public class SquareAreaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter side of square:");
		//capture the user's input
		Scanner scanner=new Scanner(System.in);
		//storing the captures value in a variable
		double side =scanner.nextDouble();
		//area of square= side*side
		double area=side*side;
		System.out.println("Area of square is:"+area);
		
	}

}
