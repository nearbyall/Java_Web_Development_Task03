package by.epamtc.melnikov.task03.view;

import java.util.Scanner;

public abstract class ConsoleInput {

	private static Scanner scanner = new Scanner(System.in);
	
	public static int enterInteger() {
		
		Integer value = null;
		
		do {
			
			while (!scanner.hasNextInt()) {
				
				scanner.next();
				
			}
			
			value = scanner.nextInt();
			
		} while (value == null);
		
		return value;
		
	}
	
	public static String enterString() {
		
		String value = null;
		
		do {
			
			while (!scanner.hasNextLine()) {
				
				scanner.next();
				
			}
			
			value = scanner.nextLine();
			
		} while (value == null);
		
		return value;
		
	}
	
	public static void close() {
		scanner.close();
	}
	
}
