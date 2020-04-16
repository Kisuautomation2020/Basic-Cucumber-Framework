package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {

	WebDriver driver;

	@Given("^user is alreay on Login Page$")
	public void user_alreay_on_login_page() {

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
	public void user_enters_username_and_password() {
		driver.findElement(By.name("username")).sendKeys("shwetap");
		driver.findElement(By.name("password")).sendKeys("shweta@123");
		
	}

	@Then("^user clicks on Login button$")
	public void user_clicks_on_Login_button()  {
		WebElement loginBtn=driver.findElement(By.xpath("//input[@type='submit']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", loginBtn);   // login button gives error sometimes , so we used JavascriptExecutor for it

	}
	
	@Then("^user is on home page$")
	public void user_is_on_home_page()  {
		String title=driver.getTitle();
		System.out.println("Home page title is  ::" + title);
		Assert.assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support.", title);
	}
	
	@Then("^close the browser$")
	public void close_the_browser()  {
	   driver.quit();
	}
}