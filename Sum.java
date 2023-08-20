//Sum of n natural number
import java.util.*;
class Sum{
	public static int cal(int n){
		if(n==1)
			return 1;
		int r=n+cal(n-1);
		return r;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the last number:: ");
		int n=sc.nextInt();
		System.out.println("The sum of "+n+" natural number is:: "+cal(n));
	}
}