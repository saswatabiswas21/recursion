//Nth Fibonacchi number
import java.util.*;
class Fibonacchi{
	public static int cal(int n){
		if(n==1 || n==0)
			return n;
		int r=cal(n-1)+cal(n-2);
		return r;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the the number:: ");
		int x=sc.nextInt();
		System.out.println(x+"th Fibonacchi number is:: "+cal(x));
	}
}