package IO;

public class classA {
	
	int a=10, b=20;
	
	public void add(){
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		
		classA obja=new classA();
		System.out.println(obja.a);
		obja.add();

	}

}
