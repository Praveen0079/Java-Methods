import java.util.Arrays;
import java.util.Scanner;


public class Factors{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		int[] factorArray = factorArrays(n);
		System.out.println("Factors are : "+Arrays.toString(factorArray));
		
		int sum = SumOfFactors(factorArray);
		System.out.println("Sum of Factors is : "+sum);
		
		int product = ProductOfFactors(factorArray);
		System.out.println("Product of Factors is : "+product);

		int SumOfSqOfFactors = SumOfSquareOfFactors(factorArray);
		System.out.println("Sum of square of factors is : "+SumOfSqOfFactors);

	}
	static int[] factorArrays(int n){
		int count=0;
		for(int i=1;i<=n;i++){
			if(n%i==0){
				count++;
			}
		}
		int[] factorArrays = new int[count];
		int index=0;
		for(int i=1;i<=n;i++){
			if(n%i==0){
				factorArrays[index++]=i;
			}
		}
		return factorArrays;
	}
	static int SumOfFactors(int[] arr){
		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum+=arr[i];
		}
		return sum;
	}
	static int ProductOfFactors(int[] arr){
		int p=1;
		for(int i=0;i<arr.length;i++){
			p= p*arr[i];
		}
		return p;
	}
	static int SumOfSquareOfFactors(int[] arr){
		int sum=0;
		for(int i=0;i<arr.length;i++){
			arr[i]= (int)Math.pow(arr[i],2);
			sum+=arr[i];
		}
		return sum;
	}
}