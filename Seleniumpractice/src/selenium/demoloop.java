package selenium;

import java.util.Scanner;

public class demoloop {

	int marks;
	Scanner S;
	int Total=0;
	
	int gettotal() {
		S=new Scanner(System.in);
		for(int i=1;i<=2;i++) {
			System.out.println("Enter the Mark");
			marks=S.nextInt();
			Total+=marks;
		}
		return Total;
	}
	public static void main(String[] args) {
		demoloop b=new demoloop();

		System.out.println("Total ="+b.gettotal());
	}	

}




