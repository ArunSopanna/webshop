package dribbble;

import org.testng.annotations.Test;

import genrick_libries.Base_Class;

public class TC_01_Test extends Base_Class{
	@Test
	public static  void tc_01()
	{
		login.getLogin().click();
		login.getUsername().sendKeys("Arun");
     	login.getPwd().sendKeys("Arun@123");
	

	}
	
}
