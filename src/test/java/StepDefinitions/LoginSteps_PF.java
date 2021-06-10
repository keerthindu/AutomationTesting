//package StepDefinitions;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import PageFactory.homePage_PF;
//import PageFactory.loginPage_PF;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class LoginSteps_PF {
//	
//	WebDriver driver = null;
//	loginPage_PF login;
//	homePage_PF home;
//	
//	@Given("Broswe is open")
//	public void broswe_is_open() {
//		System.out.println("======I am inside page factory class======");
//		String path = System.getProperty("user.dir");
//		System.setProperty("webdriver.chrome.driver",path+"/src/test/resource/Drivers/chromedriver.exe" );
//		
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.navigate().to("https://example.testproject.io/web/");
//		System.out.println("User navigated into login page");
//		  
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//	    String title = driver.getTitle();
//	    System.out.println("Login page title is" +title);
//		
//	}
//
//	@When("^enter (.*) and (.*)$")
//	public void enter_user_name_and_password(String username, String password) {
//		
//		login= new loginPage_PF(driver);
//		
//		login.enterusername(username);
//		login.enterpwd(password);
//		
//		System.out.println("Enter credential successfully");
//	    
//	}
//	
//	@And("Clicks on submit button")
//	public void clicks_on_submit_button() {
//		
//       login.clicklogin();
//		
//	   System.out.println("User enter login button");
//	    
//	}
//
//	@Then("user is entered into home page")
//	public void user_is_entered_into_home_page() throws Exception {
//		home= new homePage_PF(driver);
//		home.logoutvalidate();
//		String title = driver.getTitle();
//		System.out.println("home page title is " +title);
//		
//		
//		Thread.sleep(3000);
//		driver.close();
//		driver.quit();
//	    
//	}
//
//	
//
//}
