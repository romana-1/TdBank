package Testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.TdHome;
import PageObject.TdLoggin;
import Resources.BaseClass;

public class Test2 extends BaseClass{
@Test
public void basetest () throws IOException {

driver= initializeDriver();	
prop =  propertiesClass();
driver.get(prop.getProperty("Url"));
TdHome tdHach = new TdHome(driver);

//verify logodisplayed

Assert.assertTrue(tdHach.logo().isDisplayed());
System.out.println("logo displad");

Assert.assertTrue(tdHach.smallbusniess().isDisplayed());
System.out.println("smallbusiness");

Assert.assertTrue(tdHach.login().isDisplayed());
System.out.println("login displad");
tdHach.login().click();

TdLoggin log=new TdLoggin(driver);

log.username().sendKeys("lina");

log.pwd().sendKeys("1234");


}
}
