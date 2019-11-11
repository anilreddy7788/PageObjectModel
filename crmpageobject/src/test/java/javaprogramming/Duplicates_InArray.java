package javaprogramming;

public class Duplicates_InArray {

	public static void main(String[] args) {

		int[] Array = {1,3,5,3,2,4,5,7};
		for(int i=0;i<Array.length;i++)
		{
			for(int j=i+1;j<Array.length;j++)
			{
				if(Array[i]==Array[j])
				{
					System.out.println(Array[j]);

				}
			}
		}
	}

}
