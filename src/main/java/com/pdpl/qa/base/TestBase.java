package com.pdpl.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import com.pdpl.qa.util.TestUtil;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	public static Select drop;
	
	public TestBase() {
		try {
			prop = new Properties();

			FileInputStream ip = new FileInputStream(
					"C:\\My Data\\Ritu\\Essay\\Bama\\PDPL\\src\\main\\java\\com\\pdpl\\qa\\config\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void initialization() {
		String browsername = prop.getProperty("browser");
		if (browsername.equals("ie")) {
			System.setProperty("webdriver.edge.driver",
					"C:\\My Data\\Selenium\\edgedriver_win64\\msedgedriver.exe");
			driver = new EdgeDriver();
		} else {
			System.out.println("PDPL works only on IE");
		}
 
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		
		
	}
}
