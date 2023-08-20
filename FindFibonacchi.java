//Find position of fibonacchi no position
import java.util.*;
class FindFibonacchi{
	public static void print(int f,int s,int c,int key){
		if(key==f){
			System.out.println("The position of"+key+" is::"+(c+1));
			return;
		}
		c++;
		print(s,(f+s),c,key);
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the key:: ");
		int k=sc.nextInt();
		print(0,1,0,k);
	}
}