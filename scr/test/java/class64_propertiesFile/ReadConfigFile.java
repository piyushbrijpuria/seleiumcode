package class64_propertiesFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.testng.annotations.Test;

public class ReadConfigFile 
{
	@Test
	public void readConfig() throws IOException
	{
		Properties pro= new Properties();
		File src= new File("./ConfigFiles/config.properties");
		FileInputStream fis=new FileInputStream(src);
		pro.load(fis);
		
		String value=pro.getProperty("StagingURL");
		System.out.println(value);
		
	}

}
