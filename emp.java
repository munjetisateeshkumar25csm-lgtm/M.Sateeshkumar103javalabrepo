class emp
{     void name()
    {  
	  System.out.println("name=sai");
	}
} 
class rollno extends emp
{     void rollnumber()
     {
	 System.out.println("rollnumber=123");
	 }
}
class salary extends rollno
{    void salary()
    { 
	 System.out.println("salary=1k"); 
	 }
}
 public static void main(String() args)
 {      
      class employee()
	  {   
	      salary d=new salary();
		  d.name();
		  d.emp();
		  d.rollno;
		 
	  }
 }
		  