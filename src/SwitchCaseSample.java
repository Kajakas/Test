public class SwitchCaseSample {
	public static void main(String[] args) {
		System.out.printf(valueGrade(5));
	}
	
	public static String valueGrade(int a) {
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
}
