
public class SwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first=120, second=220;
		System.out.println("--Before swap");
		System.out.println("First number="+ first);
		System.out.println("Second number="+second);
		//value of first is assigned to temporary
		int temporary=first;
		//value of second is assigned to first
		first=second;
		//value of temporary(which contains the initial first) is assigned to second
		second=temporary;
		System.out.println("--Sfter swap");
		System.out.println("First number="+first);
		System.out.println("Second number="+ second);
		

	}

}
