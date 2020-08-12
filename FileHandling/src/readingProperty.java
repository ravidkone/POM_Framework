import java.io.FileInputStream;
import java.util.Properties;

public class readingProperty {

	public static void main(String[] args) {
		//This is now started asking in interview. This will be your bread and butter oin your project
		// property file? --> .properties --> key - value pairs 
		// whenever coding.args You should not hard code any values.
		// Because -> where ever you have consumed everywhere you have to change
		// Security
		//String sPath = "C:\\Users\\hanuma\\Google Drive\\Srinidhi session code\\FileHandling\\testdata.properties";
		//But that is not even required
		String sPath = System.getProperty("user.dir")+"/testdata.properties";
		try {
		Properties prop = new Properties();
		FileInputStream fi = new FileInputStream(sPath);
		prop.load(fi);
		System.getProperties().putAll(prop);
		System.out.println("Property value of Username = "+System.getProperty("username"));
		System.out.println("Property value of Password = "+System.getProperty("password"));
		System.setProperty("hi", "Hello");
		System.out.println(System.getProperty("os.name"));
		System.out.println(System.getProperty("user.dir"));
		System.out.println(System.getProperty("hi"));
		
		//12:05 PST 
		
		}catch(Exception a) {
			System.out.println(a);
		}
	}

}
