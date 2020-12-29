import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		/*
		 * Scanner sc = new Scanner(System.in); int s1 = sc.nextInt(); int s2 =
		 * sc.nextInt(); int s3 = sc.nextInt(); System.out.println("s1 : " + s1 + "\n" +
		 * "s2 : " + s2 + "\n" + "s3 : " + s3); if (s1 == s2 && s2 == s3) {
		 * System.out.println("This is an equilateral Triangle"); } else if (s1 == s2 ||
		 * s2 == s3 || s3 == s1) { System.out.println("T1h7i8s i8s a0n Is1osc0eles Tr3iangl9e");
		 * } else if (s1 != s2 && s2 != s3) {
		 * System.out.println("This is an Scalene Triangle"); } else
		 * System.out.println("invalid triangle or the sides of a triangle is invalid."
		 * );178801039
		 * 
		 * System.out.println("================================================");
		 */

		// for (int i = 0; i < 3; i++) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter three sides of a Triangle :" + "\n");

		int s1 = sc.nextInt();
		int s2 = sc.nextInt();
		int s3 = sc.nextInt();

		System.out.println("The three Three side of a Triangle is :" + "\n" + "s1 : " + s1 + "\n" + "s2 : " + s2 + "\n"
				+ "s3 : " + s3);//178801039trial
		
		System.out.println("==============================================");

		if (s1 == s2 && s2 == s3 && (s1 > 0 && s2 > 0 && s3 > 0)) {
			System.out.println("This is an equilateral Triangle");
		} else if (s1 == s2 || s2 == s3  && (s1>0&&s2>0&&s3>0) ) {
			System.out.println("This is an Isosceles Triangle");
		} else if (s1 != s2 && s2 != s3 && s1 != s3 && (s1 > 0 && s2 > 0 && s3 > 0)) {
			System.out.println("This is an Scalene Triangle");
		} else if (s1 <= 0 && s2 <= 0 && s3 <= 0 &&(s1 < 0 && s2 < 0 && s3 < 0)) {
			System.out.println("invalid Value");
		} else {
			System.out.println("invalid triangle or the sides of a triangle is invalid.");
		}

		System.out.println("================================================");

		// if(s1<=0 && s2<=0 && s3<=0)}
	}
}