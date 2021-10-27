package IKApi.StarWars.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

//import org.apache.log4j.Logger;



public class ConfigManager {
	private static ConfigManager manager;
	//static Logger logger = Logger.getLogger(ConfigManager.class);
	public final static Properties prop = new Properties();

	private ConfigManager() throws IOException {
		
	//	logger.info("getting data from property file");
		//  InputStream inputStream=ConfigManager.class.getResourceAsStream("config.properties");
	//	System.out.println(System.getProperty("user.dir"));
		 FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "/StarWars_N/resources/config.properties");
		prop.load(fis);
		
	}

	public static ConfigManager getInstance() {
		if (manager == null) {
			synchronized (ConfigManager.class) {
				try {
					manager = new ConfigManager();

				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return manager;
	}

	public String getString(String key) {
		System.out.println(key);
		return System.getProperty(key, prop.getProperty(key));
	}

	public static Properties getProperty() { 
	Properties prop = new Properties();
	try {
		// load a properties file from class path, inside static method
		prop.load(ConfigManager.class.getClassLoader().getResourceAsStream("config.properties"));

		// get the property value and print it out
		
	} catch (IOException ex) {
		ex.printStackTrace();
	}
	return prop;

}}
