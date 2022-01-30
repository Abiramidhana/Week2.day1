package sample;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/driver/chromedriver.exe");
		ChromeDriver driver = new  ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();	
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Contacts")).click();
	driver.findElement(By.linkText("Create Contact"));
	driver.findElement(By.name("firstName")).sendKeys("Abirami");
	driver.findElement(By.name("lastName")).sendKeys("Dhanasekaran");
	driver.findElement(By.linkText("Create Contact")).click();
	driver.close();

	}

}
