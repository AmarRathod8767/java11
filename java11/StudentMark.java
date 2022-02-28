package java11;

public class StudentMark {
   int mark[];
   double per=0,total;
   String sub[];
 
	void enterSubjectMarks(String sub[],int mark[])
	{
	    
		this.sub=sub;
		this.mark=mark;
		
	}
	 void calculateMarks()
	 { 
		 for(int i=0;i<mark.length;i++)
		 {
			 total=total+mark[i];
		 }
		 per=total/mark.length;
		
		 System.out.println("Obtain percentage: "+per);
	 }
	 
 
	
}
