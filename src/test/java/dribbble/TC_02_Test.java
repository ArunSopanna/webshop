package dribbble;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import genrick_libries.Base_Class;
@Test
public class TC_02_Test extends Base_Class{
	
	public void tc2() throws InterruptedException
	{
		Thread.sleep(7000);
		signup.getSignup().click();
		Thread.sleep(5000);
		//signup.getSignupwithemail().click();
		signup.getUsername().sendKeys("Arun");
		signup.getUsername1().sendKeys("Arun Sopanna");
		signup.getEmail().sendKeys("arunsopanan@gmail.com");
		signup.getEmailpwd().sendKeys("Arun");
		signup.getUseragree().click();
		
	}
}