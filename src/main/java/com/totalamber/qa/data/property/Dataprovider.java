package com.totalamber.qa.data.property;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Dataprovider {

	private static Dataprovider instance = new Dataprovider();
	protected Properties properties = null;
	private String inputStream1 = "src\\main\\java\\com\\totalamber\\qa\\data\\property\\testData.properties";
	private String inputStream2 = "src\\main\\java\\com\\totalamber\\qa\\data\\property\\wqData.properties";



	public Dataprovider() {


		properties = new Properties();
		try {
			properties.load(new FileInputStream(inputStream1));
			properties.load(new FileInputStream(inputStream2));
		}catch (Exception e){
			try {
				properties.load(new FileInputStream(inputStream2));
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
