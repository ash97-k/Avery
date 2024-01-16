package mvnavery;

import static util.ConfigReader.getNewpassword;
import static util.ConfigReader.getPassword;
import static util.ConfigReader.getUrl;
import static util.ConfigReader.getUsername;
import static util.ConfigReader.getSitemanagerusername;
import static util.ConfigReader.getAddress;
import static util.ConfigReader.getPhoneno;
import static util.ConfigReader.getFaxno;
import static util.ConfigReader.getCode;
import static util.ConfigReader.getEmailId;
import static util.ConfigReader.getOriginatorcode;
import static util.ConfigReader.getOriginatorname;
import static util.ConfigReader.getOriginatoraddress;
import static util.ConfigReader.getDestinationcode;
import static util.ConfigReader.getDestinationname;
import static util.ConfigReader.getDestinationaddress;



import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pom.Service;

public class Masters {
//	@Test(priority = 1)
//	public void ProductfileTest() throws IOException, InterruptedException
//	{
//		WebDriverManager.chromedriver().setup();
//		ChromeDriver driver =new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get(getUrl());
//		Service a=new Service(driver);
//		a.username.sendKeys(getSitemanagerusername());
//		a.password.sendKeys(getPassword());
//		a.loginbutton.click();
//		Thread.sleep(3000);
//        a.master.click();
//        a.product_file.click();
//        a.editbutton.click();
//        a.code.sendKeys(getCode());
//        a.name.sendKeys(getUsername());
//        a.savebutton.click();
//        a.closebutton.click();
//	
//}
//	@Test(priority = 2)
//	public void OriginatorfileTest() throws IOException, InterruptedException
//	{
//		WebDriverManager.chromedriver().setup();
//		ChromeDriver driver =new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get(getUrl());
//		Service a=new Service(driver);
//		a.username.sendKeys(getSitemanagerusername());
//		a.password.sendKeys(getPassword());
//		a.loginbutton.click();
//		Thread.sleep(3000);
//        a.master.click();
//        a.originator_file.click();
//        a.editbutton.click();
//        a.originator_code.sendKeys(getOriginatorcode());
//        a.originator_name.sendKeys(getOriginatorname());
//        a.originator_address.sendKeys(getOriginatoraddress());
//        a.phoneno.sendKeys(getPhoneno());
//        a.faxno.sendKeys(getFaxno());
//        a.emailid.sendKeys(getEmailId());
//        a.savebutton.click();
//       
//	
//}
	@Test(priority = 3)
	public void DestinationfileTest() throws IOException, InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(getUrl());
		Service a=new Service(driver);
		a.username.sendKeys(getSitemanagerusername());
		a.password.sendKeys(getPassword());
		a.loginbutton.click();
		Thread.sleep(3000);
        a.master.click();
        a.destination_file.click();
        a.editbutton.click();
        a.destination_code.sendKeys(getDestinationcode());
        a.destination_name.sendKeys(getDestinationname());
        a.destination_address.sendKeys(getDestinationaddress());
        a.phoneno.sendKeys(getPhoneno());
        Thread.sleep(3000);
        a.faxno.sendKeys(getFaxno());
        a.emailid.sendKeys(getEmailId());
        a.savebutton.click();
       
	
}
}
