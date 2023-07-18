package object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUp {
     public SignUp(WebDriver driver)
     {
    	 PageFactory.initElements(driver, this);
     }
	
	
	@FindBy(xpath="//a[text()='Sign up']")
	private WebElement signup;
	
	@FindBy(xpath="//button[@class=\"btn2 btn2--large btn2--tertiary btn2--full-width margin-t-20 margin-b-40 \"]")
	private WebElement signupwithemail;
	
	public WebElement getSignupwithemail() {
		return signupwithemail;
	}


	@FindBy(id="user_name")
	private WebElement username;
	
	@FindBy(name="user[login]")
	private WebElement username1;
	
	@FindBy(id="user_email")
	private WebElement email;
	
	@FindBy(id="user_password")
	private WebElement emailpwd;
	
	@FindBy(id="user_agree_to_terms")
	private WebElement useragree;

	public WebElement getSignup() {
		return signup;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getUsername1() {
		return username1;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getEmailpwd() {
		return emailpwd;
	}

	public WebElement getUseragree() {
		return useragree;
	}
	
}
