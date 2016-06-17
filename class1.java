package IO;

public class class1 {

	//static variable
	
	static int a=10,b=20;
	
	//non static variable
	int c=30,d=40;
	
	//static method without return value
	
	public static void add()
	
	{		
		System.out.println(a+b);
	}
	
	//static method with return value
	public static  int mul( )
	
	{ 	int z=0;
		z=a*b;
		return z;
	}
	
	// non static method without return
	public void sub()
	
	{
		System.out.println(d-c);
	}
	
	// non static method with return
		public int div()
		
		{
			int r=0;
			r=d/c;
			return r;
		}
public static void main (String [] main)
{
	
	// static variables/methods to be called using class name
	
	int x=class1.mul();
	System.out.println(x);
	class1.add();
	
	// non static variables/methods to be called using object
	
	class1 obj=new class1();
	obj.sub();
	System.out.println(obj.div());
	
}

}


