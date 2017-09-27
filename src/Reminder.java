import java.util.*;

public class Reminder {
	public static String[] Numberarray = new String[] { "üks", "kaks", "kolm", "neli", "viis", "kuus", "seitse",
			"kaheksa", "üheksa", "kümme" };

	public static String[][] NameArray = new String[][] { { "Vello", "Uno", "Vitali", "Gennadi", "Sergei", "Mihhail" },
			{ "Külli", "Svetlana", "Oksana", "Ljudmilla", "Milvi" },
			{ "Vildikas", "Nisu", "Kukk", "Oks", "Muna", "Kakk", "Stalnuhhin", "Ämber" } };

	public static void main(String[] args) {
		// System.out.println(greeter("Ime", "muna!"));
		// System.out.println(genHtml("h1", "asd"));
		// System.out.println(getAvgValue(new double[] { 13, 17, 15, 20, 14, 19, 12 }));
		// System.out.println(numText(10));
		// System.out.println(Arrays.toString(numTextArr(7)));
		System.out.printf(rngName(NameArray, true));
	}

	public static String rngName(String[][] names, boolean isMale) {
		Random random = new Random();
		int x = random.nextInt(names[0].length);
		int y = random.nextInt(names[1].length);
		int z = random.nextInt(names[2].length);
		return (isMale) ? (names[0][x] + " " + names[2][z]) : (names[1][y] + " " + names[2][z]);
	}

	public static String greeter(String t1, String t2) {
		return t1 + " " + t2;
	}

	public static String numText(int a) {
		return (a > 0 && a <= Numberarray.length) ? Numberarray[a - 1]
				: "Out of range" + " (" + String.valueOf(a) + ")";
	}

	public static String[] numTextArr(int a) {
		return Arrays.copyOfRange(Numberarray, 0, a);
	}

	public static String genHtml(String tag, String text) {
		return "<" + tag + ">" + text + "</" + tag + ">";
	}

	public static double getAvgValue(double[] a) {
		double val = 0;
		for (int i = 0; i < a.length; i++) {
			val += a[i];
		}
		return val / a.length;
	}
}
