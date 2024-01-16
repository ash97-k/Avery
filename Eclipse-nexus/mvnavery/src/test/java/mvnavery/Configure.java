package mvnavery;

import static util.ConfigReader.getPassword;
import static util.ConfigReader.getUrl;
import static util.ConfigReader.getUsername;
import static util.ConfigReader.getUsername1;
import static util.ConfigReader.getUsername2;
import static util.ConfigReader.getupdateusername;
import static util.ConfigReader.getNewpassword;


import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pom.Service;

public class Configure {

//	@Test(priority = 1)
//	public void UsersTest() throws IOException, InterruptedException
//	{
//		WebDriverManager.chromedriver().setup();
//		ChromeDriver driver =new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get(getUrl());
//		Service a=new Service(driver);
//		a.username.sendKeys(getUsername());
//		a.password.sendKeys(getPassword());
//		a.loginbutton.click();
//		Thread.sleep(3000);
//        a.configure.click();
//        a.users.click();
//        a.editbutton.click();
//        a.name.sendKeys(getUsername1());
//        a.username.sendKeys(getUsername2());
//        a.selectroledropdown.click();
//		Thread.sleep(3000);
//
//        a.selectrolename.click();
//        a.password.sendKeys(getPassword());
//        a.selectsitedropdown.click();
//		Thread.sleep(3000);
//        a.selectsitename.click();
//        a.savebutton.click();
//		Thread.sleep(3000);
//		System.out.println("New User created successfully");
//        a.closebutton.click();
//        a.selectuserfordelete.click();
//        a.editbutton.click();
//        a.username.clear();
//        a.username.sendKeys(getupdateusername());
//        a.savebutton.click();
//        System.out.println("New User updated successfully");
//		Thread.sleep(3000);
//        a.selectuserfordelete.click();
//        a.deletebutton.click();
//        a.yesdeletebutton.click();
//        System.out.println("New User deleted successfully");
//}
	@Test(priority = 2)
	public void ChangepasswordTest() throws IOException, InterruptedException
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
        a.configure.click();
        a.changepassword.click();
        a.oldpassword.sendKeys(getPassword());
        a.newpassword.sendKeys(getNewpassword());
        a.re_enterpassword.sendKeys(getNewpassword());
	
}
}
