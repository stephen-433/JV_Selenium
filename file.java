package IO;

import java.io.File;

public class file {

	public static void main(String[] args) {
		File fl=new File("D:\\Users\\stephenk\\mkdir");
		fl.mkdir();
		//fl.delete();
		String path=fl.getAbsolutePath();
		System.out.println("Path Name is:" + path);
		boolean a =fl.exists();
		
		if (a==true){
			System.out.println("File exists");
		}
		else
		{
			System.out.println("File doesn't exists");
		}
		 
		
		

	}

}
