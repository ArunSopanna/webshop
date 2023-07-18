package object_repository;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Login {
	public  Login(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Log in' and @class=\"nav-v2-dynamic__login\"]")
	private WebElement login;
	
	@FindBy(id="login")
	private WebElement username;
	
	@FindBy(id="password")
	private WebElement pwd;

	public WebElement getLogin() {
		return login;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPwd() {
		return pwd;
	}
	
	

}
