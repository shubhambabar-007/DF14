

class Program4 {
	
	public static void main(String[] args){
		
		int x = 6;

		for (int i = 1 ; i <= 4 ; i++){
			
			x++;

			for (int j = 1 ; j <= i ; j++){
				
				System.out.print(x + " ");
				x--;
		
			}

			System.out.println();
		}
	}
}
