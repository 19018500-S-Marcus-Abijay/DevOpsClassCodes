package selenium;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.BasicConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicConfigurator.configure();

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://localhost:8080/addressbook");
		
		 //Maximize the browser  
        driver.manage().window().maximize();  
        
		System.out.println(driver.getTitle());
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
	}

}
//d