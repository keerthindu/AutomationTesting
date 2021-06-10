//package StepDefinitions;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import pages.loginPage;
//
//public class LoginSteps_POM {
//	
//	WebDriver driver = null;
//	loginPage login;//constructor
//	
//	@Given("Broswe is open")
//	public void broswe_is_open() {
//		
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
//		
//	    String title = driver.getTitle();
//	    System.out.println("Login page title is" +title);
//		
//	}
//
//	@When("^enter (.*) and (.*)$")
//	public void enter_user_name_and_password(String username, String password) throws Exception {
//		
//		login=new loginPage(driver);
//		
//		login.enterUsername(username);
//		login.enterpwd(password);
//		
//		//driver.findElement(By.id("name")).sendKeys(username);
//		//driver.findElement(By.id("password")).sendKeys(password);
//		System.out.println("Enter credential successfully");
//		
//		Thread.sleep(3000);
//	    
//	}
//	
//	@And("Clicks on submit button")
//	public void clicks_on_submit_button() {
//		
//		login.clicklogin();
//	   //driver.findElement(By.id("login")).sendKeys(Keys.ENTER);
//	   System.out.println("User enter login button");
//	    
//	}
//
//	@Then("user is entered into home page")
//	public void user_is_entered_into_home_page() throws Exception {
//		String title = driver.getTitle();
//		System.out.println("home page title is " +title);
//		
//		login.logout();
//		//driver.findElement(By.id("logout")).isDisplayed();
//		
//		Thread.sleep(3000);
//		
//		driver.quit();
//	    
//	}
//
//	
//
//}
