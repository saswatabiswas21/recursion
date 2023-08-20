//Remove duplicates from an String
import java.util.*;
class RemoveDuplicates{
	public static void show(String str,int index, StringBuilder sb,boolean arr[]){
		if(index==str.length()){
			System.out.println("After delation our new string is:: "+sb);
			return;
		}
		char c=str.charAt(index);
		if(arr[c-'a']==true)
			show(str,index+1,sb,arr);
		else{
			arr[c-'a']=true;
			show(str,index+1,sb.append(c),arr);
		}
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:: ");
		String str=sc.next();
		show(str,0,new StringBuilder(""),new boolean[26]);
	}
}