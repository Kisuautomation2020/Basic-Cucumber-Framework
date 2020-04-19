package stepDefinitions;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

//data table with maps:for parameterization  of test cases

public class DealsStepWithMapDefinition {
	WebDriver driver;

	@Given("^user is already on Login Page$")
	public void user_is_already_on_Login_Page() {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.crmpro.com/");

	}
	
	@When("^title of Login page is Free CRM$")
	public void title_of_login_page_is_free_CRM() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support.", title);

	}
	
	@Then("^user enters username and password$")
	public void user_enters_username_and_password(DataTable credentials) {
		// here we use map object for Data Table class    --> map is a interface 
		for(Map <String, String> data :credentials.asMaps(String.class, String.class)) { 
		
		driver.findElement(By.name("username")).sendKeys(data.get("username")); 
		driver.findElement(By.name("password")).sendKeys(data.get("password")); 
		
		}
	}

	@Then("^user clicks on Login button$")
	public void user_clicks_on_Login_button() {
		WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", loginBtn); // login button gives error sometimes , so we used
		// JavascriptExecutor for it
	}
	
	@Then("^user is on home page$")
	public void user_is_on_home_page() {
		String title = driver.getTitle();
		System.out.println("Home page title is  ::" + title);
		Assert.assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support.", title);
	}
	
	@Then("^user moves to new deal page$")
	public void user_moves_to_new_contact_page() {

		driver.switchTo().frame("mainpanel");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
		driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();

	}
	
	@Then("^user enters deal details$")
	public void user_enters_contacts_details(DataTable dealData) {
		
		// use map as object in for loop for enter the data from data table with it's header/titles
		
		for(Map <String, String> dealValues :dealData.asMaps(String.class, String.class)) { 
			
			driver.findElement(By.id("title")).sendKeys(dealValues.get("title"));
			driver.findElement(By.id("amount")).sendKeys(dealValues.get("amount"));
			driver.findElement(By.id("probability")).sendKeys(dealValues.get("probability"));
			driver.findElement(By.id("commission")).sendKeys(dealValues.get("commission"));
			
			driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click(); //save button
			
			//move to new deal page:
			Actions action = new Actions(driver);
			action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
			driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
			
			}
	}
	@Then("^close the browser$")
	public void close_the_browser() {
		driver.quit();
	}

}
