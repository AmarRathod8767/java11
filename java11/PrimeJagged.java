package java11;

public class PrimeJagged 
	/*int count=0;
	void chackPrime(int arr[][])
	{ 
		for(int i=0;i<arr.length;i++)
		{ 
			for(int j=0;j<arr[i].length;j++)
			{ int c=0;
				for(int k=0;k<arr[i][j];k++)
				{
					if(arr[i][j]%k==0)
					{
					c++;
					break;
				    }
				}
				if(c==2)
				{
					count++;
					
				}
				
			}
			System.out.println("Total: "+count);
			
		}
		
	
	}*/
	
	
{	
	int c=0;
    int max=0;
    void checkPrime(int arr[][])
    {
         for(int i=0;i<arr.length;i++)
         {
             for(int j=0;j<arr[i].length;j++)
             {
                 int k;
                 for(k=2;k<arr[i][j];k++)
                 {
                     if(arr[i][j]%k==0){
                         break;
                     }
                 }
                 if(arr[i][j]==k) {
                     if(max<arr[i][j])
                     {
                         max=arr[i][j];
                     }
                     System.out.println(arr[i][j] + " ");
                 }
             }
         }
        System.out.println("Max is "+max);
}	
}
  

