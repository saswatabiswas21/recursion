//Factorial of a number
import java.util.*;
class Factorial{
	public static long cal(int n){
		if(n==1||n==0)
			return 1;
		long r=n*cal(n-1);
		return r;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:: ");
		int n=sc.nextInt();
		System.out.println("Factorial of a number is :: "+cal(n));
	}
}