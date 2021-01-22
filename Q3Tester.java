package Assignment4;
import java.io.*;
public class Q3Tester {
	public static void main(String[] args) {
		Q3Employee employee = new Q3Employee("Anshuman","YM221","440/28 Faridabad",50000.00);
		
		//Serialization
		try {
			FileOutputStream file = new FileOutputStream("C:\\Users\\ve00ym229\\Documents\\workspace-spring-tool-suite-4-4.9.0.RELEASE\\first\\src\\Assignment4\\file.txt");
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(employee);
			
			System.out.println("Object is Serialized");
			
			out.close();
			file.close();
		}
		
		catch(IOException e) {
			e.printStackTrace();
		}
		
		
		//Deserialization
		try {
			FileInputStream file = new FileInputStream("C:\\Users\\ve00ym229\\Documents\\workspace-spring-tool-suite-4-4.9.0.RELEASE\\first\\src\\Assignment4\\file.txt"); 
            ObjectInputStream in = new ObjectInputStream(file); 
            
            Q3Employee employee2 = (Q3Employee)in.readObject();	

			
            System.out.println("Object is Deserialized");
            
            System.out.println(employee);
            System.out.println(employee2);
            
            in.close();
            file.close();
		}
		
        catch(IOException e) 
        { 
            e.printStackTrace();
        } 
          
        catch(ClassNotFoundException e) 
        { 
            e.printStackTrace();
        } 
	}	
	
}
