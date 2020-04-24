package com.webQuarters.qa.data.property;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Dataprovider {

	private static Dataprovider instance = new Dataprovider();
	protected Properties properties = null;

	private String inputStream = "src\\main\\java\\com\\webQuarters\\qa\\data\\property\\sfaData.properties";



	public Dataprovider() {


		properties = new Properties();
		try {
			properties.load(new FileInputStream(inputStream));
		}catch (Exception e){
			try {
				properties.load(new FileInputStream(inputStream));
			}catch (IOException ex) {
				e.printStackTrace();
				System.exit(0);
			}
		}
	}

	public static Dataprovider getConfigs() {
		return instance;
	}

	public String getValueByName(String key) {
		return properties.getProperty(key);
	}
}
