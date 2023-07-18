package genrick_libries;

import java.io.File;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import object_repository.Discover;
import object_repository.Login;
import object_repository.SignUp;


public class Base_Class {
	
   public static  WebDriver driver;
    public static PropertyUtility ppt;
    public static Login login;
    public static SignUp signup;
    public static Discover discover;
    @BeforeClass
	public void main() throws FileNotFoundException
	{

		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		//WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		ppt=new PropertyUtility();
		driver.get(ppt.readingData("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		login=new Login(driver);
		signup=new SignUp(driver);
		discover=new Discover(driver);	
	}
    @AfterClass
    public void main1() throws IOException, InterruptedException
    {
    	
    	JavascriptExecutor js=(JavascriptExecutor)driver;
    	js.executeScript("window.scrollBy(0,20000)");
    	TakesScreenshot ts=(TakesScreenshot) driver;
    	File src=ts.getScreenshotAs(OutputType.FILE);
    	File dest=new File("./screenshot/buble.png");
    	FileUtils.copyFile(src,dest);
    	Thread.sleep(2000);
    }
}
