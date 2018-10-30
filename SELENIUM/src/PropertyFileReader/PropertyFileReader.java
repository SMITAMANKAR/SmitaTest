package PropertyFileReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileReader {
	
	Properties properties;
	public  PropertyFileReader(String FilePath) {
		
		try {
			
			FileInputStream Locator = new FileInputStream(FilePath);
			properties = new Properties();
			properties.load(Locator);	
		   }
		catch(FileNotFoundException e) {
			
			e.printStackTrace();	
			}
			catch(IOException e) {
				e.printStackTrace();
				
			}	
		}
	
	public String getData(String ElementName) {
		//read value using the logical name as key
		
		String data = properties.getProperty(ElementName);
		return data;
	}
}


