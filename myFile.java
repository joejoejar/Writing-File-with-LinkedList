package ReadingFile;

import java.io.*;
import java.util.LinkedList;
import java.util.Scanner;

public class myFile {
	static File my;
    public Scanner keyboard;
    public PrintWriter textWriter;
	

	public myFile() throws IOException {
		// TODO Auto-generated constructor stub

		this.Mywrite();
		
		
		

	}
	
	
		
	public void Mywrite() throws IOException {

		FileWriter wrt = new FileWriter(my);
		textWriter = new PrintWriter(wrt);
		String[] MyTestString= {"Ko Joe", "Mg Mg","HlaHla"};
		LinkedList<String> Student = new LinkedList<String>();
		for (String str : MyTestString)
		{
			Student.add(str);
		}
	
		textWriter.printf("%shelloworld", Student);
		textWriter.close();
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		my = new File("c:\\ReadFile\\myFile.txt");
		Scanner e = new Scanner(my);
		while (e.hasNext()) {
			System.out.println(e.next());
		}
		e.close();

		if (my.exists()) {
			System.out.println(my.getName() + "exists!");
		} else {
			System.out.println("The file does not exist");
		}
		
		myFile ok = new myFile();
		ok.Mywrite();

	}

}
