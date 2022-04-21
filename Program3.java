

import java.io.*;

class Program3 {
	
	public static void main(String[] args)throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Input: ");
		
		int x = Integer.parseInt(br.readLine());
		
		int y = Integer.parseInt(br.readLine());
		
		System.out.println("Output: ");
		System.out.println("Quotient: " + x / y);
		System.out.println("Remainder: " + x % y);

	}
}
