package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {

	WebDriver driver = null;
	
	@Given("browser is open")
	public void browser_is_open() {
	    System.out.println("Inside Step- Browser is open");
	    String projPath = System.getProperty("user.dir");
	    System.setProperty("webdriver.chromedriver.exe",projPath + "/src/test/resources/drivers/chromedriver.exe" );
	    driver = new ChromeDriver();
	    
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() {
		System.out.println("Inside Step- User is on google search page");
		driver.get("https://www.google.co.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	}

	@When("user enters a text in search box")
	public void user_enters_a_text_in_search_box() {
		System.out.println("Inside Step- user enters a text in search box");
	}

	@When("hits enter")
	public void hits_enter() {
		System.out.println("Inside Step- User hits enter ");
	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {
		System.out.println("Inside Step- User is navigated to search results");
	}
}
