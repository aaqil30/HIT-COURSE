import java.util.Scanner;

 class AreaOfTriangle {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in)) {
			System.out.println("enter the width of the triangle:");
			double base=scanner.nextDouble();
			System.out.println("enter the height of the triangle:");
			double height=scanner.nextDouble();
			//area=(width*height)/2
			double area=(base*height)/2;
			System.out.println("area of triangle:" +area);
		}
		

	}

}
