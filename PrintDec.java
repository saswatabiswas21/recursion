//Printing 10 to 1 with recursion
import java.util.*;
class PrintDec{
	public static void printnum(int n){
		if(n==1){
			System.out.print(n);
			return;
		}
		System.out.print(n+"\t");
		printnum(n-1);
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the last digit:: ");
		int l=sc.nextInt();
		printnum(l);
	}
}