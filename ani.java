class animals
{  static void breathe()
    {  
     System.out.println("breathe");
    }
}
class mammal extends animals
{    static void walk()
     {
	  System.out.println("walks");
	 }
}
class dog extends mammal
{    static void bark()
     {
	  System.out.println("barks");
	 }
} 
    class text
   { 
       public static void main(String[] args)
	   {   
          dog b=new dog();
	      b.breathe();
	      b.walk();
	      b.bark();
	   }
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
   }
   