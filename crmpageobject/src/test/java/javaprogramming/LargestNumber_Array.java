package javaprogramming;

public class LargestNumber_Array {

	public static void main(String[] args) {
    int[] array = {3,45,34,32,123,645};
    int max= array[0];
    int min= array[0];
    for(int i=0;i<array.length;i++)
    {
    	if(array[i]>max) 
    	{
    		max=array[i];
    	}
    	
    	if(array[i]<min)
    	{
    		min=array[i];
  
    	}
    }
    System.out.println("Largest number in array is:" +max);
    System.out.println("Smallest number in an array is:" +min);
	}

}
