//package StepDefinitions;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import io.grpc.Context.Key;
//
//public class GoogleSearchSteps {
//	
//	WebDriver driver = null;
//
//	@Given("browser is open")
//	public void browser_is_open() {
//		
//		String path = System.getProperty("user.dir");
//		System.setProperty("webdriver.chrome.driver", path+"/src/test/resource/Drivers/chromedriver.exe" );
//		
//		System.out.println("Browser is open");
//		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		
//	}
//
//	@And("user is on google search page")
//	public void user_is_on_google_search_page() {
//		System.out.println("user is on google search page");
//		driver.navigate().to("http://googl.com");
//	}
//
//	@When("user enter text on search box")
//	public void user_enter_text_on_search_box() {
//		System.out.println("user entered text");
//		driver.findElement(By.name("q")).sendKeys("Automation step by step");
//	}
//
//	@And("hits enter")
//	public void hits_enter() {
//		System.out.println("user hit search button");
//		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
//	}
//
//	@Then("user is navigate to search results")
//	public void user_is_navigate_to_search_results() throws Exception {
//		System.out.println("user navigate to search page");
//		driver.getPageSource().contains("Online courses");
//		Thread.sleep(3000);
//		
//		driver.quit();
//	}
//   
//
//}
//
