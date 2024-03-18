package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginStep {

	WebDriver driver =null;
	LoginPage loginPage;
	
	@Given("user is on login page")
	public void verifyLoginPage() {
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			System.out.println("user is on login page");
	}
	
	@When("^user eneters (.*) and (.*)$")
	public void user_eneters_ravindra_and(String username,String password) {
//	    driver.findElement(By.id("email")).sendKeys(username);
//	    driver.findElement(By.id("pass")).sendKeys(password);
		
		loginPage =new LoginPage(driver);
		loginPage.enterUsername(username);
		loginPage.enterPwd(password);
		
	}

//	@When("user eneters ally and {int}")
//	public void user_eneters_ally_and(Integer int1) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}

	@When("user eneter username and password")
	public void user_eneters_username_and_password() {
//		driver.findElement(By.id("email")).sendKeys("ravindra");
//	    driver.findElement(By.id("pass")).sendKeys("12345");
		loginPage.enterUsername("Admin");
		loginPage.enterPwd("admin123");
		
		System.out.println("inside step--user eneters username and password");
	}

	@When("clicks on login button")
	public void clicks_on_login_button() {
//		driver.findElement(By.xpath("//button[@name='login']")).click();
		System.out.println("inside step--clicks on login button");
		loginPage.clickLogin();
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		System.out.println("inside step--user is navigated to the home page");
	}
}
