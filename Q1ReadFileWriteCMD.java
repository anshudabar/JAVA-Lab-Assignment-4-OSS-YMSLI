package Assignment4;
import java.io.*;
public class Q1ReadFileWriteCMD {
	public static void main(String[] args) {
		try {
			FileInputStream spidy = new FileInputStream("C:\\Users\\ve00ym229\\Documents\\workspace-spring-tool-suite-4-4.9.0.RELEASE\\first\\src\\Assignment4\\spidy.jpg");
			FileOutputStream spidyCopy = new FileOutputStream("C:\\Users\\ve00ym229\\Documents\\workspace-spring-tool-suite-4-4.9.0.RELEASE\\first\\src\\Assignment4\\spidyCopy.jpg");
			
			int ascii = 0;
			while (ascii!= -1) {
				ascii=spidy.read();
				spidyCopy.write(ascii);
			}
		
			System.out.println("File spidy successfully written into spidyCopy ");
			spidyCopy.flush();
			spidy.close();
			spidyCopy.close();
		}
		
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
