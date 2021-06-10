package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
	
	WebDriver driver = null;
	
	By txt_username=By.id("name");
	
	By txt_pwd =By.id("password");
	
	By btn_login = By.id("login");
	
	By btn_logout = By.id("logout");
	
	public loginPage(WebDriver driver) {
		this.driver =driver;
		
	}
	
	public void enterUsername(String username) {
		
		driver.findElement(txt_username).sendKeys(username);
		
	}
	
	public void enterpwd(String password) {
		
		driver.findElement(txt_pwd).sendKeys(password);
	}
	
	public void clicklogin() {
		driver.findElement(btn_login).click();
	}

	
	
	
	public void logout() {
		driver.findElement(btn_logout).click();
	}
}
