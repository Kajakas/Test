package nameGeneration;

import java.util.Random;

public class NameGenerator {

	private String[] firstNames = {"Kati", "Mati", "Jaanus", "Peeter", "Mari" };
	private String[] lastNames = {"Tamm", "Kask", "Pilv", "Saar", "Oja", "Luts" };
	Random random = new Random();
	
	public static String[][] NameArray = new String[][] { { "Vello", "Uno", "Vitali", "Gennadi", "Sergei", "Mihhail" },
		{ "Külli", "Svetlana", "Oksana", "Ljudmilla", "Milvi" },
		{ "Vildikas", "Nisu", "Kukk", "Oks", "Muna", "Kakk", "Stalnuhhin", "Ämber" } };
		
//	public static String rngName(String[][] names, boolean isMale) {
//		Random random = new Random();
//		int x = random.nextInt(names[0].length);
//		int y = random.nextInt(names[1].length);
//		int z = random.nextInt(names[2].length);
//		return (isMale) ? (names[0][x] + " " + names[2][z]) : (names[1][y] + " " + names[2][z]);
//	}
	
	/*TODO Kui ülesanded on valmis, siis teha need ümbes selliselt, 
	et oleks võimalik valida mehe ja naiste nimedele vahel. */
	
//	public String getRandomFirstName() {
//		return firstNames[random.nextInt(firstNames.length)];
//	}
	
	public String getRandomFirstName() {
		int r = random.nextInt(2);
		return NameArray[r][random.nextInt(NameArray[r].length)];
	}
	
	public String getRandomLastName() {
		return NameArray[2][random.nextInt(NameArray[2].length)];
	}
	
	public String getRandomFullName() {
		int r = random.nextInt(2);
		return NameArray[r][random.nextInt(NameArray[r].length)] + " " + NameArray[2][random.nextInt(NameArray[2].length)] ;
	}
	
	public String generateRandomName(int charNumber) {
		StringBuilder sb = new StringBuilder();
		char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		for (int i = 0; i < charNumber; i++) {
		    char c = chars[random.nextInt(chars.length)];
		    sb.append(c);
		}
		String input = sb.toString();
		String output = input.substring(0, 1).toUpperCase() + input.substring(1);
		return output;
	}
	
	public Integer generateRandomNumberBetween(int beg, int end) {
		return random.nextInt((end - beg) + 1) + beg;
	}
	
	public boolean flipPenny() {
		return random.nextBoolean();
	}
}
