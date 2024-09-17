package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TdHome {
	
public WebDriver driver;
public TdHome(WebDriver driver) {
	this.driver = driver;
	
}
By logo = By.xpath("//*[@id=\"container-12ee37eb01\"]/div[2]/div/div/div[1]/div/a/img");

By smallbusniess = By.xpath("//a[text()=\"Small Business\"]");

By login = By.xpath("//*[@id=\"button-37fbca6eb5\"]/span[2]");


public WebElement logo() {
	
	return driver.findElement(logo);
}

public WebElement smallbusniess() {
	
	return driver.findElement(smallbusniess);
}
	
	public WebElement login() {
		
		return driver.findElement(login);	
	
}
}
