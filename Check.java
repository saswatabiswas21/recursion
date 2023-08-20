//Find First occurance of an element in an array
import java.util.*;
class Check{
	public static int show(int arr[],int key,int i){
		if(i==arr.length)
			return -1;
		if(arr[i]==key)
			return i;
		return show(arr,key,i+1);
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
		System.out.println("Enter the key:: ");
		int k=sc.nextInt();
		int r=show(num,k,0);
		if(r!=-1)
			System.out.println("1st occurance of "+k+" is at:: "+r);
		else
			System.out.println("The element "+k+" is not found.");
	}
}