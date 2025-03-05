import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a year: ");
		int n = sc.nextInt();


		boolean isLeapYear = false;

		if (n > 1582) {
			isLeapYear = checkLeapYear(n);

			if (isLeapYear) {
				System.out.println(n + " is a Leap Year");
			} else {
				System.out.println(n + " is not a Leap Year");
			}
		} else {
			System.out.println("Don't enter a year less than 1582");
		}
	}

	static boolean checkLeapYear(int n) {
		if (n % 4 == 0) {
			if (n % 100 != 0 || n % 400 == 0) {
				return true;
			}
		}
		return false;
	}
}
