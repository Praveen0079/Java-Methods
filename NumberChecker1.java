import java.util.*;

class NumberChecker1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //132
		System.out.println("Number of digits : "+count(n)); //3
		System.out.println("Sum of digits : "+SumOfDigits(n)); //6
		if(isDuckNumber(n)){
			System.out.println(n+" is a Duck Number ");
		} else System.out.println(n+" is not a Duck Number ");
		if(isArmstrong(n)){
			System.out.println(n+" is a ArmStrong Number ");
		} else System.out.println(n+" is not a ArmStrong Number ");
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
	   public static boolean isDuckNumber(int number) {
        return String.valueOf(number).contains("0") && number > 0;
    }

    public static boolean isArmstrong(int number) {
        int sum = 0, temp = number, digits = String.valueOf(number).length();
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }
        return sum == number;
    }
	
}