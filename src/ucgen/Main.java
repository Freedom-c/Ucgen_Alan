package ucgen;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int a,b,c;
		double alan;
		
		Scanner inp = new Scanner(System.in);
		System.out.println("A kenarını gir:");
		a= inp.nextInt();
		System.out.println("B kenearını gir:");
		b= inp.nextInt();
		System.out.println("C kenarını gir:");
		c= inp.nextInt();
		alan=(a+b+c)/2;
		
		System.err.println("Alan: "+alan);
		

	}

}
