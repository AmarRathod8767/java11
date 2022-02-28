package java11;

public class AddMatrixMain {

	public static void main(String[] args) {
     AddMatrix obj=new AddMatrix();
     int arr1[][]= {{5,6},{2,5}};
    
     int arr2[][]= {{2,3},{4,5}};
     
     int arr3[][]= obj.add(arr1, arr2);
    
	    for(int i=0;i<arr3.length;i++)
		{
			for(int j=0;j<arr3[i].length;j++)
			{
				System.out.print(arr3[i][j]+" ");
			}
			System.out.println();
		}
	    int arr4[][]= obj.Multiplication(arr1, arr2);
	    
	    for(int i=0;i<arr3.length;i++)
		{
			for(int j=0;j<arr3[i].length;j++)
			{
				System.out.print(arr4[i][j]+" ");
			}
			System.out.println();
		}
		
	
        
     

	}

}
