package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Service {
	public Service(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@id='username']")
	public WebElement username;
	@FindBy(xpath="//input[@id='password']")
	public WebElement password;
	@FindBy(xpath="//button[@type='submit']")
	public WebElement loginbutton;
	@FindBy(xpath="//button[@class='button-service']")
	public WebElement service;
	@FindBy(xpath="//button[.='Customer']")
	public WebElement customer;
	@FindBy(xpath="//button[@class='button-edit button-tooltip']")
	public WebElement editbutton;
	@FindBy(xpath="//button[@class='button-save button-tooltip']")
	public WebElement savebutton;
	@FindBy(xpath="//input[@id='name']")
	public WebElement name;
	@FindBy(xpath="//input[@id='address']")
	public WebElement address;
	@FindBy(xpath="//input[@id='mobile']")
	public WebElement contactno;
	@FindBy(xpath="//input[@id='email']")
	public WebElement emailid;
	@FindBy(xpath="//input[@type='checkbox']")
	public WebElement statuscheckbox;
	@FindBy(xpath="//td[.='New custom']")
	public WebElement foreditselectcustomername;
	@FindBy(xpath="//button[@class='button-delete button-tooltip']")
	public WebElement deletebutton;
	@FindBy(xpath="(//button[@class='h-[40px] py-4 px-6 rounded border-2 border-black bg-gradient-to-b from-black via-gray-400 to-black text-white flex justify-center items-center font-semibold mr-2'])[2]")
	public WebElement yesdeletebutton;
	@FindBy(xpath="//button[.='Site']")
	public WebElement site;
	@FindBy(xpath="//input[@id='sitename']")
	public WebElement sitename;
	@FindBy(xpath="//input[@id='siteprefix']")
	public WebElement siteprefix;
	@FindBy(xpath="//select[@id='customer']")
	public WebElement selectcustomer;
	@FindBy(xpath="//option[.='customnew']")
	public WebElement selectcustomername;
	@FindBy(xpath="//input[@id='pincode']")
	public WebElement pincode;
	@FindBy(xpath="//button[.='Weighbridge']")
	public WebElement weighbridge;
	@FindBy(xpath="//input[@id='bridgename']")
	public WebElement bridgename;
	@FindBy(xpath="//select[@id='site']")
	public WebElement selectsitedropdown;
	@FindBy(xpath="//option[.='sitenew']")
	public WebElement selectsitename;
	@FindBy(xpath="//td[.='Newsite']")
	public WebElement foreditselectsite;
	@FindBy(xpath="//input[@id='mqtt']")
	public WebElement mqttype;
	@FindBy(xpath="//input[@id='tcp']")
	public WebElement tcp;
	@FindBy(xpath="//button[.='Weighbridge Allocation']")
	public WebElement weighbridgeallocation;
	@FindBy(xpath="//select[@id='user']")
	public WebElement selectuserdropdown;
	@FindBy(xpath="//option[.='usernew']")
	public WebElement selectusername;
	@FindBy(xpath="//select[@id='weighbridge']")
	public WebElement selectweighbridgedropdown;
	@FindBy(xpath="//option[.='blr123-newbridge']")
	public WebElement selectweighbridgename;
	@FindBy(xpath="//button[@class='close-btn']")
	public WebElement closebutton;
	//configure module
	@FindBy(xpath="//button[@class='button-configure']")
	public WebElement configure;
	@FindBy(xpath="//button[.='Users']")
	public WebElement users;
	@FindBy(xpath="//select[@id='role']")
	public WebElement selectroledropdown;
	@FindBy(xpath="//option[.='site manager']")
	public WebElement selectrolename;
	@FindBy(xpath="//td[@class='whitespace-nowrap px-6 py-4 border-r-2 border-b-2 border-blue-300']")
	public WebElement selectuserfordelete;
	@FindBy(xpath="//button[.='General Titles']")
	public WebElement general_titles;
	@FindBy(xpath="//button[.='General Configuration Settings']")
	public WebElement general_configuration_setting;
	@FindBy(xpath="//button[.='Change Field Names']")
	public WebElement change_field_name;
	@FindBy(xpath="//button[.='Print Formats']")
	public WebElement print_formats;
	@FindBy(xpath="//button[.='Print Manager Configuration']")
	public WebElement print_manager_configuration;
	@FindBy(xpath="//button[.='FOIS Log on Parameters']")
	public WebElement fois_log_on_parameters;
	@FindBy(xpath="//button[.='Change Password']")
	public WebElement changepassword;
	@FindBy(xpath="//input[@id='old_password']")
	public WebElement oldpassword;
	@FindBy(xpath="//input[@id='new_password']")
	public WebElement newpassword;
	@FindBy(xpath="//input[@id='re_enter_new_password']")
	public WebElement re_enterpassword;
	//weigh module
	@FindBy(xpath="//button[@class='button-weigh']")
	public WebElement weigh;
	@FindBy(xpath="//button[.=' Select Weighbridge ']")
	public WebElement select_weighbridge_option;
	@FindBy(xpath="//button[.=' Weighing ']")
	public WebElement weighing;
	@FindBy(xpath="//button[@class='text-green-800 border border-green-800 text-lg rounded py-2 px-8 mt-4 flex items-center']")
	public WebElement select_weighbridge_checkbox;
	@FindBy(xpath="//button[.='Start Weighing']")
	public WebElement start_weighing_button;
	@FindBy(xpath="//button[.='Stop Weighing']")
	public WebElement stop_weighing_button;
	@FindBy(xpath="//button[.='Clear']")
	public WebElement clear_button;
	@FindBy(xpath="//button[.='Weighing History']")
	public WebElement weighing_history;
	@FindBy(xpath="//button[.='FOIS Transaction']")
	public WebElement fois_transaction;
	//Dashboard module
	@FindBy(xpath="//button[@class='button-dashboard']")
	public WebElement dashboard;
	// Report module
	@FindBy(xpath="//button[@class='button-report']")
	public WebElement report;
	@FindBy(xpath="//button[.='Transaction Report']")
	public WebElement transaction_report;
	@FindBy(xpath="//button[.='Error Log Report Export']")
	public WebElement Eroor_log_report_export;
	@FindBy(xpath="//button[.='Calibration Reports']")
	public WebElement calibration_reports;
	@FindBy(xpath="//button[.='User Log in Reports']")
	public WebElement user_login_reports;
	//Diagnostics
	@FindBy(xpath="//button[@class='button-diagnostic']")
	public WebElement diagnostics;
	@FindBy(xpath="//button[.=' Instrumentation Test ']")
	public WebElement insrtumentation_test;
	@FindBy(xpath="//button[.=' Track Switch Test ']")
	public WebElement trackswitch_test;
	@FindBy(xpath="//button[.='Advanced Signal Test']")
	public WebElement advancedsignal_test;
	//Master module
	@FindBy(xpath="//button[@class='button-master']")
	public WebElement master;
	@FindBy(xpath="//button[.='Product File']")
	public WebElement product_file;
	@FindBy(xpath="//input[@id='code']")
	public WebElement code;
	@FindBy(xpath="//input[@id='originator_code']")
	public WebElement originator_code;
	@FindBy(xpath="//input[@id='originator_name']")
	public WebElement originator_name;
	@FindBy(xpath="//input[@id='originator_address']")
	public WebElement originator_address;
	@FindBy(xpath="//button[.='Originator File']")
	public WebElement originator_file;
	@FindBy(xpath="//button[.='Destination File']")
	public WebElement destination_file;
	@FindBy(xpath="//input[@id='destination_code']")
	public WebElement destination_code;
	@FindBy(xpath="//input[@id='destination_name']")
	public WebElement destination_name;
	@FindBy(xpath="//input[@id='destination_address']")
	public WebElement destination_address;
	@FindBy(xpath="//button[.='Rake Wagon Entry']")
	public WebElement rakewagon_entry;
	@FindBy(xpath="//button[.='Net Weigh Transaction Tkt']")
	public WebElement netweigh_transactiontkt;
	@FindBy(xpath="//button[.='Wagon Type Details']")
	public WebElement wagon_type_details;
	@FindBy(xpath="//input[@id='phone_no']")
	public WebElement phoneno;
	@FindBy(xpath="//input[@id='phone_no']")
	public WebElement faxno;
	@FindBy(xpath="//input[@placeholder='Search']")
	public WebElement search_rakeno;
	@FindBy(xpath="//button[.='Search Rake']")
	public WebElement search_rakebutton;
	@FindBy(xpath="//button[.='Filter']")
	public WebElement filter_button;
	@FindBy(xpath="//div[@class='toggle-container']")
	public WebElement toggle_button;
	
	
	
	
	
	
	
	
	
	
	
	

}
