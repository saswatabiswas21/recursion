/*Given a "2 x n" board and tiles of size "2 x 1", 
count the number of ways to tile the given board using the 2 x 1 tiles. 
(A tile can either be placed horizontally or vertically)*/
import java.util.*;
class Count{
	public static int cal(int n){
		if(n==0||n==1)
			return 1;
		return (cal(n-1)+cal(n-2));
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n:: ");
		int n=sc.nextInt();
		System.out.println("The reasult is:: "+cal(n));
	}
}