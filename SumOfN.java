import java.util.Scanner;

public class SumOfN{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
		int n = sc.nextInt();
		int sumFormula = sumFormula(n);
		int recursiveSum= sumRecursive(n);
		System.out.println("Sum of "+n+" natural number using formula = "+sumFormula);
		System.out.println("Sum of "+n+" natural number using recursive fuction = "+recursiveSum);

	}
	    // Recursive method 
    public static int sumRecursive(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumRecursive(n - 1);
    }
    
    // Formula method 
    public static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }
}