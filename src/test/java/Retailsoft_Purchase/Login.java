package Retailsoft_Purchase;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.winium.WiniumDriver;

public class Login {

WiniumDriver driver;
	
	By companyenter=By.id("txtCompany");
	By companysearch=By.id("TxtSerach");
	By companysearchtext=By.id("TxtSerach");
	By selectcompany=By.name("MAHAVIR GHAR SANSAR PVT LTD");
	By username=By.id("txtUserName");
	By password=By.id("txtPassword");
	By FinYear=By.id("FinancialYear");
	By checkboxlog=By.id("ckbkeeplog");
	By loginbtn=By.id("btnLogin");
	//By menudisplay=By.name("Sales Module");
	
	public void applogin(WiniumDriver driver) {
		
		this.driver = driver;
	}
	//String strCompany,
	public void loginintoapp(String strCompany, String strUsername, String strPassword) throws InterruptedException {
		
		
		Actions company = new Actions(driver);
		WebElement Cmpny_LOV = driver.findElement(companyenter);
		company.contextClick(Cmpny_LOV).perform();
		
		driver.findElement(companysearch).click();
		driver.findElement(companysearchtext).sendKeys(strCompany);
		
		Actions select_company = new Actions(driver);
		WebElement Select_Cmpny = driver.findElement(selectcompany);
		select_company.doubleClick(Select_Cmpny).perform();
		
		driver.findElement(username).sendKeys(strUsername);
		driver.findElement(password).sendKeys(strPassword);
		
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		  //get current date time with Date()
		 Date date = new Date();
		 // Now format the date
		String date1= dateFormat.format(date);
		driver.findElement(FinYear).sendKeys(date1);
		
		driver.findElement(checkboxlog).click();
		driver.findElement(loginbtn).click();
		Thread.sleep(3000);
		
		//String menu = driver.findElement(menudisplay).getText();
		//Assert.assertEquals(menu, "Sales Module");

	}
	//String strCompany,
	public void mainLogin(String strCompany, String strUsername, String strPassword) throws InterruptedException {
		
		this.loginintoapp(strCompany, strUsername, strPassword);
	//	strCompany,
	}
	
	
}
