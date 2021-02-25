package Retailsoft.Retailsoft;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoadApp {

	
	//driver declared for execution
			WiniumDriver driver;
			
			@BeforeTest
			public void loadapp() throws MalformedURLException, InterruptedException {
				
			//assign application path and driver path to load diver and application
				
				DesktopOptions option=new DesktopOptions();
				option.setApplicationPath("D:\\Retailsoft\\RetailSoft.exe");
				driver=new WiniumDriver (new URL("http://localhost:9999"), option);
				
				Thread.sleep(3000);	
			}
			
			//login with valid user details
			
			@Test(priority=0)
			public void loginTest() throws InterruptedException {
				
					Login obj=new Login();
					obj.applogin(driver);
					obj.mainLogin("MAHAVIR GHAR SANSAR PVT LTD", "admin", "sam@1718");
				//	"MAHAVIR GHAR SANSAR PVT LTD", 
			}



}
	

