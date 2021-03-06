package Week2Day1Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.name("UserFirstName")).sendKeys("Rashmi");
	driver.findElement(By.name("UserLastName")).sendKeys("Rajagopal");
	driver.findElement(By.name("UserEmail")).sendKeys("rashmi@gmail.com");
	driver.findElement(By.name("CompanyName")).sendKeys("ABC");
	driver.findElement(By.name("UserPhone")).sendKeys("9862547895");
	
	WebElement DropDown1 = driver.findElement(By.name("UserTitle"));
	Select dd1 = new Select(DropDown1);
	dd1.selectByIndex(4);
	
	WebElement DropDown2 = driver.findElement(By.name("CompanyEmployees"));
	Select dd2 = new Select(DropDown2);
	dd2.selectByValue("250");
	
	WebElement DropDown3 = driver.findElement(By.name("CompanyCountry"));
	Select dd3 = new Select(DropDown3);
	dd3.selectByVisibleText("Iceland");
	
	driver.findElement(By.className("checkbox-ui")).click();
	driver.close();
	
	
	
	
	
	
	

	}

}
