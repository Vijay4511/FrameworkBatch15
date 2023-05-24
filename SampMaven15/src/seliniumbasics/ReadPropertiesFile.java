package seliniumbasics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Properties prop = new Properties();
		
		String projectpath = System.getProperty("user.dir");
		
		
		
		System.out.println(System.getProperty("processor"));
		FileInputStream fis = new FileInputStream(projectpath+"\\src\\ConfigurationDetails.properties");
		
		prop.load(fis);
		
		String url = prop.getProperty("url");
		
		String uname = prop.getProperty("username");
		
		System.out.println(url);
		System.out.println(uname);
		
		prop.setProperty("username", "Nihanthkumar");
		
		FileOutputStream fop = new FileOutputStream(projectpath+"\\src\\ConfigurationDetails.properties");
		
		prop.store(fop, "updating the username");
		
	}

}
