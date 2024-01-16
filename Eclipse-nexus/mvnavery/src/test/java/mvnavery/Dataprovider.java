package mvnavery;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
@Test(dataProvider="dataset")
public class Dataprovider 
{
	public  void test(String username, String password ) 
	{
	System.out.print(username);	
	}

	@DataProvider
	public void dataset()
	{
		Object[][] dataset= new Object[0][1];
		dataset[0][0]="user1";
		dataset[0][1]="pass1";
	}
}
