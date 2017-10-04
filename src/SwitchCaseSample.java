import java.util.*;

public class SwitchCaseSample {
	public static void main(String[] args) {
		System.out.printf(valueGradeSC(5));
		System.out.printf("%n");
		System.out.printf(valueGradeMap(1));
	}
	
	public static String valueGradeSC(int a) {
        String gradestr;
		switch (a) {
	        case 1:  gradestr = "Debil blyat!";
	                 break;
	        case 2:  gradestr = "Väga loll oled, miks sa üldse vaevud?";
	                 break;
	        case 3:  gradestr = "Väga sitasti läks!";
	                 break;
	        case 4:  gradestr = "Halvasti läks!";
	                 break;
	        case 5:  gradestr = "Harju keskmine!";
	                 break;
	        case 6:  gradestr = "Hakkab juba minema!";
	                 break;
	        case 7:  gradestr = "Wat";
	                 break;
	        case 8:  gradestr = "Oled nüüd uhke w?";
	                 break;
	        case 9:  gradestr = "You can squat like true slav!";
	                 break;
	        case 10: gradestr = "Very good, nice!";
	                 break;
	        default: gradestr = "Sisesta hinne vahemikus 1-10";
	                 break;
		}
		return gradestr;
	}
	
	public static String valueGradeMap(int a) {
		HashMap<Integer, String> grade = new HashMap<Integer, String>();
		grade.put(1, "Debil blyat!");
		grade.put(2, "Väga loll oled, miks sa üldse vaevud?");
		grade.put(3, "Väga sitasti läks!");
		grade.put(4, "Halvasti läks!");
		grade.put(5, "Harju keskmine!");
		grade.put(6, "Hakkab juba minema!");
		grade.put(7, "Wat");
		grade.put(8, "Oled nüüd uhke w?");
		grade.put(9, "You can squat like true slav!");
		grade.put(10, "Sisesta hinne vahemikus 1-10");
	
		return (grade.containsKey(a)) ? grade.get(a) : "Sisesta hinne vahemikus 1-10!";

	}
}
