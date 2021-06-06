import java.util.Scanner;

class AreaOfRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the length of rectangle:");
		double length= scanner.nextDouble();
		System.out.println("enter the width of rectangle:");
		double width=scanner.nextDouble();
		//area=length*width
		double area=length*width;
		System.out.println("Area of rectangle is:"+area);
		
	}

}
