package TestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CreateNewContactTest {
	public String baseUrl = "http://localhost:8080/addressbook";
	String driverPath = "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe";
	public WebDriver driver;
	
	@BeforeTest
	public void launchBrowser() throws InterruptedException {
		System.out.println("Launching Google...");
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		 //Maximize the browser  
        driver.manage().window().maximize();
		driver.get(baseUrl);
		Thread.sleep(2000);
	}
	
	@Test
	public void createNewContact() throws InterruptedException{
		// Click New Contact
		driver.findElement(By.xpath("//div[@id=\'addressbook-1376863011\']/div/div[2]/div/div/div/div/div[1]/div/div/div[2]/div")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='gwt-uid-5']")).sendKeys("sajnam");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id=\'gwt-uid-7\']")).sendKeys("rai");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id=\'gwt-uid-9\']")).sendKeys("+ 123 456 789 ");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id=\'gwt-uid-11\']")).sendKeys("sajnam@rai.com");
		Thread.sleep(2000);

		
		//button to open calendar
        WebElement openCal = driver.findElement(By.className("v-datefield-button"));
        openCal.click();
		Thread.sleep(2000);


        //Select month
        WebElement selectMonth = driver.findElement(By.className("v-button-nextmonth"));
        selectMonth.click();
		Thread.sleep(2000);

        
        //Select day       
        WebElement selectDay = driver.findElement(By.className("v-datefield-calendarpanel-day"));
        selectDay.click();
		Thread.sleep(2000);

        
        //Save contact
        WebElement saveContact = driver.findElement(By.xpath("//div[@id=\'addressbook-1376863011\']/div/div[2]/div/div[2]/div/table/tbody/tr[1]/td[3]/div/div[1]/div"));
        saveContact.click();
		Thread.sleep(2000);

	}
//	/
	@AfterTest
    public void terminateBrowser(){
		driver.close();
    }
}
