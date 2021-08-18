package Week2Day1Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginFacebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver=new ChromeDriver();
			driver.get("http://en-gb.facebook.com/");
			
	driver.manage().window().maximize();

	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.linkText("Create New Account")).click();
	driver.findElement(By.name("firstname")).sendKeys("Rashmi");
	driver.findElement(By.name("lastname")).sendKeys("Nedumaran");
	driver.findElement(By.name("reg_email__")).sendKeys("rashminedumaran269@gmail.com");
	driver.findElement(By.id("password_step_input")).sendKeys("RashmiRaja");
	
	WebElement DropDown1 = driver.findElement(By.id("day"));
	Select dd1 = new Select(DropDown1);
	dd1.selectByIndex(25);
	
	WebElement DropDown2 = driver.findElement(By.id("month"));
	Select dd2 = new Select(DropDown2);
	dd2.selectByValue("12");
	
	WebElement DropDown3 = driver.findElement(By.id("year"));
	Select dd3 = new Select(DropDown3);
	dd3.selectByVisibleText("1993");
	
	driver.findElement(By.className("_58mt")).click();
	
	}

}
