
import java.io.*;

class Program5 {
	
	public static void main(String[] args)throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Input: ");
		
		System.out.println("Enter number 1: ");
		
		System.out.print("Real part: ");
		int a = Integer.parseInt(br.readLine());
		
		System.out.print("Imaginary part: ");
		int b = Integer.parseInt(br.readLine());
		
		System.out.println();
		
		System.out.println("Enter number 2: ");
		
		System.out.print("Real part: ");
		int c = Integer.parseInt(br.readLine());
		
		System.out.print("Imaginary part: ");
		int d = Integer.parseInt(br.readLine());
		
		System.out.println();
		System.out.print("Output: ");
		
		if (b == 1)
			System.out.println("The addition of " + a + " + " + "i & " + c + " + " + d + "i is " + (a + c) + " + " + (b + d) + "i");
		
		else if (d == 1)
			System.out.println("The addition of " + a + " + " + b + "i & " + c + " + " + "i is " + (a + c) + " + " + (b + d) + "i");
		
		else
			System.out.println("The addition of " + a + " + " + b + "i & " + c + " + " + d + "i is " + (a + c) + " + " + (b + d) + "i");
	}
}
