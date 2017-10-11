package nameGeneration;

import java.util.Random;

public class StartGenerator {
	public static void main(String[] args) {
		NameGenerator ng = new NameGenerator();
		System.out.println("Juhuslik eesnimi: " + ng.getRandomFirstName());
		System.out.println("Juhuslik perekonnanimi: " + ng.getRandomLastName());	
		System.out.println("Juhuslik t�isnimi: " + ng.getRandomFullName());
		System.out.println("Juhuslik arv vahemikus; " + ng.generateRandomNumberBetween(10,20));
		System.out.println("Juhuslik nimi: " + ng.generateRandomName(5));
		
		//Random demo
		// Math.random() vs Random klass
		System.out.println("juhuslik ujuvkomaga arv 0-1; " + Math.random());		
		System.out.println("juhuslik arv Random klassiga " + new Random().nextInt());
		System.out.println("juhuslik arv Random klassiga, piiritletud  " + new Random().nextInt(10));
	}
}
