class emp
{      void name ()
    {  
	  System.out.println("name=sai");
	}
} 
class rollno extends emp
{      void rollnumber ()
     {
	 System.out.println("rollnumber=123");
	 }
}
class salary extends rollno
{    void salary ()
    { 
	 System.out.println("salary=1k"); 
	}
}  class employee
{
	
    public static void main(String[] args)
   {      
	      salary d=new salary ();
		  d.name();
		  d.rollnumber();
		  d.salary();
		 
	  }
  }
		  