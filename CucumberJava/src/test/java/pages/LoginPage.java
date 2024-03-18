package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	// POM implementation
//	By txt_username = By.name("username");
//	By txt_pwd = By.name("password");
//	By btn_login = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']");
//	
	//Page Factory implementation
	@FindBy(name = "username")
	WebElement txt_username;
	
	@FindBy(name = "password")
	WebElement txt_pwd;
	
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")
	WebElement btn_login;
	
	// POM implementation
//	public void enterUsername(String uname) {
//		driver.findElement(txt_username).sendKeys(uname);
//	}
//	
//	public void enterPwd(String pwd) {
//		driver.findElement(txt_pwd).sendKeys(pwd);
//		
//	}
//	
//	public void clickLogin() {
//		driver.findElement(btn_login).click();
//	}
	
	//PageFActory implementation
	public void enterUsername(String username) {
		txt_username.sendKeys(username);
	}
	
	public void enterPwd(String pwd) {
		txt_pwd.sendKeys(pwd);
	}
	
	
	public void clickLogin() {
		btn_login.click();
	}
}
