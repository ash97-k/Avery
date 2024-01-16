package mvnavery;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static util.ConfigReader.getUrl;
import static util.ConfigReader.getUsername;
import static util.ConfigReader.getPassword;
import static util.ConfigReader.getCustomername;
import static util.ConfigReader.getAddress;
import static util.ConfigReader.getContactNo;
import static util.ConfigReader.getEmailId;
import static util.ConfigReader.getSitename;
import static util.ConfigReader.getSiteprefix;
import static util.ConfigReader.getPincode;
import static util.ConfigReader.getBridgename;
import static util.ConfigReader.getNewcontactno;
import static util.ConfigReader.getChangeadress;
import java.io.IOException;

import javax.security.auth.Refreshable;

import io.github.bonigarcia.wdm.WebDriverManager;
import pom.Service;

public class Login {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		//System.setProperty("webDriver.chrome.driver","C:\\browserdrivers\\chromedriver.exe");
//		WebDriverManager.chromedriver().setup();
//		ChromeDriver driver =new ChromeDriver();
//		driver.get("https://www.google.com/");
//		driver.manage().window().maximize();
//
//	}
	@Test(priority = 1)
	public void LoginTest() throws IOException, InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(getUrl());
		Service a=new Service(driver);
		a.username.sendKeys(getUsername());
		a.password.sendKeys(getPassword());
		a.loginbutton.click();
		Thread.sleep(3000);
		a.service.click();
		a.customer.click();
		a.editbutton.click();
		a.name.sendKeys(getCustomername());
		a.address.sendKeys(getAddress());
		a.contactno.sendKeys(getContactNo());
		a.emailid.sendKeys(getEmailId());
		a.savebutton.click();
		Thread.sleep(3000);
	System.out.println("New customer created successfully");
	a.foreditselectcustomername.click();
	a.editbutton.click();
	a.contactno.clear();
	a.contactno.sendKeys(getNewcontactno());
	a.savebutton.click();
	System.out.println("New customer updated successfully");
	Thread.sleep(3000);
	a.foreditselectcustomername.click();
	a.deletebutton.click();
	Thread.sleep(3000);
	a.yesdeletebutton.click();
	System.out.println("New customer deleted successfully");	
		}

	@Test(priority = 2)
	public void SiteTest() throws IOException, InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(getUrl());
		Service a=new Service(driver);
		a.username.sendKeys(getUsername());
		a.password.sendKeys(getPassword());
		a.loginbutton.click();
		Thread.sleep(3000);
		a.service.click();
		a.site.click();
		a.editbutton.click();
		a.sitename.sendKeys(getSitename());
		a.siteprefix.sendKeys(getSiteprefix());
		a.selectcustomer.click();
		Thread.sleep(3000);
		a.selectcustomername.click();
		a.address.sendKeys(getAddress());
		a.pincode.sendKeys(getPincode());
		a.savebutton.click();
	System.out.println("New site created successfully");
	    a.closebutton.click();
	    Thread.sleep(2000);
	    a.foreditselectsite.click();
	    a.editbutton.click();
	    a.address.clear();
	    a.address.sendKeys(getChangeadress());
	    a.savebutton.click();
		System.out.println("New site updated successfully");
	    Thread.sleep(2000);
		a.foreditselectsite.click();
	    Thread.sleep(2000);
		a.deletebutton.click();
		a.yesdeletebutton.click();
	    Thread.sleep(2000);
		System.out.println("New site deleted successfully");



	}
	@Test(priority = 3)
	public void WeighbridgeTest() throws IOException, InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(getUrl());
		Service a=new Service(driver);
		a.username.sendKeys(getUsername());
		a.password.sendKeys(getPassword());
		a.loginbutton.click();
		Thread.sleep(3000);
		a.service.click();
		a.weighbridge.click();
		a.editbutton.click();
		a.bridgename.sendKeys(getBridgename());
		a.selectsitedropdown.click();
		Thread.sleep(3000);
		a.selectsitename.click();
		a.mqttype.click();
		a.savebutton.click();
		System.out.println("New weighbridge created successfully");
		
	}
	@Test(priority = 4)
	public void WeighbridgeAllocationTest() throws IOException, InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(getUrl());
		Service a=new Service(driver);
		a.username.sendKeys(getUsername());
		a.password.sendKeys(getPassword());
		a.loginbutton.click();
		Thread.sleep(3000);
		a.service.click();
		a.weighbridgeallocation.click();
		a.editbutton.click();
		a.selectsitedropdown.click();
		Thread.sleep(3000);
		a.selectsitename.click();
		a.selectuserdropdown.click();
		Thread.sleep(3000);
		a.selectusername.click();
		a.selectweighbridgedropdown.click();
		Thread.sleep(3000);
		a.selectweighbridgename.click();
		a.savebutton.click();
		System.out.println("New weighbridge Allocated to user successfully");
	}
}


