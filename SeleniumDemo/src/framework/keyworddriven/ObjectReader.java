package framework.keyworddriven;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ObjectReader {
	
	public static Properties getObjectRepository(Properties properties, String propertyFilepath) throws IOException {
		InputStream stream = new FileInputStream(
				new File(propertyFilepath));
		properties.load(stream);
		return properties;
	}

}
