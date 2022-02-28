package java11;

import java.util.Objects;

public class CopairArray {

	public static void main(String[] args) {
        char arr[] = {'m','a','d','a','m'};
        int i,j;
       
 
        boolean flag=true;
        for(i=0,j=arr.length-1;i<arr.length/2;i++,j--)
        	
        {
        	 System.out.println(j);
              if(arr[i]!=arr[j])
              {
                  flag=false;
                  System.out.println("Not Pallindrom");
                  break;

              }

        }
       if(flag)
       System.out.println("Pallindrom");


   }


}