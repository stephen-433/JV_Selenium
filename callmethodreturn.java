package IO;

public class callmethodreturn {

	
	public static String  cal(String name) {
				return name;
	}
	
	public static int mul(int a,int b,int c){
		int d=a*b*c;
		return d;
	}
	
	public static void main(String[] args) {
		
	int a=mul(2, 3, 4);
	String b=cal("Apple");
	
	System.out.println(a);
	System.out.println(b);
	
	}

}
