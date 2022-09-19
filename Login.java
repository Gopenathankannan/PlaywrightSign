package playwright;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

import io.github.bonigarcia.wdm.WebDriverManager;




public class Login {

	@Test
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		Playwright pw = Playwright.create();
		 
		Browser browser = pw.chromium().launch(
				
				new BrowserType.LaunchOptions()
				.setChannel("chrome")
				.setHeadless(false));
		
		Page newpage = browser.newPage();
		
		newpage.navigate("https://testpwa.ziffity.com/");
		
		newpage.locator("//input[@id='email']/preceding::a[contains(text(),'Sign In')][2]").click();
		
		newpage.locator("#email").type("Gopenathan.kannan@ziffity.com");
		newpage.locator("//input[@id='pass']").type("Ziffity@123");
		
		
				
				
				
		
		
		
		
		
	//WebDriverManager.chromedriver().setup();
//		String driverpath = System.getProperty("webdriver.chrome.driver");
//	System.out.println(driverpath);
//		
//		ChromeDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		
//		//Launch the browser
//		driver.get("https://testpwa.ziffity.com/");
//		//driver.get("https://www.travers.com");
//		
		/*
		 * 
		 * Use creating methods then use with send keys
		 */
		
	}
	
	

}
