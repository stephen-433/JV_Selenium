package IO;

public class classB extends classA {
	
	int a=100 , b=200;

	public void add()
	{
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		classB objb=new classB();
		objb.add();
		System.out.println(objb.a);

	}

}
