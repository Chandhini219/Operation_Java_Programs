package File_Operations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Configuration_Program {

	public static void main(String[] args) throws IOException {
		WebDriver driver ;
		//FileReader--- reads file character by character
		//FileInputStream-----reads file byte by byte 
		FileInputStream fis=new FileInputStream("Config.properties"); 
		Properties properties=new Properties();
		properties.load(fis);
		String browser1=properties.getProperty("browser");
		String location1=properties.getProperty("location");
		if(browser1.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", location1);
			driver=new ChromeDriver();
			driver.get("https://www.google.co.in/");
		}
		else if (browser1.equalsIgnoreCase("firefox")) 
		{
			System.setProperty("webdriver.getko.driver", location1);
			driver=new FirefoxDriver();
			driver.get("https://www.google.co.in/");
		}
		
	}
}




