package Testcases;

import org.testng.annotations.Test;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.TdHome;
import Resources.BaseClass;
import org.openqa.selenium.WebDriver;
public class Tdtest extends BaseClass {
	
@Test

public void basetest () throws IOException {
	
//driver = initializeDriver()	;
WebDriver	driver=new ChromeDriver();	
//prop = propertiesclass();
//driver.get(prop.getProperty("Url"));
driver.get("https://www.td.com/us/en/personal-banking");
TdHome tdHach = new TdHome(driver);

//verify logodisplayed

Assert.assertTrue(tdHach.logo().isDisplayed());
System.out.println("logo displad");

Assert.assertTrue(tdHach.smallbusniess().isDisplayed());
System.out.println("smallbusiness");
}



}
