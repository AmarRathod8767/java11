package java11;

public class ParamArray {
	int sum;
	void sum(int a[])
	{
		sum=0;
		for(int s:a)
		{
			sum+=s;
		}
		System.out.println("Sum Array: "+sum);
	}
	int[] sub()
	{
		int arr[]= {1,2,3,4,5,6,7,8,9};
		return arr;
	}

}
