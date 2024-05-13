package class64_propertiesFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.testng.annotations.Test;

public class ReadConfigFile2 
{
	@Test
	public void readConfig() throws IOException
	{
		Properties pro= new Properties();		
		pro.load(new FileInputStream(new File("./ConfigFiles/config.properties")));
		
		String value=pro.getProperty("StagingURL");
		System.out.println(value);
		
	}

}
