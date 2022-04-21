
import java.io.*;

class Program1 {
	
	public static void main(String[] args)throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Input: ");
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());

		System.out.println("Before swap: a = " + a + " & b = " + b);
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("After swap: a = " + a + " & b = " + b);
	}
}
