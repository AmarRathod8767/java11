package java11;

public class AddMatrix {
	int arr3[][]=new int[2][2];
	int [][] add(int arr1[][],int arr2[][])
	{
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1[i].length;j++)
			{
				arr3[i][j]=arr1[i][j]+arr2[i][j];
			}
		}
		return arr3;
	}
	
	int [][] Multiplication(int arr1[][],int arr2[][])
	{
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1.length;j++)
			{   arr3[i][j]=0;
				for(int k=0;k<arr1.length;k++)
				arr3[i][j]+=arr1[i][k]*arr2[k][j];
			}
		}
		return arr3;
	}
	

}
