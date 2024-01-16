import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webDriver.chrome.driver","C:\\browserdrivers\\chromedriver.exe");
		
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.google.com/");

	}

}
