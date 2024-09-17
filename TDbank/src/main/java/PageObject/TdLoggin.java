package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TdLoggin {
	
WebDriver driver;	

public TdLoggin(WebDriver driver) {
this.driver=driver;
}
By username=By.xpath("//input[@id='psudoUsername']");
	
By pwd=By.xpath("//input[@id='password']");	
	

public WebElement username() {
	
	return driver.findElement(username);	

}

public WebElement pwd() {
	
	return driver.findElement(pwd);	

}

}


