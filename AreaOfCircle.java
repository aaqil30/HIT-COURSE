import java.util.Scanner;

class AreaOfCircle {
        
	 static Scanner sc= new Scanner(System.in);
	 public static void main(String args[])
	 {
		 System.out.println("enter the radius:");
		 /* we are storing the entered radius in double
		  * because a user can enter radius in decimals
		  */
		 double radius=sc.nextDouble();
		 //area= PI*radius*radius
		 double area=Math.PI*(radius*radius);
		 System.out.println("the area of circle is:"+ area);
		 //circumference= 2*PI*radius
		 double circumference=Math.PI*2*radius;
		 System.out.println("area of circumference:" +circumference);
		 
		 
		 
	 }
	 

		

	}


