//package PageFactory;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//
//public class loginPage_PF {
//	
//	@FindBy(id="name")
//	WebElement txt_username;
//	
//	@FindBy(id="password")
//	WebElement txt_pwd;
//
//	
//	@FindBy(id="login")
//	WebElement btn_login;
//	
//	
//	WebDriver driver;
//	
//	public loginPage_PF(WebDriver driver) {
//		
//		this.driver=driver;
//		
//		PageFactory.initElements(driver,this);
//		
//	}
//
//	public void enterusername(String name) {
//		txt_username.sendKeys(name);
//	}
//	
//	public void enterpwd(String password) {
//		txt_pwd.sendKeys(password);
//	}
//	
//	public void clicklogin() {
//		btn_login.click();
//	}
//}
