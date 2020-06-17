package project24;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileCreate {
	
	public static void main(String[] args) {
		
		
		File file = new File("invoice.txt");
		FileWriter fileWriter = null;
		try {
			 fileWriter = new FileWriter(file);
			 fileWriter.write("InvoiceId=123");
			 fileWriter.write("\n");
			 fileWriter.write("InvoiceName=nma");
			 fileWriter.write("123");
			 fileWriter.write("\n");
			 fileWriter.write("abc");
			 fileWriter.write("123\ndone");
			 System.out.println("File Created Succfully");
			 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				fileWriter.flush();
				fileWriter.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
