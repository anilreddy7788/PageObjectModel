package javaprogramming;

import java.util.Arrays;

public class Second_LargestNumber_Array {

	public static void main(String[] args) {
     int temp;
		int[] Array = {2,4,6,7,23,56,21};
		Arrays.sort(Array);
		System.out.println("Second largest number in an Array by Sorting:" +Array[Array.length-2]);
		for(int i=0;i<Array.length;i++)
		{
			for(int j=i+1;j<Array.length;j++)
			{
				if(Array[i]<Array[j]) 
				{
					temp=Array[i];
					Array[i]=Array[j];
					Array[j]=temp;
					
				}
			}
		}
		System.out.println("Second largest number in an Array by Swapping is:" +Array[1]);
		System.out.println("Third largest number in an Array by Swapping is:" +Array[2]);
		
	}
	


}
