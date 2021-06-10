//package PageFactory;
//
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//
//public class homePage_PF {
//	
//	@FindBy(id="logout")
//	WebElement logout_btn;
//	
//	WebDriver driver;
//	public homePage_PF(WebDriver driver) {
//		this.driver=driver;
//		PageFactory.initElements(driver, this);
//	}
//	
//	public void logoutvalidate() {
//		logout_btn.sendKeys(Keys.ENTER);;
//	}
//
//}
