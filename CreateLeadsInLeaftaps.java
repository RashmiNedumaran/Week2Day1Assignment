package Week2Day1Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadsInLeaftaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		
driver.manage().window().maximize();

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

WebElement webUser = driver.findElement(By.id("username"));

webUser.sendKeys("demosalesmanager");

driver.findElement(By.id("password")).sendKeys("crmsfa");

driver.findElement(By.className("decorativeSubmit")).click();

driver.findElement(By.linkText("CRM/SFA")).click();

driver.findElement(By.linkText("Leads")).click();

driver.findElement(By.linkText("Create Lead")).click();

driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TeatLeaf");

WebElement Fname = driver.findElement(By.id("createLeadForm_firstName"));
Fname.sendKeys("Rashmi");
String Fname1 = Fname.getAttribute("value");
System.out.println("The first name is: "+Fname1);

driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Nedumaran");

WebElement DropDown = driver.findElement(By.id("createLeadForm_dataSourceId"));

Select ddown1 = new Select(DropDown);

ddown1.selectByVisibleText("Conference");

WebElement DropDown1 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));

Select ddown2 = new Select(DropDown1);

ddown2.selectByIndex(4);

driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Localname");
driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Locallastname");
driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("MR");
driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Manager");
driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("528694");

WebElement DropDown3 = driver.findElement(By.id("createLeadForm_industryEnumId"));
Select ddown3 = new Select(DropDown3);
ddown3.selectByVisibleText("Aerospace");

WebElement DropDown4 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
Select ddown4 = new Select(DropDown4);
ddown4.selectByIndex(5);


driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("admin");
driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("75");
driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("huigb");
driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("AEF");
driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("09/09/95");
driver.findElement(By.id("createLeadForm_description")).sendKeys("nill");
driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("nill");



WebElement Countrycode = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
Countrycode.clear();
Countrycode.sendKeys("2");
driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("5976212");
driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("007");
driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("aenug@gmail.com");
driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("86559666996");
driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Raja");
driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("testleaf.com");

driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("rashmi");
driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("nedumaran");
driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("adsfhjfe");
driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("eefunkgkn");
driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("chennai");
driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600059");
driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("59");
//driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("testleaf.com");

WebElement DropDown5 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
Select ddown5 = new Select(DropDown5);
ddown5.selectByValue("CA");

driver.findElement(By.name("submitButton")).click();

String title = "Create Lead | opentaps CRM";
String LeadsTitle = driver.getTitle();
if(title.equals(LeadsTitle)) 
	System.out.println("The title of the page is leads");

else 
	System.out.println("The title of the page is not leads");
	}

}
