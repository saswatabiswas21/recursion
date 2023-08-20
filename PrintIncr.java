//Printing 1 to 10 with recursion
/*import java.util.*;
class PrintIncr{
	public static void printnum(int n){
		if(n==10){
			System.out.print(n);
			return;
		}
		System.out.print(n+"\t");
		printnum(n+1);
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first digit:: ");
		int l=sc.nextInt();
		printnum(l);
	}
}*/
import java.util.*;
class PrintIncr{
	public static void printnum(int n){
		if(n==1){
			System.out.print(n+"\t");
			return;
		}
		printnum(n-1);
		System.out.print(n+"\t");	
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the last digit:: ");
		int l=sc.nextInt();
		printnum(l);
	}
}