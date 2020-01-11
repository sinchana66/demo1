package testData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Demo 
{
	public static void main(String[] args) throws IOException 
	{
		
			File f=new File("./Data/input.properties");
			try
			{
				FileInputStream fis = new FileInputStream(f);
				Properties p=new Properties();
				p.load(fis);//load is method which takes argument of file input stream
				String un = p.getProperty("un");//to get data present in property file
				System.out.println(un);
				String pw = p.getProperty("pw");//to get data present in property file
				System.out.println(pw);
				
			} catch (FileNotFoundException e)
			{
				
				e.printStackTrace();
			}
			
			}
		
	}
	
	
	

