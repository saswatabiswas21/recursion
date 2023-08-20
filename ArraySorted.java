//Check weather a array is sorted or not
import java.util.*;
class ArraySorted{
	public static boolean show(int arr[],int i){
		if(i==arr.length-1)
			return true;
		if(arr[i]>arr[i+1])
			return false;
		return show(arr,i+1);
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:: ");
		int n=sc.nextInt();
		int num[]=new int[n];
		System.out.println("Enter the array:: ");
		for(int i=0;i<n;i++){
			num[i]=sc.nextInt();
		}
		System.out.println(show(num,0));
	}
}