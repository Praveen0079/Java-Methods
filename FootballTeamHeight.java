import java.util.Scanner;
import java.util.Arrays;


class FootballTeamHeight{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int[] heights = new int[11];
		for(int i=0;i<heights.length;i++){  //451 123 145 178 196 178 185 192 145 175 156
			heights[i]= sc.nextInt();
		}
		System.out.println(Arrays.toString(heights));
		System.out.println("Sum of heights = "+SumOfHeights(heights)); //2124
        System.out.println("Mean Height = "+MeanHeight(heights));  //193
		System.out.println("Shortest Height = "+shortest(heights)); //123
		System.out.println("Tallest height = "+tallest(heights)); //451
    }
	
	static int SumOfHeights(int[] arr){
		int sum=0;
		for(int i : arr){
			sum+=i;
		}
		return sum;
	}
	static int MeanHeight(int[] arr){
		int sum = 0,mean =0;
		for(int i : arr){
			sum+=i;
		}
		mean = sum/arr.length;
		return mean;
	}
	static int shortest(int[] arr){
		int shortest=999;
		for(int i : arr){
			if(i<shortest){
				shortest=i;
			}
		}
		return shortest;
	}
	static int tallest(int[] arr){
		int tallest = 0;
		for(int i: arr){
			if(i>tallest){
				tallest=i;
			}
		}
		return tallest;
	}
}