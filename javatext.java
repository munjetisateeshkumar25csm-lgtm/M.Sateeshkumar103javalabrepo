class a
 {
	  int a=20,b=30;
      a(int c,int d)
 {
        c=a;
        d=b;
 }
     int m1()
 {
      return a;
 }
      int m2()
 {   
     return b;
 }
 }
 class text
 {  
   public static void main(String[] args){
   
            a n=new a(20,30);
			System.out.println(n.m1());
			System.out.println(n.m2());
			}
 }