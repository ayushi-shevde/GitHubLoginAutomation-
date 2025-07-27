package utilities;

	import java.io.FileInputStream;
	import java.util.Properties;

	public class ConfigReader {
	    static Properties prop; //it is a java built in class to handle .properties file (key-value pairs)
	    //Static means it’s shared across all uses of this class without needing an object.

	    public static String getProperty(String key) {
	        try {
	            if (prop == null) {
	                prop = new Properties();
	                FileInputStream fis = new FileInputStream("src/test/resources/config.properties");
	                prop.load(fis);
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return prop.getProperty(key);
	    }
	}
