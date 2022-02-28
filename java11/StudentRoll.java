package java11;

public class StudentRoll {
    int rno;
    String name;
    void accept(int rnumber, String sname)
    {
    	rno=rnumber;
        name=sname;
    	
    }
    void display()
    {
    	System.out.println("Student Roll Number: "+rno);
    	System.out.println("Student Name: "+name);
    	
    }
}
