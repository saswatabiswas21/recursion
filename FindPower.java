//find x^n;
import java.util.*;
class FindPower{
	public static double cal(double x,int n){
		if(n==0)
			return 1;
		
		return x*cal(x,n-1);
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base:: ");
		double b=sc.nextDouble();
		System.out.println("Enter the power:: ");
		int p=sc.nextInt();
		System.out.println("The reasult is:: "+cal(b,p));
	}
}