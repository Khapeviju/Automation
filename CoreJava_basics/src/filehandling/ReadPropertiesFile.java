package filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {

	public static void main(String[] args) throws IOException {
		
		
		//Step 1 - Filepath
		String filepath ="C:\\Users\\dell\\eclipse-workspace\\CoreJava_basics\\src\\filehandling\\User.properties";
       
		
		//Step 2 - 
		FileInputStream file = new FileInputStream(filepath);
		
		Properties or = new Properties();
		
		or.load(file);
		
		System.out.println(or.get("surname"));
		
		
	}

}
