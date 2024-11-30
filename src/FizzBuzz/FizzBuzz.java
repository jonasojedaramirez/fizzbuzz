// ejercicio FizzBuzz
// Jonás Ojeda Ramírez

package FizzBuzz;

public class FizzBuzz {

	public static void main(String[] args) {
		
		
		for (int i=0;i<101;i++) {
			//System.out.println(i);
			if (i%3 == 0 && i%5 == 0) {
				System.out.println("FIZZBUZZ");
			}else if(i%3 == 0) {
				System.out.println("FIZZ");			
			}else if (i%5 == 0 ) {
				System.out.println("BUZZ");
			}else {
				System.out.println(i);
			}
				
		}

	}

}
