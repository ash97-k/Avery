package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;



public class ConfigReader {

	public static Properties getPropertyObject() throws IOException{
		FileInputStream fp = new FileInputStream("config\\config.properties");
				
		Properties prop= new Properties();
		prop.load(fp);
		return prop;
		
	}
	public static String getUrl() throws IOException {
	
return getPropertyObject().getProperty("url");
	}
	public static String getUsername() throws IOException {
		
		return getPropertyObject().getProperty("username");
			}
   public static String getPassword() throws IOException
   {
	return getPropertyObject().getProperty("password");
	   
   }
   public static String getCustomername() throws IOException
   {
	return getPropertyObject().getProperty("name");
	   
   }
   public static String getAddress() throws IOException
   {
	return getPropertyObject().getProperty("address");
	   
   }
   public static String getContactNo() throws IOException
   {
	return getPropertyObject().getProperty("contactno");
	   
   }
   public static String getEmailId() throws IOException
   {
	return getPropertyObject().getProperty("emailid");
	   
   }
   public static String getSitename() throws IOException
   {
	return getPropertyObject().getProperty("sitename");
	   
   }
   public static String getSiteprefix() throws IOException
   {
	return getPropertyObject().getProperty("siteprefix");
	   
   }
   public static String getPincode() throws IOException
   {
	return getPropertyObject().getProperty("pincode");
	   
   }
   public static String getChangeadress() throws IOException
   {
	return getPropertyObject().getProperty("changeaddress");
	   
   }
   public static String getBridgename() throws IOException
   {
	return getPropertyObject().getProperty("bridgename");
	   
   }
   public static String getNewcontactno() throws IOException
   {
	return getPropertyObject().getProperty("newcontactno");
	   
   }
	
   public static String getUsername1() throws IOException
   {
	return getPropertyObject().getProperty("username1");
	   
   }
   public static String getUsername2() throws IOException
   {
	return getPropertyObject().getProperty("username2");
	   
   }
   public static String getupdateusername() throws IOException
   {
	return getPropertyObject().getProperty("updateusername");
	   
   }
   public static String getNewpassword() throws IOException
   {
	return getPropertyObject().getProperty("newpassword");
	   
   }
   public static String getSitemanagerusername() throws IOException
   {
	return getPropertyObject().getProperty("sitemanager_username");
   }

   public static String getPhoneno() throws IOException
   {
	return getPropertyObject().getProperty("phoneno");
	   
   }
   public static String getFaxno() throws IOException
   {
	return getPropertyObject().getProperty("faxno");
	   
   }
   public static String getCode() throws IOException
   {
	return getPropertyObject().getProperty("code");
	   
   }
   public static String getOriginatorcode() throws IOException
   {
	return getPropertyObject().getProperty("originator_code");
	   
   }
   public static String getOriginatorname() throws IOException
   {
	return getPropertyObject().getProperty("originator_name");
	   
   }
   public static String getOriginatoraddress() throws IOException
   {
	return getPropertyObject().getProperty("originator_address");
	   
   }
   public static String getDestinationcode() throws IOException
   {
	return getPropertyObject().getProperty("destination_code");
	   
   }
   public static String getDestinationname() throws IOException
   {
	return getPropertyObject().getProperty("destination_name");
	   
   }
   public static String getDestinationaddress() throws IOException
   {
	return getPropertyObject().getProperty("destination_address");
	   
   }
}
