

import java.io.*;

class Program2 {
	
	public static void main(String[] args)throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Input: ");
		
		System.out.print("Mass: ");
		float m = Float.parseFloat(br.readLine());
		
		System.out.print("Velocity: ");
		float v = Float.parseFloat(br.readLine());
		
		System.out.print("Output: ");
		System.out.println("Kinetic Energy of that Object is: " + 0.5 * m * v * v);

	}
}
