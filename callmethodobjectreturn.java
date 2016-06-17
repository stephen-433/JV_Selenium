package IO;

public class callmethodobjectreturn {

	
	public String  cal(String name) {
				return name;
	}
	
	public int mul(int a,int b,int c){
		int d=a*b*c;
		return d;
	}
	
	public static void main(String[] args) {
		
		callmethodobjectreturn abc=new callmethodobjectreturn();
		String a=abc.cal("Raj");
		System.out.println("My Name is:"+ abc.cal("Stephen"));
		System.out.println("My Name is:"+ a);
		
		callmethodobjectreturn mulp=new callmethodobjectreturn();
		int value=mulp.mul(2, 3,5);
		System.out.println("Caluclated value:"+ value);
		System.out.println("Caluclated value:"+ mulp.mul(1, 2, 3));
	}

}
