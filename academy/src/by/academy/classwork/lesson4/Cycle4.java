package by.academy.classwork.lesson4;

import java.util.Scanner;
import java.util.Arrays;
 
public class Cycle4 {
	
    public static void main(String[] args) {
    	
    	Scanner n = new Scanner(System.in);
    	
    	System.out.print("Введите колл-во чисел: ");
    	
    	int size = n.nextInt();
    	    	    	
    	Scanner input = new Scanner(System.in);
    	
    	int array[] = new int[size];
    	
    	System.out.println("Введите " + size + " чисел от -100 до 100: ");
    	
    	for(int i = 0; i < 5; i++) {
    		
    		array[i] = input.nextInt();
    	}
    	
    	input.close();
    	n.close();
        	       
        System.out.println("Массив: " + Arrays.toString(array));
         
        int count = 0;
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] < 0) count++;
            if (array[i] == 0) count1++;
            if (array[i] > 0) count2++;
        }
        System.out.println("массив имеет " + count + " отрицательных числа(-ел)");
        System.out.println("массив имеет " + count1 + " числа(-ел) равных нулю");
        System.out.println("массив имеет " + count2 + " положительных числа(-ел)");
 
        
    }
        
}
