package by.academy.classwork.lesson4;

public class Task19 {

	public static void main(String[] args) {
		
		for (int i = 10; i < 100; i++) {
			
			for (int j = 10; j < 100; j++) {
				
				if ((i * 100 + j) % (i * j) == 00) {
					
					System.out.println("Chilo i: " + i + " Chislo j: " + j);
					
				}
				
			}
			
		}

	}

}
