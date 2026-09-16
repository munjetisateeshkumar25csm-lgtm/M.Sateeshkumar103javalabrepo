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
   {  public static void main(Strings[] args)
	   {   
          dog b=new dog();
	      breathe();
	      walk();
	     bark();
	   }
   }
   