package project24;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReading {
	public static void main(String[] args) {
		
		try {
			FileReader in = new FileReader("invoice.txt");
			BufferedReader bin = new BufferedReader(in);
			String s1 = bin.readLine();
			while (s1 != null) {
				System.out.println(s1);
				s1 = bin.readLine();
			}
			bin.close();
			in.close();
			System.out.println("done");

			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
