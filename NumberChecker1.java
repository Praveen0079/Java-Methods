import java.util.Scanner;

class NumberChecker1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Number of digits : "+count(n));
		System.out.println("Sum of digits : "+SumOfDigits(n));
	}
	static int count(int n){
		int temp = n;
		int count = 0;
		while(temp>0){
			temp = temp/10;
			count++;
		}
		return count;
	}
	static int SumOfDigits(int n){
		int temp = n;
		int sum = 0;
		int count = count(n);
		while(temp>0){
			sum += temp%10;
			temp = temp/10;
		
		}
		return sum;
	}
	
}