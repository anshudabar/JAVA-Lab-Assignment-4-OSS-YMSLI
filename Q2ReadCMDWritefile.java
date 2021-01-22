package Assignment4;
import java.io.*;

public class Q2ReadCMDWritefile {
	public static void main(String[] args)  {
		try {
			BufferedReader readFile = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter writeFile = new BufferedWriter(new FileWriter(new File("C:\\Users\\ve00ym229\\Documents\\workspace-spring-tool-suite-4-4.9.0.RELEASE\\first\\src\\Assignment4\\output.txt")));
			writeFile.write(readFile.readLine());
			
			System.out.println("readFile is written into writeFile");
			System.out.println("Content of writeFile is: ");
			
			BufferedReader in = new BufferedReader(new FileReader(new File("C:\\Users\\ve00ym229\\Documents\\workspace-spring-tool-suite-4-4.9.0.RELEASE\\first\\src\\Assignment4\\output.txt"))); 
			String st;
			while ( (st = in.readLine()) != null) {
			      System.out.println(st);          
			}         
			in.close();
			
			readFile.close();
			writeFile.close();
		}
		
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}
